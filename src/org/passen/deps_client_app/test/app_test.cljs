(ns {{raw-name/ns}}.app-test
  (:require
   [clojure.test :refer [deftest is testing use-fixtures]]
   [helix.core :refer [$]]
   [oops.core :as oops]
   [{{raw-name/ns}}.app :as app]
   ["@testing-library/react" :as react-testing-library]))

(use-fixtures :each {:after react-testing-library/cleanup})

(deftest App
  (testing "that we can render the app"
    (let [element (react-testing-library/render ($ app/App))]
      (is (some? (oops/ocall element :queryByText "boof"))))))
