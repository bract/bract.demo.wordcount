(defproject bract/demo.wordcount "0.6.2-SNAPSHOT"
  :description "Bract sample application for counting words in a text"
  :url "https://github.com/bract/demo.wordcount"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true
                *assert* true
                *unchecked-math* :warn-on-boxed}
  :min-lein-version "2.7.1"
  :pedantic? :warn
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [bract/bract.cli     "0.6.2-0.1.1-alpha4"]]
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[bract/bract.dev "0.6.2-0.2.0-alpha4"]]
                   :repl-options {:init-ns bract.dev.repl
                                  :port 3001}
                   :main ^:skip-aot bract.core.dev}
             :uberjar {:aot [bract.core.main]
                       :main ^:skip-aot bract.core.main
                       :pedantic? :abort}})
