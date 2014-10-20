(ns game-of-life.core-test
  (:require [clojure.test :refer :all]
            [game-of-life.core :refer :all]))

(deftest equal-generation-test
         (is (equal-generation? [[4 2] [3 2] [1 2]]
                                [[4 2] [3 2] [1 2]]))
         (is (not (equal-generation? [[4 2] [3 2] [1 2]]
                                     [[2 2] [3 2] [1 2]]))))

(deftest next-generation-test
         (let [blinker-1 [[1 2] [2 2] [3 2]]
               blinker-2 [[2 1] [2 2] [2 3]]]
           (is (equal-generation? (next-generation blinker-1) blinker-2))))
