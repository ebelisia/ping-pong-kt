package com.frates.pingpong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PingPongApplication

fun main(args: Array<String>) {
	runApplication<PingPongApplication>(*args)
}

