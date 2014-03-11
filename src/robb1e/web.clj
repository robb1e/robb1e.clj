(ns robb1e.web
  (:require [compojure.core :refer [defroutes]]
            [ring.adapter.jetty :as container]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [robb1e.controllers.home :as homeController])
  (:gen-class))

(def port
  (Integer. (or (System/getenv "PORT") "8080")))

(def db
  (or (System/getenv "DATABASE_URL") "postgresql://localhost:5432/robb1e"))

(defroutes routes
  (homeController/routes db)
  (route/resources "/"))

(def application (handler/site routes))

(defn start [port]
  (container/run-jetty application {:port port :join? false}))

(defn -main []
  (start port))
