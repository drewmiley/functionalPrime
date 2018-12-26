import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running Java examples");

        System.out.println("partial application");
        System.out.println("a: A, f: (A, B) => C");
        System.out.println("b: B { b => f(a, b) }");

        partialApplication();

        System.out.println("currying");
        System.out.println("f: (A, B) => C");
        System.out.println("(a: A, b: B) { a => b => f(a, b) }");

        currying();

        System.out.println("uncurrying");
        System.out.println("f: A => B => C");
        System.out.println("(a: A, b: B) { (a, b) => f(a)(b) }");

        System.out.println("composition");
        System.out.println("f: A => B, g: B => C");
        System.out.println("a: A { a => g(f(a)) }");
    }

    static void partialApplication() {
        double aValue = 2.5;
        BiFunction<Double, Integer, String> f = (a, b) -> String.valueOf(a * b);
        Function<Integer, String> partial = b -> f.apply(aValue, b);
        System.out.println(partial.apply(2));
    }

    static void currying() {
        BiFunction<Double, Integer, String> f = (a, b) -> String.valueOf(a * b);
        Function<Integer, Function<Double, String>> currying = b -> a -> f.apply(a, b);
        System.out.println(currying.apply(2).apply(2.5));
    }
}
