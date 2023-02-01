import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage_Calculator {

    public static double calculateMortgage(int principal, float annualInterestRate, byte period){
        float monthlyRate = (annualInterestRate / 100) / 12;
        // period =(byte) (period * 12);
        float numberOfPayment = period * 12;
        double finalScore = principal * (monthlyRate*Math.pow(1+monthlyRate, numberOfPayment) / (Math.pow(1+monthlyRate, numberOfPayment) - 1));
        return finalScore;
    }
    public static double readNumber(String prompt, double min, double max){
        Scanner userInput = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = userInput.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a number within the range of ( greater than " + min +" - "+max+" )");
        }
        return value;
    }
    public static void main(String[] args) {
        int principal = (int) readNumber("Please enter your Principal ($1k - $1m): ", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Enter your Annual Interest Rate: ", 1,30);
        byte period = (byte) readNumber("Enter the period(Years) to pay back: ", 1, 30);

        double finalScore = calculateMortgage(principal, annualInterestRate, period);
        System.out.println("Your Mortgage for every month will be : " + NumberFormat.getCurrencyInstance().format(finalScore));

        
    }
}
