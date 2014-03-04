(ns robb1e.models.post
  (:require [clojure.java.jdbc :as sql]))

(use 'clj-time.core)
(use 'clj-time.coerce)

(defn insert [db post]
  (sql/insert! db :posts (merge post {:created_at (to-sql-date (now)) :updated_at (to-sql-date (now))})))

(defn all [db]
  (into [] (sql/query db ["SELECT * FROM posts ORDER BY id DESC"])))

(defn delete-all [db]
  (sql/execute! db ["DELETE FROM posts"]))
