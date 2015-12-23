(ns demo.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [demo.declarative :as decl]
            [miraj.markup :refer [serialize]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/declarative" [] (serialize decl/index))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
