import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How much money do you have? :");
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        System.out.println("You have " + money + " dollars");

        if (money >= 200) {
            System.out.println("Krapro + Cola + Snack");
        }
        else if (money >= 100) {
            System.out.println("Krapro + Cola");
        }
        else if (money >= 50) {
            System.out.println("Krapro");
        }
        else {
            System.out.println("-");
        }


    }
}