;; 6857
(def n 600851475143)

(defn isFactor [x num] (= (mod num x) 0))

(defn factors
  "Returns an ordered set of factors"
  [x]
  (let [root (Math/floor (Math/sqrt x))]
    (reduce (fn [factorSet f]
              (into factorSet [f (quot x f)]))
            (sorted-set)
            (filter #(isFactor % x)
                    (range 2 (+ root 1))))))

(defn isPrime [x]
  (= (factors x) #{})
  )

(def solution
  (first (filter isPrime (reverse (factors n)))))
