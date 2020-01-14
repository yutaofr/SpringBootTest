package net.syt.boot.domain.service

import org.springframework.stereotype.Component

/**
 * Type class for having ad hoc polymorphism
 */
trait FlyOpe[T] {
  def fly(t: T): Unit
}

/**
 * Type class interface, from where the application could call the ad hoc method for the available types
 */
@Component
object FlyOpe {

  // interface like bound context, usage like FlyOpe.fly(instanceOfT)
  //def fly[T: FlyOpe](t: T): Unit = implicitly[FlyOpe[T]].fly(t)

  // interface like implicit class conversion, could enrich the t's method
  // usage like: t.fly,  preferable usage
  implicit class AnimalActions[A](animal: A) {
    def fly(implicit flyOpe: FlyOpe[A]): Unit = {
      flyOpe.fly(animal)
    }
  }
}

