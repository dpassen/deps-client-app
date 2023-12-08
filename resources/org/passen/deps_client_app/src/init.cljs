(ns {{raw-name/ns}}.init
  (:require
   ["react" :as react]
   [{{raw-name/ns}}.app :as app]
   [uix.core :refer [$]]
   [uix.dom]))

(defonce root
  (let [container (js/document.getElementById "{{artifact/id}}")]
    (uix.dom/create-root container)))

(defn start
  []
  (uix.dom/render-root
   ($ react/StrictMode ($ app/app))
   root))

(defn init
  []
  (when ^boolean goog.DEBUG
    (add-tap js/console.log))
  (start))
