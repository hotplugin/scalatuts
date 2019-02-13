package example

import example.traits.PointExtended

object Main extends App{
  println("starting examples..")

  helloExample

  private def helloExample = {

    val ages = Seq(42, 61, 29, 64)
    println(s"The oldest person is ${ages.max}")

    println("hi faisal")

    var myvar = 10
    println(myvar)

    val (myvar1, myvar2) = Pair(40, "faisal") // Tuple is mixing of data types in collection

    val pt = new Point(10, 20)
    pt.move(10, 10)

    val loc = new Location(10, 20, 30)
    loc.move(5, 1, 40)
  }

//  extendingClassExample

  private def extendingClassExample = {
    val point = new Point(10, 20)
    printPoint

    def printPoint {
      println("Point x location : " + point.x);
      println("Point y location : " + point.y);
    }
  }

  val p1 = new PointExtended(2,3)
  val p2 = new PointExtended(2,4)

  println("p1 extended trait test equals is: " + p1.isNotEqual(p2))
  println("....end examples.")
}
