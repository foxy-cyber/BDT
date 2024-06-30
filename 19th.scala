import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.SparkConf
val ssc = new StreamingContext(sc, Seconds(5))

    // Create a DStream that will connect to localhost:9999
    val lines = ssc.socketTextStream("localhost", 9999)

    // Split each line into words
    val words = lines.flatMap(_.split(" "))

    // Map each word to (word, 1) and then reduce by key to count occurrences
    val wordCounts = words.map(word => (word, 1)).reduceByKey(_ + _)

   wordCounts.print

    ssc.start()