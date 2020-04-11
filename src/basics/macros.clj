(ns basics.macros)

(defmacro macro-with-three-parameters
  ;; Macro takes three parameters a condition and two blocks of code
  ;; it needs to run if the condition is met or not
  ([cond body-1 body-2]

   ;; Create a list of clojure commands with ` and list to check if
   ;; the condition is met and execute the two code blocks accordingly
   (list `if cond body-1 body-2)))

(defmacro macro-with-conditional-body-1
  ;; This macro takes a condition and a set of statements to execute
  ;; if the condition is met
  [cond & body]

  ;; Execute the body with do if the condition is met
  (list `if cond (cons `do body)))

(defmacro macro-with-conditional-body-2
  ;; This macro takes a condition and a set of statements to execute
  ;; if the condition is met
  [cond & body]

  ;; Use ` to not evaluate statements if you add ~ before a statement
  ;; it will be evaluated
  `(if ~cond (do ~@body)))

(defn main
  []
  (macro-with-three-parameters (> 25 65) (println "Three parameters: true") (println "Three parameters: false"))
  (macro-with-conditional-body-1 (< 1 2) (println "Conditional body 1: true") (println "Conditional body 1: false"))
  (macro-with-conditional-body-2 (< 1 2) (println "Conditional body 2: true") (println "Conditional body 2: false")))