(ns robb1e.core
  (:require [clj-time.core :as tm]
            [clj-time.format :as tf]))

(def short-formatter
  (tf/formatter "MMMM dd, YYYY"))

(defn time-format [time]
  (str (tf/unparse short-formatter time)))
