# binary-tree-clj
a simple Clojure program for inverting a binary tree

## usage

### `(node value left-child right-child)`

you can create a new node in a tree by calling the `node` function with the following arguments:
- `v` (the value of the node) 
- `l` (the left child of the node; optional)
- `r` (the right child of the node; optional).

the function is going to transform these arguments into a vector with 3 elements.

here's an example of a simple tree:

```clojure
(def tree
  (node 1
        (node 2
              (node 4)
              (node 5))
        (node 3
              (node 6)
              (node 7))))
```

this is going to be represented as the following array:

```clojure
[1 [2 [4 nil nil] [5 nil nil]] [3 [6 nil nil] [7 nil nil]]]
```

![visualization of `tree`](tree.png)

### `(invert-tree tree)`

you can invert a binary tree by calling the `invert-tree` function with one argument (a tree, which consists nested nodes).

here's the inversion of our tree called `tree`:

```clojure
(invert-tree tree)
```

this is going to be represented as the following array:

```clojure
[1 [3 [7 nil nil] [6 nil nil]] [2 [5 nil nil] [4 nil nil]]]
```

![visualization of `(invert-tree tree)`](inverted-tree.png)
