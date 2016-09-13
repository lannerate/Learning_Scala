//trait List[+T] //declaration-site covariance

trait Set[-T] //contravariance

val a:List[_ <: Any] = List[String]("A")

//trait A[+T]

//class D[T] extends A[T]

//class C[+T] extends A[T]

// A => C is subtype A => B
//in parameter is covariance
class A; class B; class C extends B;

val t2 = (p:A) => new C

val t3:A => B = t2

t2.asInstanceOf[A=>B]

//out parameter is contravariance

class R; class X; class Y extends X;

// X => R
val f1 = (x:X) => new R
// X => R is subtype of Y => R
val f2 :Y => R = f1

//PECS in effective JAVA
// Producer extends, Consumer Super