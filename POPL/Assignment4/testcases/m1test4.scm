/* (int -> int) -> (int -> int) */
(lambda
 (f)
 (lambda
  (x)
  (+ 1 (+ 2 x))
 )
)
