object Main extends App {
    println("Running Scala examples")

    println("partial application")
    println("a: A, f: (A, B) => C")
    println("b: B { b => f(a, b) }")

    private def partialApplication(): Unit = {
        val a: Double = 2.5
        def f(a: Double, b: Int): String = (a * b).toString
        def partial(b: Int): String = f(a, b)
        println(partial(2))
    }
    partialApplication()

    println("currying")
    println("f: (A, B) => C")
    println("(a: A, b: B) { a => b => f(a, b) }")

    private def currying(): Unit = {
        def f(a: Double, b: Int): String = (a * b).toString
        def currying(a: Double)(b: Int): String = f(a, b)
        println(currying(2.5)(2))
    }
    currying()

    println("uncurrying")
    println("f: A => B => C")
    println("(a: A, b: B) { (a, b) => f(a)(b) }")

    private def uncurrying(): Unit = {
        def f(a: Double)(b: Int): String = (a * b).toString
        def uncurrying(a: Double, b: Int): String = f(a)(b)
        println(uncurrying(2.5, 2))
    }
    uncurrying()

    println("composition")
    println("f: A => B, g: B => C")
    println("a: A { a => g(f(a)) }")
}
