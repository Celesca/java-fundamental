public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Codecademy");
        System.out.println(company.getName());

        Company.name = "data"; // This line changes the value of the static variable name
        System.out.println(company.getName());
        System.out.println(Company.name);
    }
}
