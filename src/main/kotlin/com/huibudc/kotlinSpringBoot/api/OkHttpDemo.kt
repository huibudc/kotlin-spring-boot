package com.huibudc.kotlinSpringBoot.api

import okhttp3.OkHttpClient
import okhttp3.Request
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ok")
class OkHttpDemo(val httpClient: OkHttpClient) {

    @RequestMapping("/1")
    fun hah(): String {
        val request = Request.Builder()
                .url("http://www.baidu.com").method("GET", null).build()
        return httpClient.newCall(request).execute().body()!!.string()
    }
}