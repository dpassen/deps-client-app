(ns {{raw-name/ns}}.init
  (:require
   ["react" :as react]
   ["react-dom/client" :as react-dom]
   [helix.core :refer [$]]
   [oops.core :as oops]
   [{{raw-name/ns}}.app :as app]))

(defonce root
  (let [container (oops/ocall js/document :getElementById "{{artifact/id}}")]
    (react-dom/createRoot container)))

(defn start
  []
  (oops/ocall root :render ($ react/StrictMode ($ app/App))))

(defn init
  []
  (when ^boolean goog.DEBUG
    (add-tap js/console.log))
  (start))
