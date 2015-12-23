(ns polymer.neon.behaviors
  (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def behavior-tags
  ; fn-tag,  elt-tag,  elt-uri,  docstring
  [['animatable :neon-animatable-behavior "neon-animation/neon-animatable-behavior.html"
    "tag: <neon-animatable-behavior>
    uri:  neon-animation/neon-animatable-behavior.html"]
   ['animation :neon-animation-behavior "neon-animation/neon-animation-behavior.html"
    "tag: <neon-animation-behavior>
    uri:  neon-animation/neon-animation-behavior.html"]
   ['animation-runner :neon-animation-runner-behavior
    "neon-animation/neon-animation-runner-behavior.html"
    "tag: <neon-animation-runner-behavior>
    uri:  neon-animation/neon-animation-runner-behavior.html"]
   ['shared-animatable :neon-shared-element-animatable-behavior
    "neon-animation/neon-shared-element-animatable-behavior.html"
    "tag: <neon-shared-element-animatable-behavior>
    uri:  neon-animation/neon-shared-element-animatable-behavior.html"]
   ['shared-animation :neon-shared-element-animation-behavior
    "neon-animation/neon-shared-element-animation-behavior.html"
    "tag: <neon-shared-element-animation-behavior>
    uri:  neon-animation/neon-shared-element-animation-behavior.html"]])

(make-resource-fns :html behavior-tags)

