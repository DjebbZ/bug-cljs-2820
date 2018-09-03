(ns bug.wrapper
  (:require [cljs.loader :as loader]))

(enable-console-print!)

(defn start []
      (println "I, cljs, have been lazy-loaded successfully"))

(loader/set-loaded! :lazy-loaded)
