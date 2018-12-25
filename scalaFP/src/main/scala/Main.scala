object Main extends App {
    println("Running Scala examples")


    println("partial application")
    println("a: A, f: (A, B) => C")
    println("b: B { b => f(a, b) }")


    println("currying")
    println("f: (A, B) => C")
    println("(a: A, b: B) { a => b => f(a, b) }")


    println("uncurrying")
    println("f: A => B => C")
    println("(a: A, b: B) { (a, b) => f(a)(b) }")


    println("composition")
    println("f: A => B, g: B => C")
    println("a: A { a => g(f(a)) }")
}
