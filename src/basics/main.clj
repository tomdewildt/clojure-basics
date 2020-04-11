(ns basics.main  (:require [basics.agents :as agents]))

(defn -main
  [& args]
  (println "--- Agents ---")
  (agents/main)
  (println ""))
