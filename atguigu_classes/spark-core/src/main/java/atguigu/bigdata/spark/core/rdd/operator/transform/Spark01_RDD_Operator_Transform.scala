package atguigu.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}


object Spark01_RDD_Operator_Transform {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Operator")
    val sc = new SparkContext(sparkConf)

    //TODO 算子-map
    val rdd = sc.makeRDD(List(1, 2, 3, 4))

    def mapFunction():Unit = {

    }
    rdd.map()

    sc.stop()

  }

}
