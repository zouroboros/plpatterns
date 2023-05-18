module Cyclic where 

cyclic :: [Integer]
cyclic = let x = 0 : y
             y = 1 : x
         in x