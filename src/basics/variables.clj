(ns basics.variables)

#_{:clj-kondo/ignore [:inline-def]}
(defn main
  []
  ;; Define long variable
  (def long-variable 10)

  ;; Define double variable
  (def double-variable 10.50)

  ;; Null
  (println "Null:" (nil? long-variable))

  ;; Positive
  (println "Positive:" (pos? long-variable))

  ;; Negative
  (println "Negative:" (neg? long-variable))

  ;; Even
  (println "Even:" (even? long-variable))

  ;; Odd
  (println "Odd:" (odd? long-variable))

  ;; Number
  (println "Number:" (number? long-variable))

  ;; Integer
  (println "Integer:" (integer? long-variable))

  ;; Float
  (println "Float:" (float? long-variable))

  ;; Zero
  (println "Zero:" (zero? long-variable)))