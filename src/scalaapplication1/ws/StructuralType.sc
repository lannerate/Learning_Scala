//compound type
trait TT extends { val name : String}
//equals
trait TTT extends AnyRef { val name : String }


class BB
//early initializer / definition
class AA extends { val name = "Hello"} with BB


def f(p:{def id[T](i:T)}): Unit ={
  //DO NOTHING
}

f( new { def id[String] (s:String) = println(s)} )

//def f[T] (p: {def id(i: T)}): Unit = {
  //DO NOTHING
//}