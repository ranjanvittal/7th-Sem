(lambda (n)
(letrec ((f (lambda (n i)
(f n (+ i 1)))))
(f n 2)))( t12 -> ( t15 ) )
