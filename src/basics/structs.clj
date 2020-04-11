(ns basics.structs)

(defn main
  []
  ;; Define vector variable
  (def vector-variable [1 2 3 4])

  ;; Values to symbols
  (let [[one two & rest] vector-variable]
    (println "Values to symbols:" one two rest))

  ;; Create struct
  (defstruct TraditionalStruct :string-variable :int-variable)

  ;; Instantiate struct
  (def struct-variable-1 (struct TraditionalStruct "One" 1))

  ;; Instantiate struct with struct-map
  (def struct-variable-2 (struct-map TraditionalStruct :string-variable "Two" :int-variable 2))

  ;; Get struct
  (println "Get struct:" struct-variable-1)

  ;; Value from struct
  (println "Value from struct:" (:string-variable struct-variable-2)))