/* (int->int)->(int->((int->t1)->t1)) */
(lambda (x)
    (lambda (y)
        (lambda (z) (z ( + (x y) (+ y 1))))
    )
)