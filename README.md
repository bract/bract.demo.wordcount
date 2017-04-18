# bract.demo.wordcount

A minimal demo command-line app for the Bract framework. The problem statement this app solves is as follows:

- Count and report the number of words in a given text passed via STDIN.
- Exclude the configured stop words from the count.


## Usage

You can build the app locally and run it as follows:

```shell
$ lein do clean, uberjar
$ echo "A quick brown fox" | java -jar target/uberjar/bract.demo.wordcount-0.1.0-SNAPSHOT-standalone.jar -vf config.edn
```

Alternatively, you may like to run it as follows:

```shell
$ echo "A quick brown fox" | lein do clean, run -vf config.edn
```


## License

Copyright © 2017 Shantanu Kumar (kumar.shantanu@gmail.com, shantanu.kumar@concur.com)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
