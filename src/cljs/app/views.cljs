(ns app.views
  (:require
   [re-frame.core :as rf]
   ["semantic-ui-react" :as ui]))

(defn main-panel []
  (let [name (rf/subscribe [:name])]
    [:div
     [:> ui/Label @name]]))
