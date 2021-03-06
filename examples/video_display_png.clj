(ns clj-drone.example.video
  (:require [clj-drone.core :refer :all]
            [clj-drone.video :refer :all]))

;This video input from the drone is h264.  It is converted to png and
;displayed to the viewer
(drone-initialize)
(init-video (drone-ip drone-host))
(start-video (drone-ip drone-host))
(end-video)
