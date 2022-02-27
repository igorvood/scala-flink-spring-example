package ru.vood.exmples.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

import java.util
import scala.beans.BeanProperty

@Configuration
@ConfigurationProperties(prefix = "app.hardProperty")
case class HardProperty() {
  @BeanProperty
  var prop: SimpleProperty = SimpleProperty()
  @BeanProperty
  var mapProp: java.util.Map[String, SimpleProperty] = new util.HashMap()
  @BeanProperty
  var listProp: java.util.List[String] = new util.ArrayList[String]

  override def toString: String =
    s"""HardProperty(
       |  prop = $prop
       |  mapProp = $mapProp
       |  listProp = $listProp
       |)""".stripMargin

}
