(ns robb1e.views.post-test
  (:require [clojure.test :refer :all]
            [robb1e.views.posts :as post]
            [robb1e.core :as core]
            [clj-time.format :as tf]
            [clj-time.core :as tm]
            [clj-time.coerce :as coerce]))

(defn date-test []
  (coerce/to-sql-date (tm/date-time 2014 4 14)))

(deftest can-render-post

  (testing "rendering a single post"
    (is (= "<div class=\"Post\"><h1>Title</h1><div>April 14, 2014</div></div>" (post/render-post {:title "Title" :created_at (date-test)} ))))

  (testing "rendering a list of posts"
    (is (= "<div class=\"Posts\"><div class=\"Post\"><h1>Title</h1><div>April 14, 2014</div></div></div>" (post/render-post-list (list {:title "Title" :created_at (date-test)}))))))
