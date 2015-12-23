(ns neon-test
  (:require [polymer.neon :as neon]
            [polymer.neon.animation :as anim]))

(println neon/tags)
(println anim/animation-tags)

(neon/animation)
(neon/animatable)
(neon/animated-pages)

(anim/cascaded)
(anim/fade-in)


