; 1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18*19*20
; Prime numbers needed : 2,3,5,7,11,13,17,19
; Prime numbers with powers: 2^4, 3^2, 5, 7, 11, 13, 17, 19

; 232792560

(require '[clojure.math.numeric-tower :as math :refer [expt]])

(def solution
  (* (expt 2 4) (expt 3 2) 5 7 11 13 17 19))