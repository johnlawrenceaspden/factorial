(defproject factorial/factorial "0.1.0-SNAPSHOT"
  :description "Everybody Loves the Factorial Function"
  :url "http://github.com/johnlawrenceaspden/factorial"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]])

;; either lein deploy clojars (in which case it will bother you about passwords), or 

;; lein jar
;; lein pom
;; scp pom.xml target/factorial-0.1.0-SNAPSHOT.jar clojars@clojars.org:

;; to copy it over using your ssh public key