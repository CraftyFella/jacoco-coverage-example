package com.mns

import com.mns.HelloService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut.run
fun main(args: Array<String>) {
	run(*args)
}


@Controller("/")
class HelloController(private val helloService: HelloService) {
	@Get("/hello")
	fun index(): String {
		return helloService.sayHi()
	}
}
