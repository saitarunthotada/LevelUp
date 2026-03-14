package CarRentProfitCalculator;

public class ProfitReport {
    public static double calculateIncome(){
        double total = 0;

        for(Booking booking: DataStorage.bookings){
            total += booking.getAmount();
        }
        return total;
    }
    public static double calculateExpense(Vehicle vehicle){
        double total = 0;

        for(Expense expense : DataStorage.expenses){
            total += expense.getAmount();
        }
        return total+ vehicle.getInsuranceYearly();
    }
    public static double calculateProfitOrLoss(Vehicle vehicle){
        double available = calculateIncome() - calculateExpense(vehicle);

        if(available>=vehicle.getEmi()){
            return available - vehicle.getEmi();
        }
        return available;
    }
}