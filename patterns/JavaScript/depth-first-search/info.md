# Depth first search

Trees can be traversed in two different orders depth or breadth first. The
following code implements depth first traversal of a tree

![depthFirst.js](depthFirst.js "depthFirst.js")

Depth first means that when searching the tree we first all the nodes in a 
branch of tree and the move on to the next branch. If we apply our function to
the following tree:

![tree.js](tree.js "tree.js")

We get the following output

```
1
10
100
101
102
1020
20
200
201
30
```

which correctly enumerates all the nodes in depth first order.