(ns robb1e.views.post-test
  (:require [clojure.test :refer :all]
            [robb1e.views.posts :as post]))

(deftest can-render-post
  (testing "rendering a single post"
    (is (= "<h1>Title</h1>" (post/render-post {:title "Title"} ))))
  (testing "rendering a list of posts"
    (is (= "<div class=\"Posts\"><h1>Title</h1></div>" (post/render-post-list (list {:title "Title"}))))))
