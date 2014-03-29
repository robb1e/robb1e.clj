(ns robb1e.models.post
  (:require [clojure.java.jdbc :as sql]
            [clj-time.core :as tm]
            [clj-time.coerce :as coerce]))

(defn insert [db post]
  (sql/insert! db :posts (merge post {:created_at (coerce/to-sql-date (tm/now)) :updated_at (coerce/to-sql-date (tm/now))})))

(defn all [db]
  (into [] (sql/query db ["SELECT * FROM posts ORDER BY id DESC"])))

(defn delete-all [db]
  (sql/execute! db ["DELETE FROM posts"]))
