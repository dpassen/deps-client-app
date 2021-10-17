((clojurescript-mode
  (cider-preferred-build-tool . shadow-cljs)
  (cider-default-cljs-repl . shadow)
  (cider-shadow-default-options . "{{artifact/id}}")
  (cider-shadow-watched-builds . ("{{artifact/id}}" "test"))))
