public class Salesperson {
    private int salespersonId;
    private String name;
    private int phone;

    public Salesperson(int salespersonId, String name, int phone) {
        this.salespersonId = salespersonId;
        this.name = name;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Salesperson ID: " + salespersonId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}