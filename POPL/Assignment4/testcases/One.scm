(lambda (n)
(letrec ( 
	  (sum (lambda (x) (+ (sum (+ x 1)) x )))
        ) 
	(if #t (sum 2) (sum 3))))