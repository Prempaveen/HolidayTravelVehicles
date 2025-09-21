import java.util.Date;
import java.util.List;

public class Invoice {
    private int invoiceNo;
    private Date date;
    private double negotiatedPrice;
    private double tax;
    private double licenseFee;
    private double totalPrice;
    private Vehicle vehicle;
    private List<Option> options;
    private TradeInVehicle tradeInVehicle;

    public Invoice(int invoiceNo, Date date, double negotiatedPrice, double tax, double licenseFee, double totalPrice,
                   Vehicle vehicle, List<Option> options, TradeInVehicle tradeInVehicle) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.negotiatedPrice = negotiatedPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.totalPrice = totalPrice;
        this.vehicle = vehicle;
        this.options = options;
        this.tradeInVehicle = tradeInVehicle;
    }

    public void displayInfo() {
        System.out.println("Invoice No: " + invoiceNo);
        System.out.println("Date: " + date);
        System.out.println("Negotiated Price: " + negotiatedPrice);
        System.out.println("Tax: " + tax);
        System.out.println("License Fee: " + licenseFee);
        System.out.println("Total Price: " + totalPrice);
        if(vehicle != null) vehicle.displayInfo();
        if(options != null) {
            for(Option o : options) o.displayInfo();
        }
        if(tradeInVehicle != null) tradeInVehicle.displayInfo();
    }
}