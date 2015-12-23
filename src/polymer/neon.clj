(ns polymer.neon
  (:require [miraj.markup :refer [make-tag-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def tags
  ["animation"
   "animations"
   "animated-pages"
   "animatable"])

;; (def html5-pragma-directives
;;   "meta http-equiv pragma directives
;;   http://www.w3.org/html/wg/drafts/html/master/semantics.html#pragma-directives"
;;   ["http-equiv"
;;    ;; {fn-name [elt-tag <validation rule>]}
;;   {:content-language ["content-language" {:non-conforming "Authors are
;;   encouraged to use the lang attribute instead."}]
;;    :content-type ["content-type" :encoding-decl]
;;    :default-style ["default-style" :string]
;;    :refresh ["refresh" :refresh-syntax]
;;    :set-cookie ["set-cookie" {:non-conforming "Real HTTP headers should be used instead."}]
;;    ;; HTML 5.1
;;    :content-security-policy ["Content-Security-Policy" :string]
;;    ;; :x-ua-compatible
;;    }])

;; (make-meta-tag-fns html5-pragma-directives)

(make-tag-fns "neon-" tags nil)
