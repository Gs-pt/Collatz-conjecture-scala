//> using scala 3.8.3
import java.io._
import scala.util.Using

@main def collatz(): Unit =
  val num = scala.io.StdIn.readLine("Choose starting number: ").toInt
  val writer = new PrintWriter(new File(s"Collatz${num}.csv"))
  collatzCalculate(num, writer)
  writer.close()

def collatzStep(n: Int): Int =
  if n <= 1 then 1
  else if n % 2 == 0 then n / 2
  else n * 3 + 1

def collatzCalculate(a: Int, writer: java.io.PrintWriter): Unit =
  var e = a
  var counter = 1
  println("Step, Value")
  writer.println("Step,Value")
  writer.println(s"$counter,$e")
  while (e > 1) do
    counter += 1
    e = collatzStep(e)
    println(s"$counter,$e")
    writer.println(s"$counter,$e")
