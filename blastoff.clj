;;; countdown and BLASTOFF

(defn countdown
	[x]
	(if (zero? x)
		(println "BLAST OFF!")
		(do
			(println x)
			(recur (dec x)))))
			
(countdown 10)
