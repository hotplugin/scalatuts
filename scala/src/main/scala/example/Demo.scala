package example

object Demo {
  def main(args: Array[String]) {
    4 times println("hello")


    val point = new Point(10, 20)
    printPoint

    def printPoint{
      println ("Point x location : " + point.x);
      println ("Point y location : " + point.y);
    }
  }
}
