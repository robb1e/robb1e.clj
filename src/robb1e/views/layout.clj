(ns robb1e.views.layout
  (:require [hiccup.page :as h]))

(defn common [body]
  (h/html5
   [:head
    [:title "robb1e dot com"]
    (h/include-css "/stylesheets/application.css")]
   [:body
    [:div {:id "header"}
     [:h1 {:class "container"} "robb1e dot com"]]
    [:div {:id "content" :class "container"} body]]))
