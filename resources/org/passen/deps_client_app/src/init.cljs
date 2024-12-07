(ns {{raw-name/ns}}.init
  (:require
   [{{raw-name/ns}}.app :as app]
   [uix.core :as uix :refer [$]]
   [uix.dom]))

(defonce root
  (let [element (js/document.getElementById "{{artifact/id}}")]
    (uix.dom/create-root element)))

(defn start
  []
  (uix.dom/render-root
   ($ uix/strict-mode
     ($ app/app))
   root))

(defn init
  []
  (when ^boolean goog.DEBUG
    (add-tap js/console.log))
  (start))
