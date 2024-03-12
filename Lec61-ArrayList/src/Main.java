import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customers.add(customer1);
        System.out.println(customers.get(0).getName());

    }
}
