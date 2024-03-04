import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Money (Dollar) : ");
        double dollarInput = scanner.nextDouble();
        double exchangeRate = 35.0;
        double thai = dollarInput * exchangeRate;
        System.out.println(thai + " THB");
    }
}