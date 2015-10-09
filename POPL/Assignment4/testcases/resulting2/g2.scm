/* ((t1->t2)->(t1->(t3->t2))) */
(lambda (z)
  (lambda (b)
    (lambda (a)
      (letrec ((loop (lambda (last)
                       (let ((next (lambda (x) (x last))))
                         (z b)))))
        (loop a)))))
(( t18 -> ( t19 ) ) -> (( t18 -> (( t6 -> ( t19 ) ) ) ) ) )
