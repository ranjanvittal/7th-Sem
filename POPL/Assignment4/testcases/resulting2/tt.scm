(letrec
    ((x (lambda (q) 5)))
    (x (x 2 3))
)
Program does not type check
