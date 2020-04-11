(ns basics.math)

(defn main
  []
  ;; Sum
  (println "Sum:" (+ 1 2 3))

  ;; Substract
  (println "Substract:" (- 5 3 2))

  ;; Multiply
  (println "Multiply:" (* 2 5))

  ;; Divide
  (println "Divide:" (/ 10 5))

  ;; Module
  (println "Module:" (mod 12 5))

  ;; Increment
  (println "Increment:" (inc 5))

  ;; Decrement
  (println "Decrement:" (dec 5))

  ;; Absolute value
  (println "Absolute value:" (Math/abs -10))

  ;; Cube root
  (println "Cube root:" (Math/cbrt 8))

  ;; Square root
  (println "Square root:" (Math/sqrt 4))

  ;; Round up
  (println "Round up:" (Math/ceil 4.5))

  ;; Round down
  (println "Round down:" (Math/floor 4.5))

  ;; E to the power of 1
  (println "E to the power of 1:" (Math/exp 1))

  ;; Sqrt(x^2 + y^2)
  (println "Sqrt(x^2 + y^2):" (Math/hypot 2 2))

  ;; Natural logarithm
  (println "Natural logarithm:" (Math/log 2.71828))

  ;; Base 10 log
  (println "Base 10 log:" (Math/log10 100))

  ;; Max value
  (println "Max value:" (Math/max 1 5))

  ;; Min value
  (println "Min value:" (Math/min 1 5))

  ;; Power
  (println "Power:" (Math/pow 2 2))

  ;; Random up to 20
  (println "Random up to 20:" (rand-int 20))

  ;; Sum items
  (println "Sum items:" (reduce + [1 2 3]))

  ;; Pi
  (println "Pi:" (Math/PI)))