module YCombinatorWrapper where

newtype W a = Wrap { unwrap :: W a -> a }

y = \f -> (\x -> f ((unwrap x) x)) (Wrap (\x -> f ((unwrap x) x)))

fact = y fact'

fact' f 0 = 1
fact' f n = n * (f (n - 1))