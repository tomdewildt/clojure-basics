(ns basics.maps)

(defn main
  []
  ;; Define hashmap variable
  (def hash-map-variable (hash-map "Name" "John" "Age" 42))

  ;; Define sorted map variable
  (def sorted-map-variable (sorted-map 3 42 2 "Banana" 1 "John"))

  ;; Get value
  (println "Get value:" (get hash-map-variable "Name"))

  ;; Get key and value
  (println "Get key and value:" (find hash-map-variable "Name"))

  ;; Contains key
  (println "Contains key:" (contains? hash-map-variable "Name"))

  ;; Get keys
  (println "Get keys:" (keys hash-map-variable))

  ;; Get values
  (println "Get values:" (vals hash-map-variable))

  ;; Merge maps
  (println "Merge maps:" (merge-with + (hash-map "Name" "John") (hash-map "Age" 42))))