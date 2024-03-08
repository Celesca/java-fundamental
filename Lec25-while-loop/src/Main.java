import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "ABAB";

        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(password)) {
                System.out.println("Hello World");
                break;
            }
        }
    }
}
