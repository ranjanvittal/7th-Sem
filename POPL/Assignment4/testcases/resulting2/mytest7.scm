(letrec (
    (x (lambda (x1) (y 2)))
    (y (lambda (x2) x2))
    )
    (
        let ((x 3))
        (set! x y)
    )
)
Program does not type check
