package com.scala.demo.oop

/**
 * 用来简化类的创建
 */
object ApplyTest{
  def apply() = new ApplyTest;
  
  def main(args : Array[String]){
    var test = new ApplyOperation;
  }
}

class ApplyTest {
  def haveAtry {
    println("have a try on apply");
  }
}
class ApplyOperation extends App {
  val a =  ApplyTest();
  a.haveAtry;
}