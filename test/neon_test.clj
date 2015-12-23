(ns neon-test
  (:require [polymer.neon :as neon]
            [polymer.neon.animation :as anim]))

(println neon/tags)
(println anim/animation-tags)

(neon/animation)
(neon/animations)
(neon/animatable)
(neon/pages)

(anim/cascaded)
(anim/fade-in)

(require '(polymer [neon :as neon]))
(require '(polymer.neon [animations :as anim]))
(anim/slide-down)

(require '(polymer.neon [behaviors :as beh]))
(beh/animatable)
(beh/shared-animatable)



