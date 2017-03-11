(ns leap)

(defn leap-year? [y]
  (or
    (= 0 (rem y 400))
    (and
      (= 0 (rem y 4))
      (not (= 0 (rem y 100)))
     )
   )
  )

