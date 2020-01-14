package net.syt.boot

import net.syt.boot.service.TestTopology
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Test extends CommandLineRunner {

  @Autowired
  var testTopology: TestTopology = _

  override def run(args: String*): Unit = {
    testTopology.sayHi()
    testTopology.playWithAnimal()
  }
}

object Test extends App {
  override def main(args: Array[String]): Unit = {
    SpringApplication run (classOf[Test], args: _*)
  }
}
