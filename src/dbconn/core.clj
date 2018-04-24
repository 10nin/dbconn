(use 'koma.db)
(require '[clojure.string :as str])

(def db {:classname "org.h2.Driver"
         :subprotocol "h2"
         :subname "resources/db/koma.db"})

(defdb koma-db db)

