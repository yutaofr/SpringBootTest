package net.syt.boot.domain.service

import net.syt.boot.domain.entity.Bird

object AnimalFeatures {

  implicit val birdCanFly: FlyOpe[Bird] = new FlyOpe[Bird] {
    override def fly(bird: Bird): Unit = println(s"Sure..... A bird ${bird.name} can fly!!!")
  }

}
