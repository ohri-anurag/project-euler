;; 4613732
(def fibonacci
  (map first (iterate (fn [[a b]] [b (+ a b)]) [1 2])))

(def solution
  (reduce
   +
   (filter even?
           (take-while
            #(<= % 4000000)
            fibonacci))))