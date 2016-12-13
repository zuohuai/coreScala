package com.scala.demo

import scala.io.Source

/**
 * scala文件读取
 */
object FileTest {
  
  def main(args : Array[String]){
    var file = Source.fromFile("/Users/zuohuai/Documents/file");
    for(line <- file.getLines()){
      println(line);
    }
  }
}