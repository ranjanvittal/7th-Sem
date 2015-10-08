( lambda ( x )
     ( let (
             ( arg1 ( lambda ( y )
                     (
						(+ x y)
                      )
                  )
               )
           )
         (+ arg1 1)
       )
)