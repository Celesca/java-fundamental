import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        calculatorMode(displayMenu());
    }

    private static void calculatorMode(int userInput) {
        switch (userInput) {
            case 1:
                System.out.println(vatCalculator());
                break;
            case 2:
                System.out.println(bmiCalculator());
                break;
            case 3:
                System.out.println(aPlusB());
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    private static int displayMenu() {
        System.out.println("1. VAT Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. A+B");
        System.out.print("Please enter number : ");
        return scanner.nextInt();
    }

    private static double vatCalculator() {
        System.out.println("Mode Vat Calculator");
        System.out.print("Please enter price : ");
        double price = scanner.nextDouble();
        System.out.print("Please enter vat rate : ");
        double vatRate = scanner.nextDouble();
        return price * (vatRate / 100);
    }

    private static double bmiCalculator() {
        System.out.println("Mode BMI Calculator");
        System.out.print("Please enter weight (kg) : ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter height (cm) : ");
        double height = scanner.nextDouble();
        return weight / Math.pow(height / 100, 2);
    }

    private static int aPlusB() {
        System.out.println("Mode A+B");
        System.out.print("Please enter A : ");
        int a = scanner.nextInt();
        System.out.print("Please enter B : ");
        int b = scanner.nextInt();
        return a + b;
    }
}
