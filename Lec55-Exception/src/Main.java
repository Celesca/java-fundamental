import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Invalid input !");
        }
    }
}
