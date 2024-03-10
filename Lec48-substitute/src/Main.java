import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] customerProducts = new String[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i ++) {
            customerProducts[i] = scn.nextLine();
        }

        foundProduct(customerProducts);

    }

    private static void foundProduct(String[] customerProducts) {
        List products = Arrays.asList(new String[]{"Apple", "Banana", "Orange", "Milk", "Hamburger"});
        for (int i = 0 ; i < customerProducts.length ; i++) {
            if (products.contains(customerProducts[i])) {
                System.out.println("Found! " + customerProducts[i]);
            }
        }
    }
}
