/* int */
((lambda
 (n)
 (letrec (
          (func (lambda
                 (k)
                 (if (n)
                  (func (#f))
                  1
                 )
                )
          )
         )
  (func 3)
 )
) #t)
Program does not type check
