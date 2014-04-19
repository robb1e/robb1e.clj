(ns robb1e.views.post-test
  (:require [clojure.test :refer :all]
            [robb1e.views.posts :as post]
            [robb1e.core :as core]
            [clj-time.format :as tf]
            [clj-time.core :as tm]
            [clj-time.coerce :as coerce]))

(defn date-test []
  (coerce/to-sql-date (tm/date-time 2014 4 14)))

(defn post-entry []
  {:title "Title" :created_at (date-test) :publication "personal" :excerpt "Excerpt"})

(deftest can-render-post

  (testing "rendering a single post"
    (is (= "<div class=\"Post--personal\"><h2>Title</h2><div class=\"Post__Published\">April 14, 2014</div><div class=\"Post__Excerpt\">Excerpt</div></div>" (post/render-post (post-entry)))))

  (testing "rendering a list of posts"
    (is (= "<section class=\"Posts\"><div class=\"Post--personal\"><h2>Title</h2><div class=\"Post__Published\">April 14, 2014</div><div class=\"Post__Excerpt\">Excerpt</div></div></section>" (post/render-post-list (list (post-entry)))))))
