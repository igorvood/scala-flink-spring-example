package ru.vood.exmples

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
@EnableConfigurationProperties
class Application

object Application extends App {
  SpringApplication.run(classOf[Application]);
}