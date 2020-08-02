;; 906609
(defn palindrome?
  "Checks if a number is a palindrome"
  [x]
  (= (str x) (clojure.string/reverse (str x))))

(def solution
  (let [products
        (sort-by
         identity
         >
         (flatten
          (map
           (fn [x] (map #(* % x) (range 1 1000)))
           (range 1 1000))))]
    (first (filter palindrome? products))))