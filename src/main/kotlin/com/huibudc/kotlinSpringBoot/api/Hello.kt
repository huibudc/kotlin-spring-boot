package com.huibudc.kotlinSpringBoot.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Hello {
    @RequestMapping("hello")
    fun hello() = "hello"
}