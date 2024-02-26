package com.mns

import jakarta.inject.Singleton


@Singleton
class HelloService {
    fun sayHiCoveredInIntegrationTests(): String {
        return "Hello from integration test"
    }

    fun sayHiCoveredInUnitTestsOnly(): String {
        return "Hello from unit test"
    }
}