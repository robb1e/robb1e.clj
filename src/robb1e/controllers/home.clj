(ns robb1e.controllers.home
  (:require [compojure.core :refer [defroutes GET]]
            [ring.util.response :as ring]
            [robb1e.views.home :as view]
            [robb1e.models.post :as post]))

(defn routes [db]
  (GET "/" [] (view/index (post/all db))))

