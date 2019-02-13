package example

class Point (val xc: Int, val yc: Int){

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int){
    x = x + dx
    y = y + dy
    println("point x location: "+x)
    println("point y location: "+y)
  }
}
