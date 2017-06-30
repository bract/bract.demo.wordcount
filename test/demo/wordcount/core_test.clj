;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns demo.wordcount.core-test
  (:require
    [clojure.test :refer :all]
    [clojure.string :as string]
    [demo.wordcount.core :as core]
    [demo.wordcount.config :as config]
    [demo.wordcount.test-init :as ti]))


(def sample-text ["A quick brown fox jumped over the lazy dog."
                  "Long,long ago there was a king.He was old."])


(def sample-stop #{"A" "An" "The"})


(deftest test-with-example
  (testing "Simple words"
    (is (= {:word-count 18 :stop-word-count 1}
          (core/get-word-count sample-text sample-stop)))))


(deftest test-with-config
  (testing "Simple words"
    (let [stop-words (config/cfg-stop-words ti/config)]
      (is (= {:word-count 16 :stop-word-count 3}
            (core/get-word-count sample-text (set stop-words)))))))
