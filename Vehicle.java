public class Vehicle {
    private int serialNo;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(int serialNo, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNo = serialNo;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("Vehicle Serial No: " + serialNo);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: " + baseCost);
    }
}