public class Customer {
    private int customerId;
    private String name;
    private String address;
    private int phone;

    public Customer(int customerId, String name, String address, int phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}
