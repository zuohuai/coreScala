package com.scala.demo

import javax.swing.JButton
import javax.swing.JFrame
import java.awt.event.ActionListener
import java.awt.event.ActionEvent

object SamAndCurryTest {

  def main(args: Array[String]) {
    var data = 0
    val frame = new JFrame("SAM Testing");
    val jButton = new JButton("Counter")
    implicit def convertedAction(action: (ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(event: ActionEvent) { action(event) }
      }

    jButton.addActionListener((event: ActionEvent) => { data += 1; println(data) })

    frame.setContentPane(jButton);
    frame.pack();
    frame.setVisible(true);
  }
}