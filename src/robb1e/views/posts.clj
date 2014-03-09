(ns robb1e.views.posts
  (:require [robb1e.views.layout :as layout]
            [hiccup.core :as h]))

(defn render-post [post]
  (h/html [:h1 (post :title)]))

(defn render-post-list [posts]
  (h/html [:div {:class "Posts"}
    (map render-post posts)]))
