;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns demo.wordcount.init
  (:require
    [demo.wordcount.core   :as core]
    [demo.wordcount.keydef :as kdef]))


(defn start
  "Entry point for Bract to call."
  [context]
  (let [config     (kdef/ctx-bract-cfg  context)
        stop-words (kdef/cfg-stop-words config)]
    (core/print-word-count stop-words))
  context)
