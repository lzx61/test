package atguigu.bigdata.spark.core.rdd.builder

import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_File_Par1 {

  def main(args: Array[String]): Unit = {

    //TODO 准备环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(sparkConf)

    //TODO 创建RDD
    //分区数量计算方式：例：totalsize=7,goalsize=7/2=3，分区数7/3=2余1，余数大于goalsize的10%则多一个分区
    //TODO 数据分区的分配
    //1.数据以行为单位读取   spark读取文件以Hadoop的方式，和字节数没关系
    //2.数据读取时以偏移量为单位,已经读取过的不再重复读取

    val rdd = sc.textFile("datas/word.txt",3)

    rdd.saveAsTextFile("output")


    //TODO 关闭环境
    sc.stop()

  }

}
