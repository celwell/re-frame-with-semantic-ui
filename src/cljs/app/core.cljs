(ns app.core
  (:require
   [reagent.core :as r]
   [re-frame.core :as rf]
   [app.config :as config]
   [app.subs]
   [app.events]
   [app.views :as views]))

(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)
  (r/render [views/main-panel]
            (.getElementById js/document "app")))

(defn init []
  (rf/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
