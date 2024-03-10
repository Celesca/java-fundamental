import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String address = scanner.nextLine();
        String email = scanner.nextLine();

        Customer customer = new Customer(name, address, email);
        System.out.println(customer.getName());
    }
}
