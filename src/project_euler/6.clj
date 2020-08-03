; 25164150
(defn sum-of-squares
  [x]
  (quot (* x (+ 1 x) (+ 1 (* 2 x))) 6))

(defn square-of-sum
  [x]
  (let [sum (quot (* x (+ 1 x)) 2)]
    (* sum sum)))

(defn solution
  [x]
  (- (square-of-sum x) (sum-of-squares x)))

(solution 100)