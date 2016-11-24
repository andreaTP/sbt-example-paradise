
trait Hello {
  val x = hello.hello
}

trait One extends Hello {}
trait Two extends Hello {}

object Test extends App with One with Two {

  val y = new Hello {}
  println(y)
  println(x)
}
