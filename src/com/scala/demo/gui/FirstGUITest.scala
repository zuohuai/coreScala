package com.scala.demo.gui

import scala.swing.Button
import scala.swing.MainFrame
import scala.swing.SimpleSwingApplication

object FirstGUITest {

  def main(args: Array[String]) {
    println("FirstGUITest");
    val firstSwing = new FirstSwing();
  }
}

class FirstSwing extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "First Swing App"
    contents = new Button { text = "click me" };
  }
}