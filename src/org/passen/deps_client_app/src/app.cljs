(ns {{raw-name/ns}}.app
  (:require
   [girouette.core :refer [css]]
   [helix.core :refer [defnc $]]
   [helix.dom :as dom]
   ["react" :as react]
   ["react-dom" :as react-dom]))

(defnc App
  []
  ($ react/StrictMode
     (dom/div
      {:class (css "text-4xl")}
      "{{artifact/id}}")))

(defn start
  []
  (react-dom/render
   ($ App)
   (js/document.getElementById "{{artifact/id}}")))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn init
  []
  (start))
