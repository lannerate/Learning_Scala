class A {
  self =>
  val x = 2
  def foo = self.x + this.x
}

(new A).foo

class Outer {
  outer =>
  val v1 = "outside"

  class Inner {
    println(outer.v1)
  }
}

val outer = new Outer;
val inner = new outer.Inner

class StringOrInt[T]

object StringOrInt {
  implicit object IntWitness extends StringOrInt[Int]
  implicit object StringWitness extends StringOrInt[String]
}

StringOrInt.IntWitness

object Bar {
  def foo[T:StringOrInt](x: T) = x match {
    case _: String => println("Str");

    case _: Int => println("Int")
  }
}

Bar.foo("")
Bar.foo(234)