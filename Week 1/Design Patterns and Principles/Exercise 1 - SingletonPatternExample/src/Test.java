public class Test {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();

        a.log("First call");
        b.log("Second call");

        System.out.println("Same object? " + (a == b));
    }
}
