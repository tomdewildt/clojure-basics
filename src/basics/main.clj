(ns basics.main  (:require [basics.agents :as agents]
                           [basics.atoms :as atoms]
                           [basics.closures :as closures]
                           [basics.format :as format]
                           [basics.functions :as functions]
                           [basics.lists :as lists]
                           [basics.loops :as loops]
                           [basics.macros :as macros]
                           [basics.maps :as maps]
                           [basics.math :as math]
                           [basics.operators :as operators]
                           [basics.sets :as sets]
                           [basics.strings :as strings]
                           [basics.structs :as structs]
                           [basics.variables :as variables]
                           [basics.vectors :as vectors]))

(defn -main
  []
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
  (println "")

  (println "--- Maps ---")
  (maps/main)
  (println "")

  (println "--- Math ---")
  (math/main)
  (println "")

  (println "--- Operators ---")
  (operators/main)
  (println "")

  (println "--- Sets ---")
  (sets/main)
  (println "")

  (println "--- Strings ---")
  (strings/main)
  (println "")

  (println "--- Structs ---")
  (structs/main)
  (println "")

  (println "--- Variables ---")
  (variables/main)
  (println "")

  (println "--- Vectors ---")
  (vectors/main)
  (println ""))
