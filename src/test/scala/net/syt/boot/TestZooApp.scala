package net.syt.boot

import org.scalatest.funsuite.AnyFunSuite

class TestZooApp extends AnyFunSuite {

  test("AppBootstrap") {
    ZooApp.main(Array[String]())
  }

}
