(ns robb1e.web
  (:require [compojure.core :refer [defroutes]]
            [ring.adapter.jetty :as container]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [robb1e.controllers.home :as homeController])
  (:gen-class))

(defroutes routes
  homeController/routes
  (route/resources "/"))

(def application (handler/site routes))

(defn start [port]
  (container/run-jetty application {:port port :join? false}))

(defn -main []
  (start 8080))
