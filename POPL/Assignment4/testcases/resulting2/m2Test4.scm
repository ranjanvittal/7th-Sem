 /*int -> int*/
(lambda(b)(letrec ((a (lambda(x) (+ (c x) (c x))))(c (lambda (y) y)))(a b)) )
( int -> ( int ) )
