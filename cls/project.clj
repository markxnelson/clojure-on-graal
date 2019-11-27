(defproject cls "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "x"
            :url "x"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main cls.core
  :aot :all 
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repl-options {:init-ns cls.core})
