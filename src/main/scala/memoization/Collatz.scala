package memoization

import java.io.*
import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.collection.*

case class Collatz(n: Int):

  private val cache: mutable.Map[Int, Vector[Int]] = mutable.Map.empty

  private def step(n: Int): Int =
    if n <= 1 then 1
    else if n % 2 == 0 then n / 2
    else n * 3 + 1

  private def loop(n: Int, result: Vector[Int]): Vector[Int] =
    cache.getOrElse(n,
      if n == 1 then
        result :+ 1
      else
        val next = step(n)
        loop(next, result :+ n)
    )

  def solve: Vector[Int] =
    loop(n, Vector.empty)


object Collatz:

  @main def run(): Unit =
    val end    = readLine("Choose range end number: ").toInt
    val writer = FileWriter(File(s"Collatz_1-$end.csv"))
    (1 to end).foreach: n =>
      val result = Collatz(n).solve
      writer.write(s"$n: ${result.mkString(",")} (length=${result.length})\n")
    writer.close()


