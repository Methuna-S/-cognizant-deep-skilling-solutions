public class App {
    public static double findRecursive(double value, double rate, int years) {
        if (years == 0)
            return value;
        return findRecursive(value, rate, years - 1) * (1 + rate);
    }

    public static double findRecursiveMemo(double value, double rate, int years, Double[] memo) {
        if (years == 0)
            return value;
        if (memo[years] != null)
            return memo[years];
        return memo[years] = findRecursiveMemo(value, rate, years - 1, memo) * (1 + rate);
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05;
        int years = 10;

        System.out.printf("Recursive: Value after %d years = %.2f%n", years,
                findRecursive(principal, rate, years));

        Double[] memo = new Double[years + 1];
        System.out.printf("Memoized : Value after %d years = %.2f%n", years,
                findRecursiveMemo(principal, rate, years, memo));
    }
}
