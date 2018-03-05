(defproject bract/demo.wordcount "0.5.1"
  :description "Bract sample application for counting words in a text"
  :url "https://github.com/bract/demo.wordcount"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true
                *assert* true
                *unchecked-math* :warn-on-boxed}
  :min-lein-version "2.7.1"
  :pedantic? :warn
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [bract/bract.cli     "0.5.1"]]
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[bract/bract.dev "0.5.1"]]
                   :source-paths ["dev"]}
             :uberjar {:aot [bract.cli.main]
                       :main ^:skip-aot bract.cli.main
                       :pedantic? :abort}})
