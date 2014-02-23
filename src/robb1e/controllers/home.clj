(ns robb1e.controllers.home
  (:require [compojure.core :refer [defroutes GET]]
            [ring.util.response :as ring]
            [robb1e.views.home :as view]))

(defroutes routes
  (GET "/" [] (view/index)))
