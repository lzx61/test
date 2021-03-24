package atguigu.bigdata.spark.core.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark03_WordCount {
  def main(args: Array[String]): Unit = {

    //Application
    //Spark框架

    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(sparkConf)

    //TODO 执行业务操作

    val lines:RDD[String] = sc.textFile(path="datas")

    val words:RDD[String] = lines.flatMap(_.split(" "))

    val wordToOne = words.map(word=>(word,1))

    //spark框架提供更多功能，可以将分组和聚合使用一个方法实现
    //reduceByKey:相同的key的数据可以对value进行reduce聚合
    //wordToOne.reduceByKey((x,y)=>{x+y})
    //wordToOne.reduceByKey((x,y)=>x+y)
    val wordToCount = wordToOne.reduceByKey(_+_)

    val array:Array[(String,Int)] = wordToCount.collect()
    array.foreach(println)

    //TODO 关闭连接
    sc.stop()

  }
}
