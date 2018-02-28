# demo.wordcount

A minimal demo command-line app for the Bract framework. The problem statement this app solves is as follows:

- Count and report the number of words in a given text passed via STDIN.
- Exclude the configured stop words from the count.


## Usage

### Running the application

You can build the app locally and run it as follows:

```shell
$ lein do clean, uberjar
$ echo "A quick brown fox" | java -jar target/uberjar/demo.wordcount-0.5.1-SNAPSHOT-standalone.jar -f config/config.edn
```


### REPL based development

The `dev/user.clj` file is loaded when you run `lein repl` where the following may be helpful:

```clojure
(go)       ; stop app if running, then reload namespaces and reinit
(reset)    ; same as (go)
(start)    ; start the application
(stop)     ; stop app if running, leaving it still initialized
(restart)  ; stop app if running, reload namespaces, reinitialize and start up
(verbose true) ; enable verbose mode
(config "config/config.qa.edn") ; switch config file
```


## License

Copyright © 2017-2018 Shantanu Kumar (kumar.shantanu@gmail.com, shantanu.kumar@concur.com)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
