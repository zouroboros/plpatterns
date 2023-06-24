# Depth first search

In Haskell depth first traversal over a tree can be implemented like this

![DepthFirst.hs](DepthFirst.hs "DepthFirst.hs")

For example the following program uses the `depthFirst`to enumerate the nodes
in depth first order. 

![Main.hs](Main.hs "Main.hs")

The output is
```
[1,10,100,101,102,1020,20,200,201,30]
```