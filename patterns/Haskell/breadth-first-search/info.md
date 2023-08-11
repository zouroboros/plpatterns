# Breadth first search

In contrast to depth first search breadth first search is not as straightforward
to implement in a functional language. The problem boils down to the difficulty
of implementing a queue (first in, first out). Consequently there are many 
different ways of implementing a breadth first traversal of a tree in Haskell.

![BreadthFirst.hs](BreadthFirst.hs "BreadthFirst.hs")

This code contains three implementations of a breadth first algorithm. The
function `breadthFirstKidney` is based on an 
[article](https://doisinkidney.com/posts/2018-12-18-traversing-graphs.html)
by Donnacha Oisín Kidney.

The function `breadthFirstAllison` is based on code presented in 
Allison, L. (1989), Circular programs and self-referential structures. Softw:
Pract. Exper., 19: 99-109. 
[doi.org/10.1002/spe.4380190202](https://doi.org/10.1002/spe.4380190202).

The function `breadthFirstTwoLists` is based on an explicit representation of a
functional queue using two lists as described in Okasaki, C. (1995). 
Simple and efficient purely functional queues and deques. 
Journal of Functional Programming, 5(4), 583-592. 
[doi:10.1017/S0956796800001489](https://doi.org/10.1017/S0956796800001489).

