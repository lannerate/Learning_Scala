import java.util._

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


class StringOrInt[T]

object StringOrInt {
  implicit object IntWitness extends StringOrInt[Int]
  implicit object StringWitness extends StringOrInt[String]
}

object Bar {
  def foo[T: StringOrInt](x: T) = x match {
    case _: String => println("String = " + x)
    case _: Int => println("int = " + x)
  }
}

Bar.foo(12)

type R
class D

class TT[T <% Int]

//trait TTT[T <% Int] // wrong using

//def method[A <% D](arglist:Any):R
//equals
//def method1[A](arglist:Any)(implicit viewAB:A => D ) : R

//implicit def conver(a:A):D

//def method2[A](arg:Any): R

// Context bounds

def max[T] (a: T, b: T) (implicit cp : Comparator[T]) = {
  if (cp.compare(a,b) >0.0) a else b
}

def max1[T: Comparator](a:T, b:T) = {
  def inner(implicit cp: Comparator[T]) = cp.compare(a,b);

  if(inner > 0.0 ) a else b
}

def max2[T: Comparator](a:T, b:T) = {
  val cp = implicitly[Comparator[T]]

  if(cp.compare(a,b) > 0.0) a else b
}

implicit val cp = new Comparator[Int] {
  override def compare(o1: Int, o2: Int): Int = o1 - o2
}

implicit val cp1 = new Comparator[Double] {
  override def compare(d1: Double, d2: Double): Int = (d1 - d2).toInt
}


max(21.9,34.3)

max2(12, 23)




