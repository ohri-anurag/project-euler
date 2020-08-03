; 31875000

(def triplets
  (apply concat
         (map
            (fn [c] (map (fn [b] [(- 1000 b c) b c]) (range 1 c)))
            (range 2 500))))

(defn pythagorean?
  [[a b c]]
  (= (+ (* a a) (* b b)) (* c c)))

(def solution
  (reduce * (first (filter pythagorean? triplets))))
