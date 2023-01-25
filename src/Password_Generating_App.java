import java.util.Scanner;
public class Password_Generating_App {
    // Password Generator Service using for loop and random nnumber generator

    // Created the method to generate the password
    static void passwordGenerator(){
        Scanner variablCollector = new Scanner(System.in);
        System.out.println("Welcome to \n ====== Random Password Generator ======");
        // created several variables to store the values that the password will be generated from
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "123456789";

        // concatenated the variables
        String all = lower + upper + number;
        System.out.println("Please select the length of the random password you would like to generate");
        // Collect the user selected password length
        int password_number = variablCollector.nextInt();
        // String builder with a capacity of the password length provided by the user
        StringBuilder s = new StringBuilder(password_number);

        // created a for loop with the length provided by the user to allocate reandom numbers to that capacity
        int i;
        for ( i=0; i<password_number; i++) {
            // using Math.random multiply by the length of available characters to select from characters available
            int ch = (int)(all.length() * Math.random());
            // Append each character by using the generated random to locate the index of the character
            s.append(all.charAt(ch));
        }

        System.out.println("Your password have been generated and is as follows: " + s);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        passwordGenerator();
    }
}
