import java.util.Scanner;
public class Rock_Paper_Scissors {
    // Rock Paper Scissors Game on Java
    // Created a function
    static void rockPaperScissorsGame(){
        // managing variables
        String victory;
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        Scanner input = new Scanner(System.in);
        //Welcome citation
        System.out.println("Welcome to a game of rock paper scissors!");
        System.out.println("Please provide the required detail \n");
        System.out.print("Please enter your name lets begin: ");
        String name = input.nextLine();
        // While loop to keep running until user decides to quit
        boolean replay = true;
        while (replay){
            // Generate a random value for the computer
            int compChoice =(int) (Math.random() * 4);

            System.out.println("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors.");
            int userChoice = Integer.parseInt(input.nextLine());
            // If conditions to determine the winner
            if (compChoice == userChoice){
                victory = "Oops!, it was a draw";
            } else if (userChoice == rock && compChoice == scissors){
                victory = "Congratulations!, Rock breaks scissors";
            } else if (userChoice == paper && compChoice == rock){
                victory = "Congratulations, Paper covers Rock";
            } else if (userChoice == scissors && compChoice == paper){
                victory = "Congratulations, Scissors cuts paper";
            } else {
                victory= "Sorry, you lost try again.";
            }
            // Display results
            System.out.println(victory + "\n");
            // Algorithm for playing again
            System.out.print("Hello " + name + ", Would you like to play again? (Select 1 for yes or 2 for no): ");
            int playAgain = Integer.parseInt(input.nextLine());
            if (playAgain == 1){
                replay = true;
            } else {
                System.out.println("Thanks for playing \n");
                replay = false;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        rockPaperScissorsGame();
    }
}
