(defproject bract/demo.wordcount "0.3.1-SNAPSHOT"
  :description "Bract sample application for counting words in a text"
  :url "https://github.com/bract/demo.wordcount"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true
                *assert* true
                *unchecked-math* :warn-on-boxed}
  :min-lein-version "2.7.1"
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [bract/bract.cli     "0.3.0"]]
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[bract/bract.dev "0.3.0"]]
                   :source-paths ["dev"]}
             :uberjar {:aot [bract.cli.main]
                       :main ^:skip-aot bract.cli.main}})
