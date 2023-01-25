import java.util.Scanner;
public class Number_Guess_Game {
    static int easyMode = 10;
    static int hardMode = 5;
    static  String victory;

    static void numberGuess(){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my number guessing game!");
        System.out.println("Please provide the required detail");
        System.out.println("Select \"1\" for easy mode were you have 10 lives and select \"2\" for hard mode when you have 5 lives");
        int difficulty = Integer.parseInt(input.nextLine());
        if (difficulty == 1){
            System.out.println("You are playing on easy mode \n");
        } else if (difficulty == 2){
            System.out.println("You are playing on hard mode \n");
        }
        int compResult = (int) (Math.random() * 11);
        boolean replay = true;
        while (replay){
            System.out.println("Guess a number between 1 and 100");
            int userResult = Integer.parseInt(input.nextLine());

            if (hardMode == 0 || easyMode == 0){
                System.out.println("You have no more lives left \n ==== GAME OVER =====");
                break;
            }
            else if (userResult == compResult){
                victory = "Congratulations, you won! \n ======= WINNER =======";
                replay = false;
            } else if (userResult < compResult){
                victory = "Too low! you lost a life";
                if (difficulty == 1){
                    easyMode--;
                } else if (difficulty == 2){
                    hardMode--;
                }
            } else if (userResult > compResult){
                victory= "Too high! you lost a life";
                if (difficulty == 1){
                    easyMode--;
                } else if (difficulty == 2){
                    hardMode--;
                }
            }
            System.out.println( victory + ", " + ((difficulty ==1) ? easyMode + " no of lives \n" : hardMode + " no of lives \n"));
        }
    }
    public static void main(String[] args){
        numberGuess();
    }
}
