(ns basics.lists)

#_{:clj-kondo/ignore [:inline-def]}
(defn main
  []
  ;; Define list
  (def list-variable (list "Dog" 1 3.4 true))

  ;; First element
  (println "First element:" (first list-variable))

  ;; All elements except first
  (println "All elements except first:"  (rest list-variable))

  ;; Element at index
  (println "Element at index:" (nth list-variable 3))

  ;; Add item
  (println "Add item:" (list* list-variable [4]))

  ;; Add item to left
  (println "Add item to left:" (cons 3 list-variable))

  ;; Get two values
  (println "Get two values:" (take 2 list-variable))

  ;; Drop value
  (println "Drop value:" (drop 1 list-variable))

  ;; Take while condition
  (println "Take while condition:" (take-while neg? [-1 0 1]))

  ;; Drop while condition
  (println "Drop while condition:" (drop-while neg? [-1 0 1]))

  ;; Filter items
  (println "Filter items:" (filter #(> % 2) [1 2 3 4])))