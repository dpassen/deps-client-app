(ns {{raw-name/ns}}.app
  (:require
   [uix.core :refer [defui $]]))

(defui app
  []
  ($ :div.text-4xl
    "{{artifact/id}}"))
