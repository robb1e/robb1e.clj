(ns robb1e.controllers.home
  (:require [compojure.core :refer [defroutes GET]]
            [ring.util.response :as ring]
            [robb1e.views.home :as view]
            [robb1e.models.post :as post]))

(defroutes routes
  (GET "/" [] (view/index (post/all "postgresql://localhost:5432/robb1e"))))
