public class TradeInVehicle {
    private String serialNo;
    private String make;
    private String model;
    private int year;

    public TradeInVehicle(String serialNo, String make, String model, int year) {
        this.serialNo = serialNo;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Trade-in Serial No: " + serialNo);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}