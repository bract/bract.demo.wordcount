# demo.wordcount

A minimal demo command-line app for the Bract framework. The problem statement this app solves is as follows:

- Count and report the number of words in a given text passed via STDIN.
- Exclude the configured stop words from the count.


## Usage

### Running the application

You can build the app locally and run it as follows:

```shell
$ lein do clean, uberjar
$ echo "A quick brown fox" | java -jar target/uberjar/demo.wordcount-0.6.2-standalone.jar -f config/config.edn
```

### REPL based development

Run `lein do clean, repl` to launch the REPL:

```clojure
bract.dev.repl=> (help)  ; shows the help screen
```

### Running tests

Run tests using `lein do clean, test` command.


## License

Copyright © 2017-2021 [Shantanu Kumar](https://github.com/kumarshantanu)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
