(ns app.events
  (:require
   [re-frame.core :as rf]
   [app.db :as db]))

(rf/reg-event-db
 :initialize-db
 (fn [_ _]
   db/default-db))
