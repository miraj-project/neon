(ns polymer.neon.animations
  (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def animation-tags
  ; fn-tag,  elt-tag,  elt-uri,  docstring
  [['cascaded :cascaded-animation "neon-animation/animations/cascaded-animation.html"
    "tag: <cascaded-animation>
    uri:  neon-animation/animations/cascaded-animation.html"]
   ['fade-in :fade-in-animation "neon-animation/animations/fade-in-animation.html"
    "tag: <fade-in-animation>
    uri:  neon-animation/animations/fade-in-animation.html"]
   ['fade-out :fade-out-animation "neon-animation/animations/fade-out-animation.html"
    "tag: <fade-out-animation>
    uri:  neon-animation/animations/fade-out-animation.html"]
   ['hero :hero-animation "neon-animation/animations/hero-animation.html"
    "tag: <hero-animation>
    uri:  neon-animation/animations/hero-animation.html"]
   ['opaque :opaque-animation "neon-animation/animations/opaque-animation.html"
    "tag: <opaque-animation>
    uri:  neon-animation/animations/opaque-animation.html"]
   ['reverse-ripple :reverse-ripple-animation "neon-animation/animations/reverse-ripple-animation.html"
    "tag: <reverse-ripple-animation>
    uri:  neon-animation/animations/reverse-ripple-animation.html"]
   ['ripple :ripple-animation "neon-animation/animations/ripple-animation.html"
    "tag: <ripple-animation>
    uri:  neon-animation/animations/ripple-animation.html"]
   ['scale-down :scale-down-animation "neon-animation/animations/scale-down-animation.html"
    "tag: <scale-down-animation>
    uri:  neon-animation/animations/scale-down-animation.html"]
   ['scale-up :scale-up-animation "neon-animation/animations/scale-up-animation.html"
    "tag: <scale-up-animation>
    uri:  neon-animation/animations/scale-up-animation.html"]
   ['slide-down :slide-down-animation "neon-animation/animations/slide-down-animation.html"
    "tag: <slide-down-animation>
    uri:  neon-animation/animations/slide-down-animation.html"]
   ['slide-up :slide-up-animation "neon-animation/animations/slide-up-animation.html"
    "tag: <slide-up-animation>
    uri:  neon-animation/animations/slide-up-animation.html"]
   ['slide-left :slide-left-animation "neon-animation/animations/slide-left-animation.html"
    "tag: <slide-left-animation>
    uri:  neon-animation/animations/slide-left-animation.html"]
   ['slide-right :slide-right-animation "neon-animation/animations/slide-right-animation.html"
    "tag: <slide-right-animation>
    uri:  neon-animation/animations/slide-right-animation.html"]
   ['slide-from-left :slide-from-left-animation "neon-animation/animations/slide-from-left-animation.html"
    "tag: <slide-from-left-animation>
    uri:  neon-animation/animations/slide-from-left-animation.html"]
   ['slide-from-right :slide-from-right-animation
    "neon-animation/animations/slide-from-right-animation.html"
    "tag: <slide-from-right-animation>
    uri:  neon-animation/animations/slide-from-right-animation.html"]
   ['transform :transform-animation "neon-animation/animations/transform-animation.html"
    "tag: <transform-animation>
    uri:  neon-animation/animations/transform-animation.html"]])

;;(make-tag-fns "neon-" polymer-neon-animation-tags nil)

(make-resource-fns :html animation-tags)

