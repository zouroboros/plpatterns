import BreadthFirst (Tree(..), breadthFirstKidney, breadthFirstTwoLists, breadthFirstAllison)

tree :: Tree Int
tree = Node 1 [
        Node 10 [
            Node 100 [],
            Node 101 [],
            Node 102 [Node 1020 []]
        ],
        Node 20 [
            Node 200 [],
            Node 201 []
        ],
        Node 30 []]

main :: IO ()
main = do
    let valuesKidney = breadthFirstKidney tree
    print valuesKidney
    let valuesTwoList = breadthFirstTwoLists tree
    print valuesTwoList
    let valuesAllison = breadthFirstAllison tree
    print valuesAllison
