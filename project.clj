(defproject bract/bract.demo.wordcount "0.2.0-SNAPSHOT"
  :description "Bract sample application for counting words in a text"
  :url "https://github.com/bract/bract.demo.wordcount"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true
                *assert* true
                *unchecked-math* :warn-on-boxed}
  :min-lein-version "2.7.1"
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [bract/bract.core "0.2.0-SNAPSHOT"]
                 [bract/bract.cli  "0.2.0-SNAPSHOT"]]
  :main ^:skip-aot bract.cli.main
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]}
             :uberjar {:aot [bract.core.main]}})

