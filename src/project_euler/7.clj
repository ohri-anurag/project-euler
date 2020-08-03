; 104743

(defn delMin
  [heap i]
  (if (empty? heap)
    heap
    (let [[top j] (first heap)]
      (if (= top i)
        (recur (conj
                (disj heap [top j])
                [(+ top j) j])
               i)
        heap))))

(defn sieve
  ([] (sieve (sorted-set) 2))
  ([heap i]
   (if (empty? heap)
     (lazy-seq
      (cons
       i
       (sieve (conj heap [(* i i) i]) (+ 1 i))))
     (let [[top j] (first heap)]
       (cond
         (< top i) (recur
                    (conj
                     (disj heap [top j])
                     [(+ top j) j])
                    i)
         (= top i) (recur (delMin heap i) (+ 1 i))
         :else (lazy-seq
                (cons
                 i
                 (sieve
                  (conj heap [(* i i) i])
                  (+ 1 i)))))))))

(defn solution
  [n]
  (nth (sieve) (dec n)))

(solution 10001)
