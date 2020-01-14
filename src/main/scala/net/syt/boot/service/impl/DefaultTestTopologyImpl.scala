package net.syt.boot.service.impl

import net.syt.boot.domain.entity.Bird
import net.syt.boot.service.TestTopology
import org.springframework.stereotype.Component

@Component
class DefaultTestTopologyImpl extends TestTopology {
  override def sayHi(): Unit = println("Hello World!!!")

  override def playWithAnimal(): Unit = {
    import net.syt.boot.domain.service.FlyOpe._
    import net.syt.boot.domain.service.AnimalFeatures._
    val bird = Bird("Eagle")
    bird.fly
  }
}
