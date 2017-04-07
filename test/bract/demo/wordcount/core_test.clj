;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns bract.demo.wordcount.core-test
  (:require
    [clojure.test :refer :all]
    [clojure.string :as string]
    [bract.demo.wordcount.core :as core]))


(def sample-ordinary "A quick brown fox jumped over the lazy dog")
(def sample-stop     #{"A" "a" "An" "an" "The" "the"})


(deftest a-test
  (testing "Simple words"
    (is (= {:word-count 7 :stop-word-count 2}
          (core/get-word-count (string/split sample-ordinary #"\r?\n") sample-stop)))))
