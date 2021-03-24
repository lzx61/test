package atguigu.bigdata.spark.core.test

class SubTask extends Serializable{

  var datas : List[Int] = _

  //val logic= (num,Int)=>{num*2}
  var logic:(Int)=>Int = _

  //计算
  def compute():List[Int]={
    datas.map(logic)
  }

}
