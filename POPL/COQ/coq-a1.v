
(* Question 1 *)
Theorem identity_fn_applied_thrice : 
  forall (f : bool -> bool), 
  (forall (x : bool), f x = x) ->
  forall (b : bool), f (f (f b)) = b.
Proof.
  intros.
  repeat (rewrite H).
  reflexivity.
  Qed.

(* Question 2 *)
Theorem andb_eq_orb : 
  forall (b c : bool),
  (andb b c) = true -> (orb b c) = true.
Proof.
  intros.
  destruct b.
  simpl in H.
  rewrite H.
  reflexivity.
  inversion H.
  Qed.

(* Question 3 *)
(** Consider a different, more efficient representation of natural
    numbers using a binary rather than unary system.  That is, instead
    of saying that each natural number is either zero or the successor
    of a natural number, we can say that each binary number is either

      - zero,
      - twice a binary number, or
      - one more than twice a binary number.

    (a) First, write an inductive definition of the type [bin]
        corresponding to this description of binary numbers. 

    (Hint: Recall that the definition of [nat] from class,
    Inductive nat : Type :=
      | O : nat
      | S : nat -> nat.
    says nothing about what [O] and [S] "mean."  It just says "[O] is
    in the set called [nat], and if [n] is in the set then so is [S
    n]."  The interpretation of [O] as zero and [S] as successor/plus
    one comes from the way that we _use_ [nat] values, by writing
    functions to do things with them, proving things about them, and
    so on.  Your definition of [bin] should be correspondingly simple;
    it is the functions you will write next that will give it
    mathematical meaning.)

    (b) Next, write an increment function for binary numbers, and a
        function to convert binary numbers to unary numbers.

    (c) Write some unit tests for your increment and binary-to-unary
        functions. Notice that incrementing a binary number and
        then converting it to unary should yield the same result as first
        converting it to unary and then incrementing. 
*)
Inductive bin : Type :=
| O1 : bin
| T_o : bin->bin
| T_e : bin->bin
.
Fixpoint increment(m : bin) :=
match m with
| O1 => T_o O1
| (T_o m1) => (T_e (increment m1))
| (T_e m1) => (T_o m1)
end.

Fixpoint map(m : bin) : nat :=
match m with
| O1 => 0
| (T_o m1) => 1 + (map m1) + (map m1)
| (T_e m1) => (map m1) + (map m1)
end.

Eval compute in (map O1).
Eval compute in (map (T_o O1)).

(* The below two is the verification that map and increment are working properly as suggested,
    one is a map ( increment) and other is successor of map
*)
Eval compute in (map (increment (T_e (T_o O1)))).
Eval compute in (S (map ( T_e (T_o O1)))).

Theorem plus_assoc : forall n m p : nat,
  n + (m+p) = (n+m) + p.
Proof.
induction n.
(*Case n : 0*)
simpl.
reflexivity.
(*Induction propogation*)
simpl.
intros.
rewrite IHn.
reflexivity.
Qed.

Theorem plus_commutativity_use : forall n m : nat,
S(n+m) = n + S m.
Proof.
intros.
induction n.
(*Case n : 0*)
simpl.
reflexivity.
(*Induction propogation*)
simpl.
rewrite  IHn.
reflexivity.
Qed.

Theorem plus_comm : forall n m : nat,
  m + n = n+m.
Proof.
intros.
generalize dependent n.
induction m.
(*Case m :0*)
simpl.
induction n.
(*Case m = n = 0*)
simpl.
reflexivity.
(*Case m = 0, n : Induction Propogation*)
simpl.
rewrite <- IHn.
reflexivity.
(*Case m : Induction propogation*)
simpl.
intros.
rewrite IHm.
apply plus_commutativity_use.
Qed.

(* Instead of taking cases, we jump into proving S (map(m)) = map(increment m) *)
Theorem inc_binary : forall m : bin, S(map(m))= map (increment m).
Proof.
intros.
induction m.
(*Case m : 0 *)
simpl.
reflexivity.
(*Case (T_0 m')*)
simpl.
assert ( H : forall m : nat, (S m) = 1 + m).
simpl.
reflexivity.
rewrite H.
simpl.
assert (H1 : forall (m: nat), S ( S m) = 1 + 1 + m).
simpl.
reflexivity.
rewrite <- IHm.
simpl.
assert (forall (m n:nat), S (m + n) = m + S (n)).
intros.
induction n.
rewrite plus_comm.
simpl.
rewrite plus_comm.
simpl.
reflexivity.
rewrite H.
rewrite H1.
rewrite plus_assoc.
rewrite plus_assoc.
rewrite plus_assoc.
replace (S n) with (1 + n).
replace (1 + m0) with (m0+1).
rewrite plus_assoc.
reflexivity.
apply plus_comm.
simpl.
reflexivity.
rewrite H0.
reflexivity.
(*Case (T_e m)*) 
simpl.
reflexivity.
Qed.




(*Question 4.*)

(** Use [assert] to help prove this theorem.  You shouldn't need to
    use induction.  You might find [plus_assoc] comes in handy.*)



Theorem plus_swap : forall n m p : nat,
  n + (m + p) = m + (n + p).
Proof.
  intros.
  rewrite plus_comm.
  replace (n+p) with (p+n).
  rewrite plus_assoc.
  reflexivity.
  apply plus_comm.
  Qed.

(*Question 5.*)

(** (You will probably need to define and prove a separate subsidiary 
    theorem to be used in the proof of this one.)  You may find 
    that [plus_swap] comes in handy. *)

Theorem mult_comm : forall m n : nat,
 m * n = n * m.
Proof.
  intros.
  generalize dependent n.
  induction m.
  (*Case m : 0*)
  simpl.
  (*Case m = n = 0*)
  induction n.
  reflexivity.
  (*Case m : 0, n : Induction propogation*)
  apply IHn.
  (*Case m  : (S m')*)
  induction  n.
  (*Case m : (S m'), n : 0*)
  simpl.
  apply IHm.
  (*Case m : (S m'), n : (S n')*)
  simpl.
  rewrite IHm.
  simpl.
  rewrite plus_swap.
  rewrite <- IHn.
  simpl.
  rewrite IHm.
  reflexivity.
  Qed.

(*Question 6.*)

Inductive natlist : Type :=
  | nil : natlist
  | cons : nat -> natlist -> natlist.

(** For example, here is a three-element list: *)

Definition mylist := cons 1 (cons 2 (cons 3 nil)).


(** *** *)
(** As with pairs, it is more convenient to write lists in
    familiar programming notation.  The following two declarations
    allow us to use [::] as an infix [cons] operator and square
    brackets as an "outfix" notation for constructing lists. *)

Notation "x :: l" := (cons x l) (at level 60, right associativity).
Notation "[ ]" := nil.
Notation "[ x ; .. ; y ]" := (cons x .. (cons y nil) ..).

(** It is not necessary to fully understand these declarations,
    but in case you are interested, here is roughly what's going on.

    The [right associativity] annotation tells Coq how to parenthesize
    expressions involving several uses of [::] so that, for example,
    the next three declarations mean exactly the same thing: *)

Definition mylist1 := 1 :: (2 :: (3 :: nil)).
Definition mylist2 := 1 :: 2 :: 3 :: nil.
Definition mylist3 := [1;2;3].

(** The [at level 60] part tells Coq how to parenthesize
    expressions that involve both [::] and some other infix operator.
    For example, since we defined [+] as infix notation for the [plus]
    function at level 50,
Notation "x + y" := (plus x y)  
                    (at level 50, left associativity).
   The [+] operator will bind tighter than [::], so [1 + 2 :: [3]]
   will be parsed, as we'd expect, as [(1 + 2) :: [3]] rather than [1
   + (2 :: [3])].

   (By the way, it's worth noting in passing that expressions like "[1
   + 2 :: [3]]" can be a little confusing when you read them in a .v
   file.  The inner brackets, around 3, indicate a list, but the outer
   brackets, which are invisible in the HTML rendering, are there to
   instruct the "coqdoc" tool that the bracketed part should be
   displayed as Coq code rather than running text.)

   The second and third [Notation] declarations above introduce the
   standard square-bracket notation for lists; the right-hand side of
   the third one illustrates Coq's syntax for declaring n-ary
   notations and translating them to nested sequences of binary
   constructors. *)

(** *** Repeat *)
(** A number of functions are useful for manipulating lists.
    For example, the [repeat] function takes a number [n] and a
    [count] and returns a list of length [count] where every element
    is [n]. *)

Fixpoint repeat (n count : nat) : natlist := 
  match count with
  | O => nil
  | S count' => n :: (repeat n count')
  end.

(** *** Length *)
(** The [length] function calculates the length of a list. *)

Fixpoint length (l:natlist) : nat := 
  match l with
  | nil => O
  | h :: t => S (length t)
  end.

(** *** Append *)
(** The [app] ("append") function concatenates two lists. *)

Fixpoint app (l1 l2 : natlist) : natlist := 
  match l1 with
  | nil    => l2
  | h :: t => h :: (app t l2)
  end.

(** Actually, [app] will be used a lot in some parts of what
    follows, so it is convenient to have an infix operator for it. *)

Notation "x ++ y" := (app x y) 
                     (right associativity, at level 60).

Example test_app1:             [1;2;3] ++ [4;5] = [1;2;3;4;5].
Proof. reflexivity.  Qed.
Example test_app2:             nil ++ [4;5] = [4;5].
Proof. reflexivity.  Qed.
Example test_app3:             [1;2;3] ++ nil = [1;2;3].
Proof. reflexivity.  Qed.

(** Here are two smaller examples of programming with lists.
    The [hd] function returns the first element (the "head") of the
    list, while [tl] returns everything but the first
    element (the "tail").  
    Of course, the empty list has no first element, so we
    must pass a default value to be returned in that case.  *)

(** *** Head (with default) and Tail *)
Definition hd (l:natlist) : nat :=
  match l with
  | nil => 0
  | h :: t => h
  end.

Definition tl (l:natlist) : natlist :=
  match l with
  | nil => nil  
  | h :: t => t
  end.

Example test_hd1:             hd [1;2;3] = 1.
Proof. reflexivity.  Qed.
Example test_hd2:             hd [] = 0.
Proof. reflexivity.  Qed.
Example test_tl:              tl [1;2;3] = [2;3].
Proof. reflexivity.  Qed.

(** **** Exercise: 2 stars (list_funs)  *)
(** Complete the definitions of [nonzeros], [oddmembers] and
    [countoddmembers] below. Have a look at the tests to understand
    what these functions should do. *)


(** **** Exercise: 3 stars, advanced (alternate)  *)
(** Complete the definition of [alternate], which "zips up" two lists
    into one, alternating between elements taken from the first list
    and elements from the second.  See the tests below for more
    specific examples.

    Note: one natural and elegant way of writing [alternate] will fail
    to satisfy Coq's requirement that all [Fixpoint] definitions be
    "obviously terminating."  If you find yourself in this rut, look
    for a slightly more verbose solution that considers elements of
    both lists at the same time.  (One possible solution requires
    defining a new kind of pairs, but this is not the only way.)  *)

(* ###################################################### *)
(** ** Bags via Lists *)

(** A [bag] (or [multiset]) is like a set, but each element can appear
    multiple times instead of just once.  One reasonable
    implementation of bags is to represent a bag of numbers as a
    list. *)

(** Just as with numbers, simple facts about list-processing
    functions can sometimes be proved entirely by simplification. For
    example, the simplification performed by [reflexivity] is enough
    for this theorem... *)

Theorem nil_app : forall l:natlist,
  [] ++ l = l.
Proof. reflexivity. Qed.

(** ... because the [[]] is substituted into the match position
    in the definition of [app], allowing the match itself to be
    simplified. *)

(** Also, as with numbers, it is sometimes helpful to perform case
    analysis on the possible shapes (empty or non-empty) of an unknown
    list. *)

(** Here, the [nil] case works because we've chosen to define
    [tl nil = nil]. Notice that the [as] annotation on the [destruct]
    tactic here introduces two names, [n] and [l'], corresponding to
    the fact that the [cons] constructor for lists takes two
    arguments (the head and tail of the list it is constructing). *)

(** Usually, though, interesting theorems about lists require
    induction for their proofs. *)

(* ###################################################### *)
(** ** Micro-Sermon *)

(** Simply reading example proof scripts will not get you very far!
    It is very important to work through the details of each one,
    using Coq and thinking about what each step achieves.  Otherwise
    it is more or less guaranteed that the exercises will make no
    sense... *)

(* ###################################################### *)
(** ** Induction on Lists *)

(** Proofs by induction over datatypes like [natlist] are
    perhaps a little less familiar than standard natural number
    induction, but the basic idea is equally simple.  Each [Inductive]
    declaration defines a set of data values that can be built up from
    the declared constructors: a boolean can be either [true] or
    [false]; a number can be either [O] or [S] applied to a number; a
    list can be either [nil] or [cons] applied to a number and a list.

    Moreover, applications of the declared constructors to one another
    are the _only_ possible shapes that elements of an inductively
    defined set can have, and this fact directly gives rise to a way
    of reasoning about inductively defined sets: a number is either
    [O] or else it is [S] applied to some _smaller_ number; a list is
    either [nil] or else it is [cons] applied to some number and some
    _smaller_ list; etc. So, if we have in mind some proposition [P]
    that mentions a list [l] and we want to argue that [P] holds for
    _all_ lists, we can reason as follows:

      - First, show that [P] is true of [l] when [l] is [nil].

      - Then show that [P] is true of [l] when [l] is [cons n l'] for
        some number [n] and some smaller list [l'], assuming that [P]
        is true for [l'].

    Since larger lists can only be built up from smaller ones,
    eventually reaching [nil], these two things together establish the
    truth of [P] for all lists [l].  Here's a concrete example: *)

Theorem app_assoc : forall l1 l2 l3 : natlist, 
  (l1 ++ l2) ++ l3 = l1 ++ (l2 ++ l3).   
Proof.
  intros l1 l2 l3. induction l1 as [| n l1'].
    reflexivity.
    simpl. rewrite -> IHl1'. reflexivity.  Qed.

(** Again, this Coq proof is not especially illuminating as a
    static written document -- it is easy to see what's going on if
    you are reading the proof in an interactive Coq session and you
    can see the current goal and context at each point, but this state
    is not visible in the written-down parts of the Coq proof.  So a
    natural-language proof -- one written for human readers -- will
    need to include more explicit signposts; in particular, it will
    help the reader stay oriented if we remind them exactly what the
    induction hypothesis is in the second case.  *)

(** *** Informal version *)

(** _Theorem_: For all lists [l1], [l2], and [l3], 
   [(l1 ++ l2) ++ l3 = l1 ++ (l2 ++ l3)].

   _Proof_: By induction on [l1].

   - First, suppose [l1 = []].  We must show
       ([] ++ l2) ++ l3 = [] ++ (l2 ++ l3),
     which follows directly from the definition of [++].

   - Next, suppose [l1 = n::l1'], with
       (l1' ++ l2) ++ l3 = l1' ++ (l2 ++ l3)
     (the induction hypothesis). We must show
       ((n :: l1') ++ l2) ++ l3 = (n :: l1') ++ (l2 ++ l3).
]]  
     By the definition of [++], this follows from
       n :: ((l1' ++ l2) ++ l3) = n :: (l1' ++ (l2 ++ l3)),
     which is immediate from the induction hypothesis.  []
*)

(** *** Another example *)
(**
  Here is a similar example to be worked together in class: *)

Theorem app_length : forall l1 l2 : natlist, 
  length (l1 ++ l2) = (length l1) + (length l2).
Proof.
  (* WORKED IN CLASS *)
  intros l1 l2. induction l1 as [| n l1'].
    reflexivity.
    simpl. rewrite -> IHl1'. reflexivity.  Qed.


(** *** Reversing a list *)
(** For a slightly more involved example of an inductive proof
    over lists, suppose we define a "cons on the right" function
    [snoc] like this... *)

Fixpoint snoc (l:natlist) (v:nat) : natlist := 
  match l with
  | nil    => [v]
  | h :: t => h :: (snoc t v)
  end.

(** ... and use it to define a list-reversing function [rev]
    like this: *)

Fixpoint rev (l:natlist) : natlist := 
  match l with
  | nil    => nil
  | h :: t => snoc (rev t) h
  end.

Theorem app_nil_end : forall l : natlist,
  l ++ [] = l.   
Proof.
  intros.
  induction l.
  (*Case l : []*)
  reflexivity.
  (*Case l : n::l'*)
  simpl.
  rewrite IHl.
  reflexivity.
  Qed.

(*Question 7.*)

Theorem snoc_append : forall (l:natlist) (n:nat),
  snoc l n = l ++ [n].
Proof.
  intros.
  induction l.
  (*Case l : []*)
  reflexivity.
  (*Case l : n::l'*)
  simpl.
  rewrite IHl.
  reflexivity.
  Qed.

(** You may find  that [app_nil_end] and [snoc_append] comes in handy. *)

Theorem distr_rev : forall l1 l2 : natlist,
  rev (l1 ++ l2) = (rev l2) ++ (rev l1).
Proof.
  intros.
  generalize dependent l2.
  induction l1.
  (*Case l1 : []*)
  simpl.
  induction l2.
  (*Case l1 : [], l2 : []*)
  reflexivity.
  (*Case l1 : [], l2 : n::l2' *)
  rewrite app_nil_end.
  reflexivity.
  (*Case l1 : n::l1'*)
  simpl.
  intros.
  rewrite IHl1.
  simpl.
  repeat (rewrite snoc_append).
  apply app_assoc.
  Qed.

(*Question 9.*)

(** A palindrome is a sequence that reads the same backwards as
    forwards.

    - Define an inductive proposition [pal] on natlist that
      captures what it means to be a palindrome. (Hint: You'll need
      three cases.  Your definition should be based on the structure
      of the list; just having a single constructor
    c : forall l, l = rev l -> pal l
      may seem obvious, but will not work very well.)
 
    - Prove that 
       forall l, pal (l ++ rev l).
    - Prove that 
       forall l, pal l -> l = rev l.
*)



Inductive pal : natlist->Prop :=
| pal_null : pal []  (* [] is a palindrome*)
| pal_first : forall n, pal [n] (*[n] is a palindrome *)
| pal_full :
forall (l : natlist) (n : nat), pal l -> pal (cons n (snoc l n)) (* if pal l then  [n] ++ l ++ [n] is a palindrome*)
.

Theorem particular_palindrome_prover : forall l, pal (l ++ rev l).
Proof.
intros.
induction l.
(*Case l : []*)
simpl.
apply pal_null.
(*Case l : n::l'*)
simpl.
rewrite snoc_append.
rewrite <- app_assoc.
rewrite <- snoc_append.
apply pal_full.
assumption.
Qed.

Theorem palindrome_checker : forall l, pal(l) -> l = rev l.
Proof.
intros.
induction H.
(*Case [] = rev []*)
reflexivity.
(*Case [n] = rev [n]*)
reflexivity.
(* Case l = rev l -> [n] ++ l ++ [n] = rev ([n] ++ l ++ [n])*)
simpl.
rewrite snoc_append.
rewrite snoc_append.
rewrite distr_rev.
simpl.
rewrite <- IHpal.
reflexivity.
Qed.

(*Question 10.*)

(** State and Prove an interesting theorem of your choice. 
    Credit will be given based on the interesting nature of 
    the problem and the proof. *)

(* I have proved that a^2 + b^2 >= 2*a*b (ie) 2*a*b <= a*a + b*b *)

(* 0 <= S b *)
Theorem zero_less_than_succ_b : forall(b:nat), 0 <= S b.
Proof.
intros.
induction b.
(*Case b : 0*)
apply le_S.
apply le_n.
(*Case b : (S b')*)
apply le_S.
apply IHb.
Qed.


(* 0 <= b*b *)
Theorem zero_less_than_b_square : forall(b : nat), 0 <= b*b.
Proof.
intros.
induction b.
(*Case b : 0*)
simpl.
apply le_n.
(*Case b : (S b')*)
simpl.
apply zero_less_than_succ_b.
Qed.

(* 0 = n*0 *)
Theorem n_mult_zero : forall(n:nat), 0 = n*0.
Proof.
intros.
induction n.
(*Case n : 0*)
reflexivity.
(*Case n : (S n')*)
simpl.
apply IHn.
Qed.

(* n <= 0 -> 0 = n *)
Theorem n_le_zero_implies_n_eq_zero : forall(n:nat), n <= 0 -> 0 = n.
Proof.
intros.
inversion H.
reflexivity.
Qed.

(* (S n) <= m -> n <= m *)
Theorem succ_n_le_m_implies_n_le_m : forall(n m:nat), (S n) <= m -> n <= m.
Proof.
intros.
induction m.
(*Case m : 0*)
inversion H.
(*Casse m : (S m')*)
apply le_S_n in H.
apply le_S in H.
apply H.
Qed.

(* p <= m, m <= n -> p <= n (ie) transitivity for less than or equal to*)
Theorem le_transitivity : forall(n:nat), forall(m:nat), forall(p:nat), p <= m /\ m <= n -> p <= n.
Proof.
intros.
destruct H.
generalize dependent n.
induction m.
(*Case m : 0*)

(*Small proof for p = 0*)
assert ( H1 : p = 0).
apply n_le_zero_implies_n_eq_zero in H.
rewrite H.
reflexivity.

(*Case m : 0, p : 0*)
intros.
rewrite H1.
apply H0.

(*Case m : (S m')*)
induction H.
(*Case base step for H*)
intros.
apply H0.
(*Case propogation step for H*)
intros.
inversion H.
inversion H0.
apply le_S.
apply le_n.
destruct m1.
(*Case m1 = 0, to prove : m0 <= 1*)
inversion H2.
(*Case m0 <= S ( S m1)*)
apply le_S_n in H2.
apply le_S in H2.
apply le_S in H2.
apply H2.
apply le_S in H1.
rewrite H2 in H1.
apply succ_n_le_m_implies_n_le_m in H0.
apply IHle.
apply H0.
Qed.

(* (S b) + c - S (b + c) *)
Theorem succ_plus : forall(b c : nat), (S b) + c = S(b+c).
Proof.
intros.

(*Small proof for (S b) = 1 + b*)
assert ((S b) = (1+b)).
simpl.
reflexivity.

rewrite H.
simpl.
reflexivity.
Qed.

(* b <= c -> b <= c + d *)
Theorem b_le_d_implies_b_le_c_plus_d : forall(b c d : nat), b <= d -> b <= c+d.
Proof.
intros.
induction c.
(* c = 0*)
simpl.
apply H.

(* c = (S c')*)

(*Small proof for (S c) + d = S(c + d)*)
assert (((S c) + d) = (S(c+d))).
apply succ_plus.

apply le_S in IHc.
apply IHc.
Qed.

(* a <= c -> a + b <= c + b *)
Theorem a_le_c_implies_a_plus_b_le_c_plus_b : forall(a b c:nat), a <= c -> a+b <= c+b.
Proof.
intros.
induction b.
(*Case b = 0*)
simpl.

(* Small proofs for a+0 = 0+a and b+0 = 0+b*)
assert ( ((a+0)) = ((0+a))).
apply plus_comm.
assert ( ((c+0)) = ((0+c))).
apply plus_comm.

simpl.
rewrite H0.
rewrite H1.
apply H.

(*Case b = (S b')*)

replace ((a + S b)) with (S (a + b)).
replace ((c + S b)) with (S (c + b)).
induction IHb.
apply le_n.
apply le_S in IHIHb.
apply IHIHb.

(*Proofs for the two replaces : (a + S b) = S(a+b) and (c + S b) = S(c+b)*)
rewrite plus_comm.
replace (S(b + c)) with ((S b) + c).
apply plus_comm.
apply succ_plus.

rewrite plus_comm.
replace (S(b + a)) with ((S b) + a).
apply plus_comm.
apply succ_plus.
Qed.


(* a <= c, b <= d -> a+c <= b+d *)
Theorem le_plus_transitivity : forall(a b c d : nat), a <= c ->  b <= d -> a+b <= c+d.
Proof.
intros.
destruct H.
destruct H0.
apply a_le_c_implies_a_plus_b_le_c_plus_b .
apply le_n.
rewrite plus_comm.
assert (a + S m = S m + a).
apply plus_comm.
rewrite H.
apply a_le_c_implies_a_plus_b_le_c_plus_b .
apply le_S in H0.
apply H0.
generalize dependent d.
induction H.
intros.
induction H0.
apply a_le_c_implies_a_plus_b_le_c_plus_b .
apply le_S.
apply le_n.
simpl.
replace (a + S m) with (S a + m).
apply le_S.
apply IHle.
simpl.
apply plus_commutativity_use.
intros.
simpl.
apply le_S.
assert ( m+d = d + m).
apply plus_comm.
rewrite H1.
rewrite plus_commutativity_use.
assert ( d + S m = S m + d).
apply plus_comm.
rewrite H2.
apply IHle.
apply H0.
Qed.

(* a = c, b = d -> a + b = c + d*)
Theorem plus_eq_transitivity : forall(a b c d: nat), a = c -> b = d -> a + b = c + d.
Proof.
intros.
destruct H.
rewrite H0.
reflexivity.
Qed.

(* b*(a + c) = b*a + b*c *)
Theorem distributive_mult : forall(b a c : nat), b*(a+c) = b*a + b*c.
Proof.
intros.
generalize dependent a.
generalize dependent c.
induction b.
(* Case b = 0*)
simpl.
reflexivity.
(* Case b = (S b') *)
intros.
simpl.
rewrite IHb.
rewrite plus_assoc.
rewrite plus_assoc.

(* The following introduces a new lemma to prove : b*c = b*c *)
apply plus_eq_transitivity.

rewrite plus_comm.
rewrite plus_assoc.

(* The following introduces a new lemma to prove : c = c *)
apply plus_eq_transitivity.
apply plus_comm.

(*Proof for b*c = b*c *)
reflexivity.

(* Proof for c = c *)
reflexivity.

Qed.

(* Algebraic multiplication expansion (ie) (a+b)*(c+d) = a*c + a*d + b*c + b*d *)
Theorem mult : forall(a b c d : nat), (a+b)*(c+d) = a*c + a*d + b*c + b*d.
Proof.
intros.
generalize dependent c.
generalize dependent d.
induction a.
(* Case a = 0*)
simpl.
intros.
apply distributive_mult.
(* Case a = (S a') *)
intros.
simpl.
rewrite IHa.
repeat (rewrite plus_assoc).
(* The following plus_eq_transitivities gives some trivial which are proved at the end *)
apply plus_eq_transitivity.
apply plus_eq_transitivity.
apply plus_eq_transitivity.

rewrite plus_comm.
rewrite plus_assoc.

(* The following plus_eq_transitivity gives us a lemma to prove : d = d*)
apply plus_eq_transitivity.
apply plus_comm.

(* The following are reflexivity proofs which came into place while applying plus_eq_transitivity *)
reflexivity.
reflexivity.
reflexivity.
reflexivity.
Qed.

(* n + 0 = n *)
Theorem n_plus_zero : forall(n : nat), n + 0 = n.
Proof.
intros.
induction n.
reflexivity.
simpl.
rewrite IHn.
reflexivity.
Qed.

Theorem b_plus_1_square : forall(b : nat), b*b + b + b + 1 = (b+1)*(b+1).
Proof.
intros.
rewrite mult.
replace (b*1) with (b).
replace (1*b) with (b).
simpl.
reflexivity.
simpl.
rewrite n_plus_zero.
reflexivity.
rewrite mult_comm.
simpl.
rewrite n_plus_zero.
reflexivity.
Qed.

Theorem cute_version_of_am_gm_aux : forall(a b : nat), a*b + a*b <= a*a + b*b.
intros.
simpl.
assert( a+0 = a).
apply n_plus_zero.
generalize dependent b.
induction a.
(* Case a = 0 *)
simpl.
apply zero_less_than_b_square.
(* Case a = (S a') *)
induction b.
(* Case b = 0 *)
simpl.

(* Introduces a lemma a*0 = 0 which is proved later in the proof, (R1) *)
replace (a*0) with 0.

simpl.
apply zero_less_than_succ_b.

(* R1 proved : (a*0) = 0 *)
apply n_mult_zero.

(* Case b = (S b') *)

(* A sequence of replaces are made which are proved later on in the proof *)
replace (S a) with (a+1). (* R1 *)
replace (S b) with (b+1). (* R2 *) 
replace ((a+1)*(b+1)) with (a*b + a + b + 1). (* R3 *)
replace ((a+1)*(a+1)) with (a*a + a + a + 1). (* R4 *)
replace ((b+1)*(b+1)) with (b*b + b + b + 1). (* R5 *)
replace (a*b + a + b + 1 + (a*b + a + b + 1)) with (a*b + a*b + (a + a + b + b + 1 + 1)). (* R6 *)
replace (a*a + a + a + 1 + (b*b + b + b + 1)) with (a*a + b*b + (a + a + b + b + 1 + 1)). (* R7 *)

(* The below introduces a new assumption H' and a short proof follows the assertion *)
assert ( H' : (a + a + b + b + 1 + 1) <= (a + a + b + b + 1 + 1)).
apply le_n.
apply le_plus_transitivity.
apply IHa.
apply n_plus_zero.
apply H'.

(* Proof for R7 : The proof just requires repeated application of plus_comm, plus_assoc *)
repeat (rewrite plus_assoc).
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
apply plus_eq_transitivity.
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
rewrite <- plus_assoc.
replace (b*b + a) with (a + b*b).
rewrite plus_assoc.
apply plus_eq_transitivity.
rewrite <- plus_assoc.
rewrite plus_comm.
rewrite plus_assoc.
reflexivity.
reflexivity.
apply plus_comm.
reflexivity.
reflexivity.
reflexivity.

(* Proof for R6 *)
repeat (rewrite plus_assoc).
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
apply plus_eq_transitivity.
rewrite plus_comm.
repeat(rewrite plus_assoc).
reflexivity.
reflexivity.
reflexivity.
reflexivity.
reflexivity.

(* Proof for R5 *)
apply b_plus_1_square.

(* Proof for R4 *)
apply b_plus_1_square.

(* Proof for R3 *)
rewrite mult.
replace (a*1) with (a).
replace (1*b) with (b).
simpl.
reflexivity.
simpl.
rewrite n_plus_zero.
reflexivity.
rewrite mult_comm.
simpl.
rewrite n_plus_zero.
reflexivity.

(* Proof for R2 *)
rewrite plus_comm.
simpl.
reflexivity.

(* Proof for R1 *)
rewrite plus_comm.
simpl.
reflexivity.
Qed.

Theorem cute_version_of_am_gm : forall(a b : nat), 2*a*b <= a*a + b*b.
(* In the following we convert 2*a*b = a*b + a*b *)
intros.
assert( (2*a*b) = (a*b + a*b)).
simpl.
rewrite n_plus_zero.
rewrite mult_comm.
rewrite distributive_mult.
assert( (a*b) = (b*a) ).
apply mult_comm.
rewrite H.
reflexivity.

rewrite H.
(* We apply cute_version of am gm aux to prove this *)
apply cute_version_of_am_gm_aux.

Qed.
