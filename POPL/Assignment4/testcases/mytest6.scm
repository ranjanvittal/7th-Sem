/* ((t1 -> t1) -> t1) -> (t1 -> t1) -> (t1 -> t1) -> t1 */
(lambda (x)
    (lambda (y)
        (lambda (z)
            (y (z (z (y (x y)))))
        )
    )
)