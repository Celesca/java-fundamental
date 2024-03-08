import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        switch(userInput){
            case 1 :
                System.out.println("Hello WOrld");
                break;
            case 2 :
                System.out.println("Hello Java");
                break;
            case 3 :
                System.out.println("Hello Python");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}