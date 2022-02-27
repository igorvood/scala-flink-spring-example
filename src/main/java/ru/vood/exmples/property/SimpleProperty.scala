package ru.vood.exmples.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

import scala.beans.BeanProperty

@Configuration
@ConfigurationProperties(prefix = "app.simpleProperty")
case class SimpleProperty() {
  @BeanProperty
  var typeSrt: java.lang.String = "1"
  @BeanProperty
  var typeNumber: Number = 0
  @BeanProperty
  var typeBool: Boolean = true

  override def toString: String =
    s"""SimpleProperty(
       |  typeSrt = $typeSrt
       |  typeNumber = $typeNumber
       |  typeBool = $typeBool
       |)""".stripMargin
}
