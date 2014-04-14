(ns robb1e.core-test
  (:require [clojure.test :refer :all]
            [robb1e.core :refer :all]
            [clj-time.core :as tm]))

(deftest formats-date

  (testing "date formatter"
    (is (= (time-format (tm/date-time 2014 4 14)), "April 14, 2014"))))
