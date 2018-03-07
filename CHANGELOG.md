# demo.wordcount Change Log


## [WIP] 0.6.0 / 2018-March-??

- Use Bract 0.6.0
  - [TODO] Use the GA version
  - Use `bract.core.main` as entrypoint (main class)
  - Define context entries in `bract-context.edn` and `bract-context.dev.edn`
  - Remove inducer and launcher entries from `baseconfig.edn` and config files


## 0.5.1 / 2018-March-05

- Use Bract 0.5.1
- Use `bract.core.dev-init` to initialize test namespaces


## 0.5.0 / 2018-February-18

- Use Bract 0.5.0
- Use Clojure 1.9.0


## 0.4.1 / 2017-August-08

- Use Bract 0.4.1
- Add `resources/baseconfig.edn` to estalish a base application config
  - Config files `config/config.edn` and `config/config.dev.edn` derive from it


## 0.4.0 / 2017-August-05

- Use Bract 0.4.0
- Rename namespace `demo.wordcount.config` to `demo.wordcount.keydef`


## 0.3.1 / 2017-June-30
- Use Bract 0.3.1 components
- Rename project to `demo.wordcount`


## 0.3.0 / 2017-June-11
### Changed
- Use bract.core 0.3
- Use bract.cli  0.3
- Use bract.dev  0.3
- Use parameterized inducer to avoid inducer config duplication


## 0.2.0 / 2017-June-04
### Changed
- Use bract.core 0.2
- Use bract.cli  0.2
- Use bract.dev  0.2 for REPL-based dev workflow


## 0.1.0 / 2017-April-25
### Added
- Implement word count
- Exclude configured stop words
- Automated tests
  - Using example input
  - Using external config
- REPL based development helpers
