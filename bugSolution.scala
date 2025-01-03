```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    if (newAge > 0) {
      _age = newAge 
    } else {
      // Improved error handling with more informative message
      throw new IllegalArgumentException(s"Invalid age: $newAge. Age must be positive.")
    }
  }
}

val myInstance = new MyClass("John")
try {
  myInstance.age = -5 
} catch {
  case e: IllegalArgumentException => println(s"Caught exception: ${e.getMessage}")
}
```