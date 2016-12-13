package com.scala.demo.oop

/**
 * scala中的Trait接口的学习
 */
object TraitTest {

  def main(args: Array[String]) {
    var concrectLogger = new ConcrectLogger;
    concrectLogger.concrectlog("ConcrectLogger");
    concrectLogger.log("hison.zhang");
    concrectLogger.log();
    concrectLogger.log(100)
  }

}

/**
 * 1.定义一个接口
 * 2.这里又有方法的重载了
 * @author zuohuai
 */
trait Logger {
  //1.接口中定义一个有具体实现的方法 
  def log(msg: String) {
    println("log:" + msg);
  }

  //2.接口中定义没有具体实现的方法
  def log();

  //3.定义可以被override的方法
  def log(age: Int) {
    println("traint age:" + age);
  }
}

class ConcrectLogger extends Logger() {
  def concrectlog(msg: String) {
    log(msg);
  }

  def log() {
    println("ConcrectLogger Impl");
  }

  override def log(age: Int) {
    println("ConcrectLogger override age:" + age);
  }
}