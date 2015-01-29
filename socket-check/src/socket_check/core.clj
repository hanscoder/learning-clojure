(ns socket-check.core
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn -main
  "I don't do a whole lot."
  [& args]
  (try
    (do
      (let [s (java.net.Socket. (first args) 80)]
       (.getOutputStream s))
       (println (first args) " ok"))
    (catch Exception e (str "could not connect to" (first args) (.getMessage e)))
  )

  )
