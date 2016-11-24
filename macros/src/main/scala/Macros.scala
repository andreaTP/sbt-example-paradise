import scala.reflect.macros.Context
import scala.language.experimental.macros
import scala.annotation.StaticAnnotation

object helloMacro {
  def impl(c: Context)(): c.Expr[Any] = {
    import c.universe._

    println("Ok")

    c.Expr[Any](q""""hello"""")
  }
}

object hello {
  def hello() = macro helloMacro.impl
}
