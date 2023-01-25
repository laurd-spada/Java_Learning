import java.util.Scanner;
public class Life_Calculator {
    static void lifeCalculator(){
        System.out.println("Hello and welcome to\n ===== LIFE CALCULATOR =====");
        // Using the scanner library to collect user input
        Scanner data = new Scanner(System.in);
        // A while loop to re-run the program as many times the user wants to
        boolean replay = true;
        while (replay) {
            System.out.println("Hello, What is your name: ");
            String name = data.nextLine();
            System.out.println("How old are you: ");
            // Converting the result from the scanner to an int value
            int age = Integer.parseInt(data.nextLine());
            //Applying the required arithmetic operation to calculate the seconds, minutes, hours, days, weeks, months
            int seconds = age * 31536000;
            int minutes = age * 525600;
            int hours = age * 8760;

            int days = age * 365;
            int weeks = age * 52;
            int months = age * 12;

            System.out.println("Hello " + name + ", You have lived a total of " + seconds + " seconds, " + minutes + " minutes, " + hours + " hours,"
                    + days + " days," + weeks + " weeks and " + months + " months.");

            System.out.println("Would you like to run this program again. select 1 for yes and 2 for no: ");
            int choice = Integer.parseInt(data.nextLine());
            // conditionals for running the loop
            if (choice == 1) {
                replay = true;
            }
            else if (choice == 2) {
                break;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        lifeCalculator();
    }
}
