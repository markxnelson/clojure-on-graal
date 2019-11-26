(ns cls.core
  (:gen-class))

(defn print-details 
  "Print out details for a file"
  [file]
  (println (.getName file)))

(defn -main
  "List files."
  [& args]
  (let [directory (System/getProperty "user.dir")
        files (.listFiles (clojure.java.io/file directory))]
    (doall (map print-details (sort files)))))
