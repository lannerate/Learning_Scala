def foo[T](x:List[T])(implicit m: Manifest[T]) = {
  if(m <:< manifest[String])
    println("this full string list")
  else
    println("non-stringy list")
}

foo(List("one","two"))

foo(List(2,3))

def bar[T:Manifest](x:List[T]) = {
    if(manifest[T] <:< manifest[String])
        println("this is full stringy list")
    else
        println("non-sringy list")
}

bar(List("one"))
bar(List("one",3))

class A[T]
val m = manifest[A[String]]

val cm = classManifest[A[String]]

m.typeArguments
cm.typeArguments

class D[ T ]

manifest[D[_]]

classManifest[A[_]]

//def test[T]: Unit = {
//  val a = new Array[T]
//}

class AT {
  val a1 = new Array[java.lang.Object](1);
  val a2 = new Array[String](1);
}
