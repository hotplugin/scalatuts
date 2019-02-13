package example.traits

class PointExtended(xc: Int, yc: Int) extends Equal {

  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = obj.isInstanceOf[PointExtended] && obj.asInstanceOf[PointExtended].x == y
  //override def isEqual(x: Any): Boolean = x == y
}
