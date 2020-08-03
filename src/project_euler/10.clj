; 142913828922

(load-file "src/project_euler/7.clj")

(defn solution
  (reduce + (take-while #(< % 2000000) (sieve))))