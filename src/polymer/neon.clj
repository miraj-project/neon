(ns polymer.neon
  (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def neon-tags
  ; fn-tag,  elt-tag,  elt-uri,  docstring
  [['animatable :neon-animatable "neon-animation/neon-animatable.html"
    "tag: <neon-animatable>
    uri:  neon-animation/neon-animatable.html"]
   ['animation :neon-animation "neon-animation/neon-animation.html"
    "tag: <neon-animation>
    uri:  neon-animation/neon-animation.html"]
   ['animations :neon-animations "neon-animation/neon-animations.html"
    "tag: <neon-animations>
    uri:  neon-animation/neon-animations.html"]
   ['pages :neon-animated-pages "neon-animation/neon-animated-pages.html"
    "tag: <neon-animated-pages>
    uri:  neon-animation/neon-animated-pages.html"]])

(make-resource-fns :html neon-tags)
