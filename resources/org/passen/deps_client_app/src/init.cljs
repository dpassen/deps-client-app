(ns {{raw-name/ns}}.init
  (:require
   ["react" :as react]
   ["react-dom/client" :as react-dom]
   [helix.core :refer [$]]
   [{{raw-name/ns}}.app :as app]))

(defonce root
  (let [container (js/document.getElementById "{{artifact/id}}")]
    (react-dom/createRoot container)))

(defn start
  []
  (.render root ($ react/StrictMode ($ app/App))))

(defn add-console-tap!
  [debug?]
  (when debug?
    (add-tap js/console.log)))

(defn init
  []
  (add-console-tap! goog.DEBUG)
  (start))
