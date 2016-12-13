package com.scala.demo.oop

object ClassGenericTest {
  def main(args: Array[String]) {
    methdod1("Hello World, method 1");
    methdod1(1);
  }

  //泛型函数
  def methdod1[Integer](param: Integer) {
    println(param);
  }

  val c = new Compare("S", "H");
  println(c.compare);
  
  var t1 = new Teacher5(1);
  var t2 = new Teacher5(2);
  var t = new Compare2(t1, t2)
  println("replace:"+t.replay(t1));
}

//左侧必须是Comparable的子类
class Compare[T <: Comparable[T]](val num1: T, val num2: T) {
  def compare = if (num1.compareTo(num2) < 0) num1 else num2;
}


class Compare2[T](val num1: T, val num2: T) {
  //f 必须要是T的父类
  def replay[F >: T](f: F) = new Compare2(f, num2);
}

class Person5(val id: Int);

class Teacher5(val id2: Int) extends Person5(id2);