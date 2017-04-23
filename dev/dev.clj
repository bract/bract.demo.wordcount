;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns dev
  (:require
    [clojure.tools.namespace.repl :as ctnr]
    [bract.core.dev  :as bract-dev]
    [bract.core.echo :as bract-echo]))


(defn init
  "Initialize app"
  []
  (bract-dev/init))


(defn deinit
  "De-initialize app"
  []
  (bract-dev/deinit))


(defn reinit
  "Re-initialize app"
  []
  (let [start-millis (System/currentTimeMillis)]
    (bract-dev/deinit)
    (ctnr/refresh :after 'dev/init)  ; refresh namespace and then call 'init'
    (bract-echo/echo (format "Re-initialized app in %dms" (- (System/currentTimeMillis) start-millis)))))