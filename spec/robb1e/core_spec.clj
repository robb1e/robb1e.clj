(ns robb1e.core-spec
  (:require [speclj.core :refer :all]))

(describe "truthiness"
  (it "tests if true"
    (should true)))

(run-specs)
