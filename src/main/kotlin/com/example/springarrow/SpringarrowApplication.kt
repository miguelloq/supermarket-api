package com.example.springarrow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringarrowApplication

fun main(args: Array<String>) {
	runApplication<SpringarrowApplication>(*args)
}




@RestController
class HelloController{
	@GetMapping("/")
	fun hello():ResponseEntity<String> = ResponseEntity.ok("Hello")
}


