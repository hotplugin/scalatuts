package example.traits

trait Equal {
// trait is like a java abstract class.

  def isEqual(x: Any): Boolean           // method without impl. like abstract method

  def isNotEqual(x: Any): Boolean = !isEqual(x)    // method with impl.
}
