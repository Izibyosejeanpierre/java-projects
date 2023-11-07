//java program to calculate simple interest
class BankAccount {
      //Declaring variables
    private double principal;
    private double rate;
    private int years;
//defining methode
    public BankAccount(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }
    //object
    public double calculateSimpleInterest() {
        double simpleInterest = (principal * rate * years) / 100;
        return simpleInterest;//return value
    }
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 100000; // Initial deposit in Rwandan Francs
        double rate = 5; // Annual interest rate (5%)
        int years = 5; // Number of years
//calling methode
        BankAccount account = new BankAccount(principal, rate, years);
        double simpleInterest = account.calculateSimpleInterest();
//code for output
        System.out.println("Principal Amount: " + principal + " RWF");
        System.out.println("Annual Interest Rate: " + rate + "%");
        System.out.println("Number of Years: " + years);
        System.out.println("Simple Interest: " + simpleInterest + " RWF");
    }
}
