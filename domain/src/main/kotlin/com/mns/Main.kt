package com.mns

import jakarta.inject.Singleton


@Singleton
class HelloService {
    fun sayHi(): String {
        return "Hello"
    }
}