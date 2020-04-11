(ns basics.main  (:require [basics.agents :as agents]
                           [basics.atoms :as atoms]
                           [basics.closures :as closures]
                           [basics.format :as format]))

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
  (println "")

  (println "--- Format ---")
  (format/main)
  (println ""))
