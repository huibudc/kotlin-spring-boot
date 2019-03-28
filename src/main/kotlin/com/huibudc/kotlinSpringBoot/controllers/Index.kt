package com.huibudc.kotlinSpringBoot.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/pages")
class Index {
    @RequestMapping("/index")
    fun indexPage(): String {
        return "index"
    }

}