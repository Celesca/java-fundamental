import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Food Type: ");
        Scanner scanner = new Scanner(System.in);

        String inputFoodType = scanner.nextLine();

        // Reference Type use equals
        // Primitive Type use ==

        if (inputFoodType.equals("Thai")) {
            System.out.print("Flavor: ");
            String inputFlavor = scanner.nextLine();

            if (inputFlavor.equals("Spicy")) {
                System.out.print("Tom yum");
            }
            else if (inputFlavor.equals("Salty")) {
                System.out.print("Fried Pork");
            }
        }
        else {
            System.out.print("We have only Thai food.");
        }


    }
}
