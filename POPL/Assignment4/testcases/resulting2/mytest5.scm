/* ((int->int)->int)-> ( (int->int)->(int->int)->int) */

(lambda (x)
    (lambda (y)
        (lambda (z)
            (y (+ (z (z (y (x y)))) 3))
        )
    )
)
((( int -> ( int ) ) -> ( int ) ) -> ((( int -> ( int ) ) -> ((( int -> ( int ) ) -> ( int ) ) ) ) ) )
