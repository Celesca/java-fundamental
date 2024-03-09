import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.Start();
        System.out.println(car.color);

        System.out.println(helloWorld());
        System.out.println(ab());


    }

    private static String helloWorld() {
        return "Hello, World!";
    }

    private static int ab() {
        int a = 10;
        int b = 5;
        return a + b;
    }
}
