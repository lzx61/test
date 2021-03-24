package atguigu.bigdata.spark.core.rdd.builder

import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_File_Par {

  def main(args: Array[String]): Unit = {

    //TODO 准备环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(sparkConf)

    //TODO 创建RDD
    //textFile可以将文件作为数据处理的数据源，默认也可以进行分区
    //  minPartitions：最小分区数量，默认为2(真正的分区数可能大于程序设置的)
    //分区数量计算方式：例：totalsize=7,goalsize=7/2=3，分区数7/3=2余1，余数大于goalsize的10%则多一个分区
    // val rdd = sc.textFile("datas/1.txt")
    //如果不想使用默认分区，可以自行设置
    val rdd = sc.textFile("datas/1.txt",2)

    rdd.saveAsTextFile("output")


    //TODO 关闭环境
    sc.stop()

  }

}
