package net.syt.boot.domain.service

import org.springframework.stereotype.Component

/**
 * Type class for having ad hoc polymorphism
 */
trait FlyOpe[T] {
  def fly(t: T): Unit
}

@Component
object FlyOpe {

  //def fly[T: FlyOpe](t: T): Unit = implicitly[FlyOpe[T]].fly(t)

  implicit class AnimalActions[A](animal: A) {
    def fly(implicit flyOpe: FlyOpe[A]): Unit = {
      flyOpe.fly(animal)
    }
  }
}

