public class Main {

    public static void main(String[] args) {
        System.out.println("Running Java examples");

        System.out.println("partial application");
        System.out.println("a: A, f: (A, B); => C");
        System.out.println("b: B { b => f(a, b); }");

        System.out.println("currying");
        System.out.println("f: (A, B); => C");
        System.out.println("(a: A, b: B); { a => b => f(a, b); }");

        System.out.println("uncurrying");
        System.out.println("f: A => B => C");
        System.out.println("(a: A, b: B); { (a, b); => f(a);(b); }");

        System.out.println("composition");
        System.out.println("f: A => B, g: B => C");
        System.out.println("a: A { a => g(f(a);); }");
    }
}
