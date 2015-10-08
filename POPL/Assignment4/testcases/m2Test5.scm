/*a->(int->(a1->(((a1->bool)->(int->bool))->((a1->bool)->a))))*/
(lambda(a x y z z1 z2) (if(z1 x) (+ x (z2 y))(if(z y)(a)(a))))
