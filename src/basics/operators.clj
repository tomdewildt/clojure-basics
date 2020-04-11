(ns basics.operators)

(defn main
  []
  ;; Equal
  (println "Equal:" (= 4 5))

  ;; Not equal
  (println "Not equal:" (not= 4 5))

  ;; And
  (println "And:" (and true false))

  ;; Or
  (println "Or:" (or true false))

  ;; Invert
  (println "Invert:" (not true))

  ;; Greater than or equal to
  (if (>= 40 18)
    (println "Greater than or equal to: true")
    (println "Greater than or equal to: false"))

  ;; Less than or equal to
  (if (<= 12 18)
    (do (println "Less than or equal to: true 1")
        (println "Less than or equal to: true 2"))
    (println "Less than or equal to: false"))

  ;; Multiple lines
  (when true
    (println "Multiple lines: 1")
    (println "Multiple lines: 2"))

  ;; Multiple conditions
  (cond
    (< 8 5) (println "Multiple conditions: 1")
    (= 8 5) (println "Multiple conditions: 2")
    (and (> 8 5) (<= 8 18)) (println "Multiple conditions: 3")

    :else "Multiple conditions: 4"))