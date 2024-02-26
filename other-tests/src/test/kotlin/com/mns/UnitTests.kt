package com.mns

import org.junit.jupiter.api.Test


class UnitTests {
    @Test
    fun test() {
        HelloService().sayHiCoveredInUnitTestsOnly()
    }

    @Test
    fun test2() {
        HelloController(HelloService()).otherThing()
    }
}