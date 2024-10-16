package com.eragoo.nextcheckup

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Main

fun main(args: Array<String>) {
    val run = SpringApplication.run(Main::class.java, *args)
    run.getBean(ExampleService::class.java).sayHello()
}
