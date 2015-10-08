/* No type */
(letrec ((e (lambda (n m) ((+ n m))))) (let ((x (+ 3 4))) (x e 5)))
