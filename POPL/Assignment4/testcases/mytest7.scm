(letrec (
    (x (lambda (x1) (y 2)))
    (y (lambda (x2) x2))
    )
    y
)
