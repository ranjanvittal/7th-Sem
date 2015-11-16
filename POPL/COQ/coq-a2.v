
(* You are NOT allowed to bring in verbatim some theorems and/or declarations from the book *) 

(* Question 1 *)
(*Prove the Progress Lemma for the language with the following grammar.

 e :=  car e | cdr e  | cons e1 e2 | isnull e
    | if (e0) e1 e2 | '() | false | true


Assume 1. cdr '() returns '(), and car '() returns false. 
2. two allowed types in the program: boolean list and boolean. 
3. cons required that the first argument is boolean and the second argument is a list of booleans.


Hint: State coq rules for small step semantics, type inference rules, and then use them to prove the progress lemma.*)

Inductive tm :=
  | tcar : tm -> tm
  | tcdr : tm -> tm
  | tcons : tm -> tm -> tm
  | tisnull : tm -> tm
  | tif : tm -> tm -> tm -> tm
  | tnil : tm
  | tfalse : tm
  | ttrue : tm.

Reserved Notation "t1 '==>' t2" (at level 40).

Inductive bval : tm -> Prop :=
  | bv_true : bval ttrue
  | bv_false : bval tfalse.

Inductive lval : tm -> Prop :=
  | lv_nil : lval tnil
  | lv_cons : forall t t1, lval t -> lval (tcons t1 t).

Definition val(t : tm) := bval t \/ lval t.

Inductive step : tm -> tm -> Prop :=
  | ST_ift : forall t1 t2,
      (tif ttrue t1 t2) ==> t1

  | ST_iff : forall t1 t2,
      (tif tfalse t1 t2) ==> t2

  | ST_if : forall t1 t1' t2 t3,
      t1 ==> t1' ->
      (tif t1 t2 t3) ==> (tif t1' t2 t3)

  | ST_car : forall t1 t1',
      t1 ==> t1' ->
      (tcar t1) ==> (tcar t1')

  | ST_car_val : forall t2 t3,
    (tcar (tcons t2 t3) ) ==> t2

  | ST_car_nil : (tcar tnil) ==> tfalse

  | ST_cdr : forall t1 t1',
      t1 ==> t1' -> (tcdr t1) ==> (tcdr t1')

  | ST_cdr_val : forall t2 t3,
    (tcdr (tcons t2 t3) ) ==> t3

  | ST_cdr_nil : (tcdr tnil) ==> tnil

  | ST_cons_first : forall t1 t2 t1',
      t1 ==> t1' -> (tcons t1 t2) ==> (tcons t1' t2)

  | ST_cons_second : forall t1 t2 t2',
      val t1 -> t2 ==> t2' -> (tcons t1 t2) ==> (tcons t1 t2')

  | ST_isnull_list : forall t1 t2,
      (tisnull (tcons t1 t2)) ==> tfalse

  | ST_isnull : forall t1 t1',
       t1 ==> t1' -> (tisnull t1) ==> (tisnull t1')

  | ST_isnull_nil :  (tisnull tnil) ==> ttrue

where "t1 '==>' t2" := (step t1 t2).

Inductive ty : Type  :=
  | Tbool : ty
  | Tlist : ty.

Reserved Notation "'|-' t '\in' T" (at level 40).

Inductive type_rule : tm -> ty -> Prop :=
   | T_true : |- ttrue \in Tbool
   | T_false : |- tfalse \in Tbool
   | T_nil : |- tnil \in Tlist
   | T_if : forall t1 t2 t3 T,
      |- t1 \in Tbool ->
      |- t2 \in T ->
      |- t3 \in T ->
      |- tif t1 t2 t3 \in T
  | T_car : forall t,
    |- t \in Tlist -> |- tcar t \in Tbool
  | T_cdr : forall t,
    |- t \in Tlist -> |- tcdr t \in Tlist
  | T_cons : forall t1 t2,
    |- t1 \in Tbool ->
    |- t2 \in Tlist  ->
    |- tcons t1 t2 \in Tlist
  | T_isnull : forall t,
    |- t \in Tlist -> |- tisnull t \in Tbool
  
where "'|-' t '\in' T" := (type_rule t T).

Lemma bool_canonical : forall t,
  |- t \in Tbool -> val t -> bval t.
Proof.
  intros t HT HV.
  inversion HV. apply H.
  induction H. inversion HT.
  inversion HT.
Qed.
  
Lemma list_canonical : forall t,
  |- t \in Tlist -> val t -> lval t.
Proof.
  intros t HT HV.
  inversion HV;auto.
  induction H.
  inversion HT.
  inversion HT.
Qed.


Theorem progress : forall t T,
  |- t \in T ->
  val t \/ exists t', t ==> t'.
Proof with auto.
  intros t T HT.
  induction HT.
  left.
  left. 
  apply bv_true.
  left.
  left.
  apply bv_false.
  left.
  right.
  apply lv_nil.
  right.
  inversion IHHT1.
  apply (bool_canonical t1 HT1) in H.
  inversion H;
  subst.
  exists t2... 
  apply ST_ift.
  exists t3...
  apply ST_iff.
  inversion H as [t1' H1].
  exists (tif t1' t2 t3).
  apply ST_if. 
  assumption.
  inversion IHHT.
  inversion H.
  left.
  left.
  apply (list_canonical t HT) in H.
  inversion H0;
  inversion H.
  subst.
  inversion H2.
  subst.
  inversion H3.
  subst.
  inversion H2.
  subst.
  inversion H3.
  inversion H0.
  right.
  exists(tfalse).
  apply ST_car_nil.
  right.
  exists(t1).
  apply ST_car_val.
  right.
  inversion H as [t1' H1].
  exists(tcar t1').
  apply ST_car.
  assumption.
  
  inversion IHHT.
  inversion H.
  apply (list_canonical t HT) in H.
  inversion H0;
  inversion H.
  subst.
  inversion H2.
  subst.
  inversion H3.
  subst.
  inversion H2.
  subst.
  inversion H3.
  right.
  inversion H0.
  exists(tnil).
  apply ST_cdr_nil.
  exists(t0).
  apply ST_cdr_val.
  right.
  inversion H as [t1' H1].
  exists(tcdr t1').
  apply ST_cdr.
  assumption.

  inversion IHHT1.
  inversion IHHT2.
  left.
  right.
  apply (bool_canonical t1 HT1) in H.
  apply (list_canonical t2 HT2) in H0.
  apply lv_cons.
  assumption.
  right.
  inversion H0 as [t2' H1].
  exists(tcons t1 t2').
  apply ST_cons_second.
  assumption.
  assumption.
  right.
  inversion H as [t1' H1].
  exists(tcons t1' t2).
  apply ST_cons_first.
  assumption.
  
  inversion IHHT.
  inversion H.
  apply (list_canonical t HT) in H.
  inversion H0;
  inversion H.
  subst.
  inversion H2.
  subst.
  inversion H3.
  subst.
  inversion H2.
  subst.
  inversion H3.
  right.
  inversion H0.
  exists(ttrue).
  apply ST_isnull_nil.
  exists(tfalse).
  apply ST_isnull_list.
  right.
  inversion H as [t' H1].
  exists(tisnull t').
  apply ST_isnull.
  assumption.
  Qed.
