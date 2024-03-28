package br.com.jwprogrammer.fileserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FileServerApplication

fun main(args: Array<String>) {
	runApplication<FileServerApplication>(*args)
}
