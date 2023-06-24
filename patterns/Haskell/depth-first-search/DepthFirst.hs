module DepthFirst (Tree(..), depthFirst) where

data Tree v = Node v [Tree v] deriving (Show)

depthFirst :: Tree v -> [v]
depthFirst (Node value children) = value:concatMap depthFirst children
