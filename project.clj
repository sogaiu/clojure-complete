(defproject clojure-complete "0.2.6-SNAPSHOT"
  :description "Standalone completion library adapted from swank-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/ninjudd/clojure-complete"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {
    :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
    :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
    :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}})
