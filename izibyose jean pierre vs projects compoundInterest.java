//java program to calculate compound interest
public class compoundInterestexample {
    public static void main(String[] args) {
          //Defining variables for methode
        double principal = 500000;
        double annualInterestRate = 0.18;
        int numberOfTimesCompounded = 12;
        int numberOfYears = 3;
//calling methode
        double totalAmount = calculateCompoundInterest(principal, annualInterestRate, numberOfTimesCompounded, numberOfYears);
        
        System.out.printf("Total amount paid after %d years: %.2f%n", numberOfYears, totalAmount);
    }
//code for object
    public static double calculateCompoundInterest(double principal, double annualInterestRate, int numberOfTimesCompounded, int numberOfYears) {
        double compoundInterest = principal * Math.pow(1 + (annualInterestRate / numberOfTimesCompounded), numberOfTimesCompounded * numberOfYears);
        return compoundInterest;//return value
    }
}
