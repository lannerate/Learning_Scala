import scala.annotation.tailrec
import scala.util.Random
import scala.math._

BigInt.probablePrime(100,Random)


val random = new Random(100)
random.nextInt(10)

"Hello,world".distinct

"hello".charAt(4)
"hello"(1)

"HEllo, World".count(_.isUpper)

"cray " * 2

"Hello".drop(1);
"hello".take(2)
"hello".takeRight(2)
"hello".dropRight(2)
"hello".substring(0,2)
BigInt.apply("23233") * BigInt("22")

BigInt(2).pow(10)

10 max 2

Array(23,32,56,990,200).foreach(println)


def abs (x:Int) = if (x >0 ) 1 else -1
abs(-3)

def fac(n:Int):Int = {
  if(n<=0) 1
  else n * fac( n-1)
};

fac(5)

