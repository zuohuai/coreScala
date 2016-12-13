package com.scala.demo

object PatternMatchTest {
  def main(args: Array[String]) {
    var number = 2;

    //1.数值匹配
    var result = number match {
      case 1 => "First";
      case 2 => "Second";
      case 3 => "Third";
    }
    println(result);

    number = 1;
    val result2 = number match {
      case i if i == 1           => "First";
      case number if number == 2 => "The Second";
      case _                     => "Not Know Number";
    }
    println(result2);

    //2.类型匹配
    def Type(t: Any) = t match {
      case p: Int    => println("It is Integer");
      case p: String => println("It is String");
      case _         => println("Unkonw Type ");
    }

    Type(1);
    Type("2");

    def caseClassMatch(p: Person) {
      p match {
        case Teacher("Jack") => println("This is Teacher");
        case Student(_) => println("This is Student");
        case _ => println("Unkonw Type !!!");
      }
    }

    caseClassMatch(Teacher("hison.zhang"));
    caseClassMatch(Student(100));
  }

  abstract class Person {};

  case class Teacher(name: String) extends Person;

  case class Student(age: Int) extends Person;
}