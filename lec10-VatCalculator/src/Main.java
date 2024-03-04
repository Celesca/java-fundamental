public class Main {
    public static void main(String[] args) {
        // price float, vat float
        float price = 100.00f;
        float vat = 7.00f;
        float total = ( price*vat/100 ) + price;
        System.out.println(total);



    }
}