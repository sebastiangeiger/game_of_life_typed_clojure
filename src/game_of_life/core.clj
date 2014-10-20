(ns game-of-life.core)


(defn equal-generation? [generation-a generation-b]
  (= (set generation-a) (set generation-b)))

(defn next-generation [current]
  current)
