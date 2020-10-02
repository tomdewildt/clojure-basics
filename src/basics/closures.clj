(ns basics.closures)

(defn closure-function
  [multiply-by]
  #(* % multiply-by))

#_{:clj-kondo/ignore [:inline-def]}
(defn main
  []
  ;; Define closure variable
  (def closure-variable (closure-function 3))

  ;; Closure value
  (println "Closure value: " (closure-variable 3)))
