/* int -> int */
(lambda (n)
 (+ n ((lambda (n) (+ n 3))
       n)))
