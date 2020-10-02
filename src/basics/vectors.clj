(ns basics.vectors
  (:gen-class))

#_{:clj-kondo/ignore [:inline-def]}
(defn main
  []
  ;; Define vector variable
  (def vector-variable (vector 1 2 3))

  ;; Index
  (println "Index:" (get vector-variable 2))

  ;; Append element
  (println "Append element:" (conj vector-variable 4))

  ;; Remove first element
  (println "Remove first element:" (pop vector-variable))

  ;; Get subvector
  (println "Get subvector:" (subvec vector-variable 0 2)))
