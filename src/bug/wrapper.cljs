(ns bug.wrapper
  (:require [bug.jslib :as jslib]
            [cljs.loader :as loader]))

(enable-console-print!)

(defn start []
      (jslib/start))

(loader/set-loaded! :lazy-loaded)
