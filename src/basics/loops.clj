(ns basics.loops)

#_{:clj-kondo/ignore [:inline-def]}
(defn main
  []
  ;; Define atom variable
  (def atom-variable (atom 1))

  ;; While loop
  (while (<= @atom-variable 5)
    (do
      (println "While loop:" @atom-variable)
      (swap! atom-variable inc)))

  ;; Dotimes loop
  (dotimes [i 5]
    (println "Dotimes loop:" (* i 2)))

  ;; Loop
  (loop [i 1]
    (when (< i 5)
      (println "Loop:" (* i 3))
      (recur (+ i 1))))

  ;; Doseq loop
  (doseq [x [5 6 7]]
    (println "Doseq loop:" x)))