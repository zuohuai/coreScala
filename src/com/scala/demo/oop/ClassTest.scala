package com.scala.demo.oop

class ClassTest extends Parent{

  var name: String = _; // 使用占位符进行初始化
  
  private[this] var a : Int = 100; // private[this] 和 this的区别
  
  private def myFun(){
    
  }
}

class Person(val name : String, val age : Int){
  println("this is primary constructor");
}

object ClassTest{
  
  def main(args:Array[String]){
    val person = new Person("hison.zhang", 10);
    println(person.age );
  }
}