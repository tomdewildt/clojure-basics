(ns basics.functions)

(defn function-with-parameter
  [value]

  (println "With parameter:" value))

(defn function-with-multiple-overloads
  ([x y z]

   (println "Multiple overloads:" (+ x y z)))

  ([x y]

   (println "Multiple overloads:" (+ x y))))

(defn function-with-map
  [& values]
  (map function-with-parameter values))


(defn main
  []
  ;; With paramter
  (function-with-parameter "01")

  ;; Multiple overloads
  (function-with-multiple-overloads 4 5)

  ;; With multiple overloads
  (function-with-multiple-overloads 1 2 3)

  ;; With map
  (function-with-map "01" "02" "03")

  ;; Anonymous function
  (map
   (fn [x] (* x x))
   (range 1 10))

  ;; Compact anonymous function
  (map
   #(* % 3)
   (range 1 10))

  ;; Compact anonymous function (multiple parameters)
  (#(* %1 %2) 2 3))