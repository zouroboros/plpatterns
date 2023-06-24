# Breadth first search

Trees can be traversed in two different orders depth or breadth first. The
following code implements breadth first traversal of a tree

![breadthFirst.js](breadthFirst.js "breadthFirst.js")

Breadth first means that when searching the tree we first visit all the nodes
on one level and then we move on to the next level. If we apply our function to
the following tree:

![tree.js](tree.js "tree.js")

We get the following output

```
1
10
20
30
100
101
102
200
201
1020
```

which correctly enumerates all the nodes in breadth first order.