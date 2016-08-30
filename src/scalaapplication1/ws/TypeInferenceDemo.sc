class A {
  class B;
  //def foo(b:B) = println(b)
  def foo(b: A#B) = println(b)
}

val a1 = new A
val a2 = new A

val b1 = new a1.B
val b2 = new a2.B

a1.foo(b2)
a2.foo(b2)

object Singleton {
  class Inner
}

val x = new Singleton.Inner

class E {
  class F
  val f = new F
}

class T { class U }
class Z extends T { val x = new super.U }

class C {
  val a = new A
  val x = new a.B
}

