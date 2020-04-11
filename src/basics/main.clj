(ns basics.main  (:require [basics.agents :as agents]
                           [basics.atoms :as atoms]))

(defn -main
  [& args]
  (println "--- Agents ---")
  (agents/main)
  (println "")

  (println "--- Atoms ---")
  (atoms/main)
  (println ""))
