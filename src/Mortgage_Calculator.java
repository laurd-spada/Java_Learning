import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage_Calculator {
    public static void mortgageCalculator(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your Principal: ");
        int principal = userInput.nextInt();
        System.out.println("Enter your Annual Interest Rate: ");
        double annualInterestRate = userInput.nextDouble();
        double monthlyRate = (annualInterestRate/100)/12;
        System.out.println("Enter the period(Years) to pay back: ");
        int period = userInput.nextInt() * 12;


        double finalScore = principal * (monthlyRate*Math.pow(1+monthlyRate, period) / (Math.pow(1+monthlyRate, period) - 1));

        ;
        System.out.println("Your Mortgage for every month will be : " + NumberFormat.getCurrencyInstance().format(finalScore));
    }

    public static void main(String[] args) {
        mortgageCalculator();
    }
}
