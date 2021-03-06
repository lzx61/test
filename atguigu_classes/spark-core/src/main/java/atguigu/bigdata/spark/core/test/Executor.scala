package atguigu.bigdata.spark.core.test

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object Executor {

  def main(args: Array[String]): Unit = {
    //启动服务器，接收数据
    val server = new ServerSocket(9999)
    println("服务器启动，等待接收数据")

    //等待客户端连接
    val client : Socket = server.accept()
    val in:InputStream = client.getInputStream
    val objIn = new ObjectInputStream(in)
    val subTask:SubTask = objIn.readObject().asInstanceOf[SubTask]
    val ints:List[Int] = subTask.compute()
    println("计算节点[9999]计算的结果为："+ints)
    objIn.close()
    client.close()
    server.close()

  }

}
