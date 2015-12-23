(ns demo.declarative
  (:require [miraj.html :as h]
            [polymer.neon :as neon]))
            ;; [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def index
  (h/html
   (h/head
    (h/title "neon-animated-pages demo: declarative")
    (h/meta {:charset "utf-8"})
    (h/meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"})
    (h/meta {:name "viewport"
             :content "width=device-width, minimum-scale=1.0, initial-scale=1, user-scalable=yes"})

    ;; (h/viewport {:width "device-width" :minimum-scale 1.0 :initial-scale 1 :user-scalable true}

    (h/script {:src "bower_components/webcomponentsjs/webcomponents-lite.js"})
    (h/link {:rel "import" :href "bower_components/paper-styles/paper-styles.html"})
    (h/link {:rel "import" :href "bower_components/neon-animation/neon-animated-pages.html"})
    (h/link {:rel "import" :href "bower_components/neon-animation/neon-animatable.html"})
    (h/link {:rel "import" :href "bower_components/neon-animation/neon-animations.html"})

    (h/style (str
      "body {
        overflow: hidden;
      }

      .toolbar {
        padding: 8px;
      }"
    ))

    (h/style {:is "custom-style"}
             (str "
      neon-animatable {
        color: white;
        @apply(--layout-horizontal);
        @apply(--layout-center-center);
        @apply(--paper-font-display4);
      }

      neon-animatable:nth-child(1) {
        background: var(--paper-red-500);
      }

      neon-animatable:nth-child(2) {
        background: var(--paper-blue-500);
      }

      neon-animatable:nth-child(3) {
        background: var(--paper-orange-500);
      }

      neon-animatable:nth-child(4) {
        background: var(--paper-green-500);
      }

      neon-animatable:nth-child(5) {
        background: var(--paper-purple-500);
      }")))

  (h/body {:class "fullbleed layout vertical"}

    (h/template {:is "dom-bind"}

      (h/div {:class "toolbar"}
        (h/button {:on-click "_onPrevClick"} "<<")
        (h/button {:on-click "_onNextClick"} ">>"))

      (neon/pages
       {:id "pages" :class "flex"
        :selected :selected
        :entry-animation :entryAnimation
        :exit-animation :exitAnimation}
        (neon/animatable 1)
        (neon/animatable 2)
        (neon/animatable 3)
        (neon/animatable 4)
        (neon/animatable 5)))

    (h/script "

      var scope = document.querySelector('template[is=\"dom-bind\"]');
      scope.selected = 0;

      scope._onPrevClick = function() {
        this.entryAnimation = 'slide-from-left-animation';
        this.exitAnimation = 'slide-right-animation';
        this.selected = this.selected === 0 ? 4 : (this.selected - 1);
      }

      scope._onNextClick = function() {
        this.entryAnimation = 'slide-from-right-animation';
        this.exitAnimation = 'slide-left-animation';
        this.selected = this.selected === 4 ? 0 : (this.selected + 1);
      }"))))

