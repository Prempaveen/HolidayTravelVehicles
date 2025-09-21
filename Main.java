import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4770, "Phantom", "Luxury Sedan", 2024, "Rolls-Royce", 450000);
        v.displayInfo();

        Option op1 = new Option("Leather", "Leather Seats", 1200);
        Option op2 = new Option("Navigation", "Navigation System", 900);
        ArrayList<Option> optionList = new ArrayList<>();
        optionList.add(op1);
        optionList.add(op2);

        TradeInVehicle trade = new TradeInVehicle("B2020", "Bentley", "Bentayga", 2020);

        Invoice inv = new Invoice(1, new Date(), 24000, 1500, 300, 25800, v, optionList, trade);
        System.out.println("\n--- Invoice Details ---");
        inv.displayInfo();
    }
}