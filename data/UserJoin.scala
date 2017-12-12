package com.vesper.data

import org.apache.spark.{SparkConf, SparkContext}

object UserJoin {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("MGRDD").setMaster("local[4]")
      .setJars(Seq(""))
    val sc = new SparkContext(sparkConf)
    val data = sc.textFile("hdfs://192.168.19.139:9000/data/")
    case class uesr(date:String,user_id:Int,session_id:String,page_id:Int,action_time:String,search_keyword:String,
                    clivk_vstrgory_id:Int,click_product_id:Int,order_category_ids:String,order_product_ids:String,
                    pay_category_ids:String,pay_product_ids:String)

    val c = data.map(x=>{
      val b = x.split(",")
      uesr(b(0),b(1).toInt,b(2),b(3).toInt,b(4),b(5),b(6).toInt,b(7).toInt,b(8),b(9),b(10),b(11))
    })
    c.map(x=>(x.action_time,x)).collect()
  }
}
