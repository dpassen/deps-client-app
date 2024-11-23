(ns preload
  (:require
   [cljs-react-devtools.core :as cljs-react-devtools]))

(cljs-react-devtools/init!
 {:root     (js/document.getElementById "{{artifact/id}}")
  :shortcut "Control-Shift-Meta-R"})
