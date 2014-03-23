(ns robb1e.models.post-test
  (:require [clojure.test :refer :all]
            [robb1e.models.post :as post]
            [clj-time.core :as tm]
            [clj-time.coerce :as coerce]))

(def db "postgresql://localhost:5432/robb1e_test")

(defn clean-database [f]
  (post/delete-all db)
  (f))

(use-fixtures :each clean-database)

(deftest can-insert-new-post
  (testing "Inserting new records, and retriving those"
    (is (= 0 (count (post/all db))))
    (post/insert db {:excerpt "excerpt" :publication "publication" :uri "uri" :title "Hello, world" :published_at (coerce/to-sql-date (tm/now))})
    (is (= 1 (count (post/all db))))))

(deftest can-get-posts
  (testing "Retriving existing records"
    (post/insert db {:excerpt "excerpt" :publication "publication" :uri "uri" :title "Hello, world" :published_at (coerce/to-sql-date (tm/now))})
    (is (= "Hello, world" ((first (post/all db)) :title)))))
