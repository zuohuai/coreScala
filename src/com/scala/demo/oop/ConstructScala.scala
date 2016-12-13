package com.scala.demo.oop

//1.定义主构造方法
class ConstructTest(val name: String) {

  var gender: String = _;
  //2.定义附属构造方法
  def this(name: String, age: Int, gender: String) {

    //3.附属构造方法必须调用主构造方法
    this(name);
    this.gender = gender;
  }
}

object ConstructScala {

  def main(args: Array[String]) {
    var construnct = new ConstructTest("hison.zhang", 10, "male");
    
    println(construnct.name +", "+ construnct.gender);
    
  }
}