# Tying the knot

![Cyclic.hs](Cyclic.hs "Circular references in Haskell")

Haskell is a lazily evaluated language. The laziness can be exploited to work with cyclic constructs that may seem impossible. The function cyclic defined above produces an infinite list of 0s and 1s.