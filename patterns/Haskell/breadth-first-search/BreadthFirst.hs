module BreadthFirst (Tree(..), breadthFirstKidney, breadthFirstTwoLists, breadthFirstAllison) where

data Tree v = Node v [Tree v] deriving (Show)

value :: Tree v -> v
value (Node value _) = value

children :: Tree v -> [Tree v]
children (Node _ children) = children

-- breadth first from https://doisinkidney.com/posts/2018-12-18-traversing-graphs.html

breadthFirstKidney :: Tree a -> [a]
breadthFirstKidney tree = breadthFirstKidney' tree next []

breadthFirstKidney' :: Tree a -> ([[Tree a]] -> [a]) -> [[Tree a]] -> [a]
breadthFirstKidney' (Node value children) next levels = value : next (children : levels)

next :: [[Tree a]] -> [a]
next [] = []
next levels = foldl (\cont -> \level -> foldr (\node -> breadthFirstKidney' node) cont level) next levels []

-- explicit version which tracks two lists
-- the 1st list contains the node of the current level
-- the 2nd list contains the nodes of the next level in reverse order
-- this simulates essentially a functional queue

breadthFirstTwoLists :: Tree v -> [v]
breadthFirstTwoLists tree = breadthFirstTwoList' [tree] []

breadthFirstTwoList' :: [Tree v] -> [[Tree v]] -> [v]
breadthFirstTwoList' [] [] = []
breadthFirstTwoList' [] nextLevel = breadthFirstTwoList' 
    (foldl (\accum -> \level -> foldr (\node -> \accum -> node:accum) accum level) [] nextLevel) []
breadthFirstTwoList' (node:nodes) nextLevel = value node : breadthFirstTwoList' nodes (children node:nextLevel)

-- from Allison, Lloyd. 2006. “Circular Programs and Self-Referential Structures.”
breadthFirstAllison :: Tree v -> [v]
breadthFirstAllison tree = map value $ breadthFirstAllison' tree

breadthFirstAllison' :: Tree v -> [Tree v]
breadthFirstAllison' tree = result
    where 
        result = tree : descent result 1
        descent _ 0 = []
        descent (node:nodes) n = children node ++ descent nodes (n - 1 + (length $ children node))