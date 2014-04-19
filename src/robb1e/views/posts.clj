(ns robb1e.views.posts
  (:require [robb1e.views.layout :as layout]
            [clj-time.coerce :as coerce]
            [robb1e.core :as core]
            [hiccup.core :as h]))

(defn render-post [post]
  (h/html [:div {:class (str "Post--" (post :publication) )}
    [:h2 (post :title)]
    [:div {:class "Post__Published"} (core/time-format (coerce/from-sql-date (post :created_at)))]
    [:div {:class "Post__Excerpt"} (post :excerpt)]]))

(defn render-post-list [posts]
  (h/html [:section {:class "Posts"}
    (map render-post posts)]))
