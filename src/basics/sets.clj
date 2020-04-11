(ns basics.sets)

(defn main
  []
  ;; Define set variable
  (def set-variable (set '(1 2 3 4)))

  ;; Get value
  (println "Get value:" (get set-variable 1))

  ;; Append value
  (println "Append value:" (conj set-variable 5))

  ;; Contains value
  (println "Contains value:" (contains? set-variable 5))

  ;; Remove value
  (println "Remove value:" (disj set-variable 4)))