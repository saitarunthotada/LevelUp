package CarRentProfitCalculator;

public class Vehicle {

    private double emi;
    private double insuranceYearly;

    public Vehicle(double insuranceYearly, double emi) {
        this.insuranceYearly = insuranceYearly;
        this.emi = emi;
    }

    public double getEmi(){
        return emi;
    }
    public double getInsuranceYearly(){
        return insuranceYearly/12;
    }
}
