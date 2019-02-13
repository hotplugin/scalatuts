package example

object Main extends App{
  val ages = Seq(42,61,29,64)
  println(s"The oldest person is ${ages.max}")

  println("hi faisal")

  var myvar = 10
  println(myvar)

  val(myvar1 , myvar2 ) = Pair(40, "faisal") // Tuple is mixing of data types in collection

  val pt = new Point(10,20)
  pt.move(10,10)

  val loc = new Location(10,20,30)
  loc.move(5,1,40)

}
