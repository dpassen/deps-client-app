(ns {{raw-name/ns}}.app
  (:require
   [helix.core :refer [defnc $]]
   [helix.dom :as dom]
   ["react" :as react]
   ["react-dom" :as react-dom]))

(defnc App
  []
  ($ react/StrictMode
     (dom/div "{{artifact/id}}")))

(defn start
  []
  (react-dom/render
   ($ App)
   (js/document.getElementById "{{artifact/id}}")))

(defn init
  []
  (start))
