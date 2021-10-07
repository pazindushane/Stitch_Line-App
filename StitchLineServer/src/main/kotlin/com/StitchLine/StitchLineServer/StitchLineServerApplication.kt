package com.StitchLine.StitchLineServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StitchLineServerApplication

fun main(args: Array<String>) {
	runApplication<StitchLineServerApplication>(*args)
}
