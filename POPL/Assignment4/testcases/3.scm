// t1->(int->(int->(t2->int)))

(lambda (a) (lambda (b) (lambda (c) (lambda (d) (+ b c)))))