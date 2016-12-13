package com.scala.demo.oop

import com.scala.demo.oop.spark.navigation.Navigator

object PackageTest {

}

package spark.navigation {
  abstract class Navigator {
    def act
  }
  package tests {
    //在spark.navigation.tests包里定义一个类
    class NavigatorSuite
  }
  package impls {
    class Action extends Navigator {
      def act = println("Action-易悠")
    }
  }
}

/**
 * 自定义Hadoop包
 */
package hadoop {
  package navigation {
    class Navigator
  }
  package launch {
    //import kmust.hjr.learningScala16.hadoop.navigation.Navigator
    class Booster {
      val nav = new navigation.Navigator
      //val nav=new Navigator
    }
  }
}

/**
 *包对象的定义
 */
package object people{
    var defaultName="KMUST-易悠"
}
/**
  *包对象的使用
 */
package people{
  class people{
    var name=defaultName
  }
}