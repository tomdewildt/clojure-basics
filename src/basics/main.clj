(ns basics.main  (:require [basics.agents :as agents]
                           [basics.atoms :as atoms]
                           [basics.closures :as closures]
                           [basics.format :as format]
                           [basics.functions :as functions]
                           [basics.lists :as lists]
                           [basics.loops :as loops]
                           [basics.macros :as macros]))

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
  (println "")

  (println "--- Functions ---")
  (functions/main)
  (println "")

  (println "--- Lists ---")
  (lists/main)
  (println "")

  (println "--- Loops ---")
  (loops/main)
  (println "")

  (println "--- Macros ---")
  (macros/main)
  (println ""))
