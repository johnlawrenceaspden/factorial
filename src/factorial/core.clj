(ns factorial.core)

(defn factorial
  "factorial!"
  [n]
  (if (< n 2) n (* n (factorial (dec n)))))
