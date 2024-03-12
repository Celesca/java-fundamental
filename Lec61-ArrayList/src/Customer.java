public class Customer {
    private String name;
    private String email;
    private String phone;
    private String address;

    public Customer() {
        this.name = "John Doe";
        this.email = "";
    }
    public Customer(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
