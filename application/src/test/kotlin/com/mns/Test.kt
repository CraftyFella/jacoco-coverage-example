package com.mns

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Test

@MicronautTest
class Test {

    @Inject
    @field:Client("/")
    lateinit var httpClient: HttpClient

    @Test
    fun test() {
        val response = httpClient.toBlocking().retrieve("/hello")
        println(response)
    }
}