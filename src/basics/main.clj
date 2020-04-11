(ns basics.main  (:require [basics.agents :as agents]
                           [basics.atoms :as atoms]
                           [basics.closures :as closures]))

(defn -main
  [& args]
  (println "--- Agents ---")
  (agents/main)
  (println "")

  (println "--- Atoms ---")
  (atoms/main)
  (println "")

  (println "--- Closures ---")
  (closures/main)
  (println ""))
