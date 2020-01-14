package net.syt.boot.domain.service

import net.syt.boot.domain.entity.Bird

/**
 * the type class instances
 */
object AnimalCouldFly {

  implicit val birdCanFly: FlyOpe[Bird] = new FlyOpe[Bird] {
    override def fly(bird: Bird): Unit = println(s"Sure..... A bird [${bird.name}] can fly!!!")
  }

}
