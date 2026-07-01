(ns kami_engine_script_runtime-test
  (:require [clojure.test :refer [deftest is testing]]
            [kami_engine_script_runtime]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? kami_engine_script_runtime))))
