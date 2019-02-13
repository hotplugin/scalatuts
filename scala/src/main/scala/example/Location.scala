package example

class Location(override val xc: Int, override val yc:Int, val zc: Int) extends Point(xc,yc){
  var z : Int = zc

  // Unit means its a return type of void, this is optional word.
  def move(dx:Int, dy:Int, dz: Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    println("Location  x "+x)
    println("Location  y "+y)
    println("Location  z "+z)
  }

}