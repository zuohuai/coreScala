package com.scala.demo.oop

object OveriteTest {

  def main(args: Array[String]) {
    var myChild = new MyChild("hison.zhang", 13);
    myChild.myFun();
    
    var myParent = new MyParent("hison.zhang",50);
    myParent.myFun();
  }
}

class MyChild(name: String, age: Int) extends MyParent(name, age) {

  println("the primary constructor of MyChild");

  //属性的重写
  override val myName = "MyChild";

  //方法的重写
  override def myFun() {
    println("MyChild -> myFun");
    println(myName);
  }
}

class MyParent(name: String, age: Int) {

  println("the primary constructor of MyParent");

  val myName = "MyParent";

  def myFun() {
    println("MyParent -> myFun");
    println(myName);
  }
}

