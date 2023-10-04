package com.github.fantasy0v0.spring_security_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@Import(SecurityConfiguration::class)
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
