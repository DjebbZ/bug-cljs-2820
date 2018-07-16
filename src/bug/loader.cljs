(ns bug.loader
  (:require [cljs.loader :as loader]))

(defn load []
      (loader/load :lazy-loaded
                   (fn []
                       ((resolve 'bug.wrapper/start)))))
