public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        double add = cal1.addition(1, 2);
        System.out.println(add);
        double minus = cal1.subtraction(1, 2);
        System.out.println(minus);

        NewCalculator cal2 = new NewCalculator();
        double multiply = cal2.multiplication(1, 2);
        System.out.println(multiply);
        double divide = cal2.division(1, 2);
        System.out.println(divide);
        double tryadd = cal2.addition(1, 2);
        System.out.println(tryadd);
    }
}
