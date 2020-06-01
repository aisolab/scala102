package scala.learning.three.example

object IteratorGuardExample extends App {
  val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
  println(threes)

  val quote = "Faith,Hope,,Charity"
  for {
    t <- quote.split(",")
    if t != null
    if t.size > 0
  } {
    println(t)
  }
}
