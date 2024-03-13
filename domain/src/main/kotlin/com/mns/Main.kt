package com.mns

import jakarta.inject.Singleton


@Singleton
class HelloService {
    fun sayHi(): String {
        return "Hello"
    }
    fun sayHi2(): String {
        return "Hello2"
    }
    fun sayHi3(): String {
        return "Hello3"
    }

    fun sayHi4(): String {
        return "Hello4"
    }
}