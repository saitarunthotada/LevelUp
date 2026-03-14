package CarRentProfitCalculator;

public class Booking {

    private final double amount;

    public Booking(String date, double distanceKm, double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
