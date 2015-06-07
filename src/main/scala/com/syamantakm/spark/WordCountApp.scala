package com.syamantakm.spark

import org.apache.spark.{SparkContext, SparkConf}

/**
 * @author syamantak.
 */
object WordCountApp {

  def main(args: Array[String]) {
    val logFile = "input/input1.txt" // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val wordCount = logData.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b).collect()
    println("###### Word count ######")
    wordCount.foreach(e => println(s"${e._1} : ${e._2}"))
  }

}
