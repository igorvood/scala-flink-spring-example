package ru.vood.exmples.runner

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Service
import ru.vood.exmples.property.{HardProperty, SimpleProperty}

@Service
final class Run(val simpleProperty: SimpleProperty,
                val hardProperty: HardProperty)extends CommandLineRunner{
  override def run(strings: String*): Unit = {
    println(simpleProperty)
    println("-----------------------------------")
    println(hardProperty)
  }
}
