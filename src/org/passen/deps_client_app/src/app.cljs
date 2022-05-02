(ns {{raw-name/ns}}.app
  (:require
   [girouette.core :refer [css]]
   [helix.core :refer [defnc $]]
   [helix.dom :as dom]
   ["react" :as react]
   ["react-dom/client" :as react-dom]))

(defnc App
  []
  ($ react/StrictMode
     (dom/div
      {:class (css "text-4xl")}
      "{{artifact/id}}")))

(defonce root
  (let [container (js/document.getElementById "{{artifact/id}}")]
    (react-dom/createRoot container)))

(defn start
  []
  (.render root ($ App)))

(defn add-console-tap!
  []
  (when js/goog.DEBUG
    (add-tap js/console.log)))

(defn init
  []
  (add-console-tap!)
  (start))
