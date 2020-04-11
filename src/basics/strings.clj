(ns basics.strings
  (:require [clojure.string :as str]))

(defn main
  []
  ;; Define string variable
  (def string-variable "Test")

  ;; Blank
  (println "Blank:" (str/blank? string-variable))

  ;; Includes
  (println "Include:" (str/includes? string-variable "Test"))

  ;; Index
  (println "Index:" (str/index-of string-variable "T"))

  ;; Split
  (println "Split:" (str/split string-variable #" "))

  ;; Join
  (println "Join:" (str/join " " ["This", "is", "a", "test"]))

  ;; Replace
  (println "Replace:" (str/replace "I'am 18 years old" #"18" "19"))

  ;; Trim left
  (println "Trim left:" (str/triml " Test "))

  ;; Trim right
  (println "Trim right:" (str/trimr " Test "))

  ;; Trim new line
  (println "Trim new line:" (str/trim-newline "Test\n\r"))

  ;; Uppercase
  (println "Uppercase:" (str/upper-case string-variable))

  ;; Lowercase
  (println "Lowercase:" (str/lower-case string-variable)))