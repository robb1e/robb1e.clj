(defproject robb1e "0.1.0-SNAPSHOT"
  :description "Personal website for robb1e"
  :url "https://github.com/robb1e/robb1e.clj"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [hiccup "1.0.4"]
                 [compojure "1.1.6"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [postgresql "9.1-901.jdbc4"]
                 [clj-time "0.6.0"]]
  :main robb1e.web
  :plugins [[lein-haml-sass "0.2.7-SNAPSHOT"]]
  :sass {:src "resources/sass"
         :output-directory "resources/public/stylesheets"
         :output-extension "css"
         ;; Other options (provided are default values)
         ;; :auto-compile-delay 250
         ;; :delete-output-dir true ;; -> when running lein clean it will delete the output directory if it does not contain any file
         ;; :ignore-hooks [:clean :compile :deps] ;; -> if you use the hooks, this option allows you to remove some hooks that you don't want to run
         ;; :gem-version "3.2.1"
         }
  )
