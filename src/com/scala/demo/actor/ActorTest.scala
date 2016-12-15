package com.scala.demo.actor

import java.util.concurrent.TimeUnit

import scala.actors.Actor
import scala.actors.Actor.actor
import scala.actors.Actor.receive

object ActorTest {

  def main(args: Array[String]) {
    val helloActor = new HelloActor;
    helloActor.start();
    
    val echoActor = actor(
      while(true){
         receive {
           case x : Int => println("right msg:"+ x);
           case _ => println("error msg");
         }
      }
    );
    echoActor ! "Hello World";
    echoActor ! 1;
    
    val reactorTest = new ReactorActor;
    reactorTest.start();
    
    reactorTest ! ("hello", helloActor);
    reactorTest ! 1;
    TimeUnit.SECONDS.sleep(10);
  }
}

/**
 * 创建线程的方式
 */
class HelloActor extends Actor {
  def act() {
    for (i <- 1 to 5) {
      println("I am acting : " + i);
      TimeUnit.SECONDS.sleep(1);
    }
  }
  
  def getIp(){
    println("get the ip");
  }
}

/**
 * Reactor测试, 提高性能
 */
class ReactorActor extends Actor {
  def act(){
    loop{
      react {
        case (name : String ,actor : HelloActor) 
              => 
                println("right message");
                val ip = actor.getIp();
        case msg => println("unhandle msg : " + msg); 
      }
    }
  }
}


