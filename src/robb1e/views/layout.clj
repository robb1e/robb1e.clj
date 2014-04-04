(ns robb1e.views.layout
  (:require [hiccup.page :as h]
            [clojure.data.json :as json]))

(def assets
  ((json/read-str (slurp "resources/public/assets/manifest.json")) "assets"))

(defn asset [file]
  (str "/assets/" (assets file)))

(defn common [body]
  (h/html5
   [:head
    [:title "robb1e dot com"]
    (h/include-css (asset "application.css"))]
   [:body
    [:div {:id "header"}
     [:h1 {:class "container"} "robb1e dot com"]]
    [:div {:id "content" :class "container"} body]]))
