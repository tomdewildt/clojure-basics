(ns basics.format)

(defn main
  []
  ;; Define variables
  (def string-variable "Test")
  (def double-variable 1.234)
  (def long-variable 10)

  ;; Format string
  (println (format "Format string: %s" string-variable))

  ;; Five leading spaces
  (println (format "Five leading spaces: %5d", long-variable))

  ;; Two leading zeros
  (println (format "Two leading zeros: %04d", long-variable))

  ;; Two trailing zeros
  (println (format "Two trailing zeros: %-4d", long-variable))

  ;; Three decimals
  (println (format "Three decimals: %.3f", double-variable)))