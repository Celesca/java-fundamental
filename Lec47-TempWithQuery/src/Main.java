public class Main {
    static int quantity = 10;
    static int price = 100;

    public static void main(String[] args) {
        System.out.println(calculateTotal());
    }

    public static double calculateTotal() {
        // Ternary operator
        return basePrice() > 1000 ? basePrice() * 0.95 : basePrice() * 0.98;
    }

    private static double basePrice() {
        return quantity * price;
    }
}
