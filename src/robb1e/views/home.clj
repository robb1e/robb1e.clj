(ns robb1e.views.home
  (:require [robb1e.views.layout :as layout]
            [robb1e.views.posts :as posts]
            [hiccup.core :as h]))

(defn index [post-list]
  (layout/common (posts/render-post-list post-list)))
