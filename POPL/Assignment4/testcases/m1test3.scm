/* int -> (int -> int) */
(lambda (n)
 (lambda
  (k)
  (let ((x 5)
        (y 6))
       (+ n (+ x (+ y k))))))
