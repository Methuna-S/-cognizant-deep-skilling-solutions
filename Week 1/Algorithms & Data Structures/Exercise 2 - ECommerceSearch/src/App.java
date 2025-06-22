import java.util.*;
public class App {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products)
            if (p.productName.equalsIgnoreCase(name))
                return p;
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        int l = 0, r = products.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int cmp = products[m].productName.compareToIgnoreCase(name);
            if (cmp == 0)
                return products[m];
            else if (cmp < 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Book", "Education"),
            new Product(105, "Watch", "Accessories")
        };
        System.out.println("Linear Search: " + linearSearch(products, "Book"));
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.println("Binary Search: " + binarySearch(products, "Book"));
    }
}
