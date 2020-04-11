(ns basics.atoms)

(defn main
  []
  ;; Define atom variable
  (def atom-variable (atom 5))

  ;; Create watcher
  (add-watch atom-variable :watcher
             (fn [_ _ old-state new-state]
               (println "Atom state changed from"
                        old-state "to" new-state)))

  ;; Value of atom
  (println "Value of atom:" @atom-variable)

  ;; Change atom value
  (reset! atom-variable 10)

  ;; Value of atom
  (println "Value of atom: " @atom-variable)

  ;; Increment atom value
  (swap! atom-variable inc)

  ;; Value of atom
  (println "Value of atom: " @atom-variable))
