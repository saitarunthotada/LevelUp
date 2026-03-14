package CarRentProfitCalculator;

public class Expense {

    private String date;
    private String type;
    private double amount;
    private double insurance;

    public Expense(String type, String date, double amount) {
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
