# Y combinator

A straight forward translation of the y combinator into haskell would look 
something like this.

![YCombinator.hs](YCombinator.hs "Y combinator in Haskell")

Unfortunately this definition won't work since the type of `x` can't be 
inferred. A workaround is to wrap `x` in a wrapper.

![YCombinatorWrapper.hs](YCombinatorWrapper.hs "Y combinator in Haskell using a wrapper")

Of course a more straight forward definition would be to use the following fix
point operator.

![Fix.hs](Fix.hs "Fix point combinator in Haskell")
