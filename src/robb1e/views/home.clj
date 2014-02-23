(ns robb1e.views.home
  (:require [robb1e.views.layout :as layout]
            [hiccup.core :refer [h]]
            [hiccup.form :as form]))

(defn index []
  (layout/common "hello"))
