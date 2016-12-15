package com.scala.demo.akka

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala

object AkkaActorTest {
  def main(args: Array[String]) {
    println("AkkaActorTest");
    // ActroSystem 的作用 : 1) 
    val system = ActorSystem("ReactiveEnterprise");

    val prcessMnagersRef: ActorRef = system.actorOf(Props[TeacherActor], "processManager");
    prcessMnagersRef ! ("Hello World", prcessMnagersRef);
    system.shutdown();
  }
}

/**
 * Actor的生命周期
 */
class TeacherActor extends Actor {
  //1.接受到消息的方法
  def receive = {
    case _ => {
      println("receive message !!!!" + context.hashCode());
    }
  }

  override def postRestart(reason: Throwable) = {

  }

  override def postStop = {
    println("postStop execute");
  }

  override def preRestart(reason: Throwable, message: Option[Any]) = {

  }

  override def preStart = {
    println("preStart execute");
  }
}