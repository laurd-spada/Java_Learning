import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class HangMan {
    static int no_lives = 10;
    static void hangman(){
        // A welcome introduction to the game for players
        System.out.println("Welcome to the hangman game === JAVA EDITION ===");
        System.out.println(" === prod. by Lawrd Sparda === \n");
        System.out.println("You are provided with a Secret-character and expected to guess the characters to fill that position");
        System.out.println("Make a guess");
        // A list or array of words that a secret word would randomly be selected from
        String[] word_list = {"car", "apple", "camel", "dog", "car", "horse", "toad", "cup","bag", "tea", "fire", "air",};
        // An algorithm that selects a word at random from the array of words provided
        int wordIndex =(int) (Math.random() * word_list.length);
        String secret_Word = word_list[wordIndex];
        // Made a copy of the secret word to an array to fix the bug of re-selecting repeated character to update
        List<String> newName = Arrays.asList(secret_Word.split("")); // created a mutable array
        // A java Array String package imported from the java library that creates a modifiable array list
        ArrayList<String> wordsHangman = new ArrayList<String>();
        // A loop algorithm that gives the user an idea of the word that they should be looking for
        for (int i = 0; i < secret_Word.length(); i++){
            wordsHangman.add("#");
        }
        // For testing
        System.out.println(wordsHangman );
        // Beginning of loop
        boolean replay = true;
        while (replay) {
            // Creating an object to collect user input
            Scanner inputCollector = new Scanner(System.in);
            // Collect user input and store to a variable
            String userGuess = inputCollector.nextLine();
            // Creating conditions to check answers
            if (no_lives == 0) {
                System.out.println("Oops! Looks like you are out of lives ====== The End =====");
                replay = false;
            } else if (newName.contains(userGuess)) { // the contain method checks if the argument taken is inside the array
                System.out.println("Luck Guess");
                int loc = newName.indexOf(userGuess); // the indexOf method locates the index position of the integer argument it takes in
                wordsHangman.set(loc, userGuess); // The set method changes an item at the set integer(loc) and the content to replace with(userGuess)
                newName.set(loc, "*"); // Re-assign a new value to character to intercept re-selection.
                if(!wordsHangman.contains("#")) { // the non-existence of the "#" character indicates a completion of the game
                    System.out.println(wordsHangman);
                    System.out.println("Congratulations on completing the game");
                    break;
                }
            } else {
                System.out.println("Wrong input please try again");
                no_lives--;
                System.out.println("You have " + no_lives + " no of life left");
            }
            System.out.println(wordsHangman);
        }
    }
public static void main(String[] args){
    hangman();
}
}
