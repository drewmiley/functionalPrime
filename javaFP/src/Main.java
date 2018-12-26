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

        uncurrying();

        System.out.println("composition");
        System.out.println("f: A => B, g: B => C");
        System.out.println("a: A { a => g(f(a)) }");

        composition();
    }

    static void partialApplication() {
        double aValue = 2.5;
        BiFunction<Double, Integer, String> f = (a, b) -> String.valueOf(a * b);
        Function<Integer, String> partial = b -> f.apply(aValue, b);
        System.out.println(partial.apply(2));
    }

    static void currying() {
        BiFunction<Double, Integer, String> f = (a, b) -> String.valueOf(a * b);
        Function<Double, Function<Integer, String>> currying = a -> b -> f.apply(a, b);
        System.out.println(currying.apply(2.5).apply(2));
    }

    static void uncurrying() {
        Function<Double, Function<Integer, String>> f = a -> b -> String.valueOf(a * b);
        BiFunction<Double, Integer, String> uncurrying = (a, b) -> f.apply(a).apply(b);
        System.out.println(uncurrying.apply(2.5, 2));
    }

    static void composition() {
        Function<Double, String> f = a -> String.valueOf(2 * a);
        Function<String, Integer> g = b -> Integer.parseInt(b.substring(0, 1));
        Function<Double, Integer> composition = a -> g.apply(f.apply(a));
        System.out.println(composition.apply(2.5));
    }
}
