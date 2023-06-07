module Fix where
fix f = let x = f x in x

fact = fix fact'

fact' f 0 = 1
fact' f n = n * (f (n - 1))