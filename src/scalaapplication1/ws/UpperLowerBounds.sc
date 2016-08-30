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