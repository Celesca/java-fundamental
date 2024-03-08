import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "1234";
        String inputPassword;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your password: ");
            inputPassword = scanner.nextLine();
        }
        while (password.equals(inputPassword));
        System.out.println("Hello World!");
    }
}