package net.syt.boot.domain.entity

/**
 * ADT, no operation or method should be included,
 * Animal is a Sum type
 */
sealed trait Animal

case class Dog(name: String) extends Animal
case class Bird(name: String) extends Animal
