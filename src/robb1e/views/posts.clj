(ns robb1e.views.posts
  (:require [robb1e.views.layout :as layout]
            [clj-time.coerce :as coerce]
            [robb1e.core :as core]
            [hiccup.core :as h]))

(defn render-post [post]
  (h/html [:div {:class "Post"}
    [:h1 (post :title)]
    [:div (core/time-format (coerce/from-sql-date (post :created_at)))]]))

(defn render-post-list [posts]
  (h/html [:div {:class "Posts"}
    (map render-post posts)]))
