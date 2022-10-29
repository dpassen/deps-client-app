(ns {{raw-name/ns}}.app
  (:require
   [girouette.core :refer [css]]
   [helix.core :refer [defnc]]
   [helix.dom :as dom]))

(defnc App
  []
  (dom/div
   {:class (css "text-4xl")}
   "{{artifact/id}}"))
