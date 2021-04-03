package com.frates.pingpong.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Ping {

    @GetMapping("/ping")
    fun index(): String = "pong"

}