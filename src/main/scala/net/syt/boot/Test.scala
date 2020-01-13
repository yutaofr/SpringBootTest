package net.syt.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Test {

  println("Hello world")

}

object Test extends App {
  override def main(args: Array[String]): Unit = {
    SpringApplication run (classOf[Test], args: _*)
  }
}
