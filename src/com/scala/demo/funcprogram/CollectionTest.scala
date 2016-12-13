package com.scala.demo.funcprogram

import scala.collection.immutable.Nil
import scala.collection.mutable.ListBuffer
import scala.collection.SortedSet

object CollectionTest {
  def main(args: Array[String]) {

    //不可以变map
    var mapResult = Map("spark" -> 5, "hadoop" -> 7);
    println(mapResult);
    //可变map
    var mutableMap = scala.collection.mutable.Map("spark" -> 5);
    println(mutableMap);

    println(1 to 10);
    println(1 until 10);

    //Range函数的使用
    println(Range(1, 10));
    println(Range(1, 10, 2));
    println(Range(1, 10, -1));
    println(Range(10, 1, -1));

    //list使用,不可以变list
    val list = List(10, 20, 30);
    list.foreach { x => println(x) }
    println(list.take(2));
    println(list.tail);
    println(list.head);
    println(list.count(_ > 30));
    
    var list2 = List(List(2,3), List(19,20));
    println(list2);
    println(list2.flatten);
    //可变list
    var listBuffer = ListBuffer(1, 2, 3)
    listBuffer += 5;
    listBuffer += (6, 7, 8);
    listBuffer ++= list; // 增加操作
    listBuffer -= 5; //减少操作
    println(listBuffer);

    //set
    var set = Set(1, 2, 3, 4, 5, 1);
    set -= 5;
    set -= (1, 2)
    println(set);
    //有序的set
    var sortedSet = SortedSet(1, 3, 2, 4, 6, 5);
    sortedSet += 1000;
    println(sortedSet);
  }
}