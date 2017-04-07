;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns bract.demo.wordcount.core
  (:require
    [clojure.string :as string])
  (:import
    [java.io BufferedReader]))


(defn get-word-count
  "Given lines of text and a set of stop words, return the count of words and stop-words."
  [lines stop-set]
  (reduce (fn [kvs each-line]
            (reduce (fn [m word]
                      (update m (if (contains? stop-set word) :stop-word-count :word-count) inc))
              kvs
              (string/split each-line #"\s+")))
    {:word-count 0
     :stop-word-count 0}
    lines))


(defn print-word-count
  [stop-words]
  (let [{:keys [word-count stop-word-count]} (get-word-count (line-seq (java.io.BufferedReader. *in*))
                                               (set stop-words))]
    (println "Word count:" word-count)
    (println "Stop-word count:" stop-word-count)))
