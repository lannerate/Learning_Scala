import scala.collection.mutable.ListBuffer

//java

//<T extends String>
//<? extends String>

//<T super String>
//<? super String>

//scala
//upper bound - supplier
def pr(list: List[_ <:Any]): Unit = {
  list.foreach(println)
}
pr("1" :: "2" :: Nil)

//Lower bound - consumer
def append[T >: String](buf : ListBuffer[T]) = {
  buf.append("Hi,")
}

val buffer = new ListBuffer[String]
append(buffer)
buffer.foreach(println)

//multiple bounds
//Java
//upper bounds
//<T extends A & B>

//Scala
//upper bounds
// A with B Equals (A with B)
//[T <: A with B]
//lower bounds
//[T >: A with B]

// mulit-view bounds
class A
class B

implicit def string2A(s:String) = new A

implicit def string2B(s:String) = new B

def foo[T <% A <% B](x:T) = println(x)

foo("test")

//mulit-context bounds
class C[T]
class D[T]

implicit val c = new C[Int]
implicit val d = new D[Int]

def bar[T : C : D](i:T) = println(i)

bar(88)
