(def third 
  (comp first rest rest))

(defn node [v & [l r]]
  [v l r])

(defn invert-tree [tree]
  (if (nil? tree)
    tree 
    [(first tree)
     (invert-tree (third tree))
     (invert-tree (second tree))]))

(comment (let [tree (node 1
                          (node 2
                                (node 4)
                                (node 5))
                          (node 3
                                (node 6)
                                (node 7)))]
           (println tree)
           (println (invert-tree tree))))
