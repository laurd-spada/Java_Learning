import java.util.ArrayList;
import java.util.Scanner;
public class Ceaser_Cypher {
    public static void ceaserCypher(){
        System.out.println("Welcome to ====== CEASER CYPHER ======");
        System.out.println("A password encryption service that helps you send and receive encrypted messages and decrypt" +
                " them for you as well \n");
        // Created object for collecting user input
        Scanner userInput = new Scanner(System.in);
        // Created an alphabet array to compare user input
        String[] alphabet = {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] alphabet_dec = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        // Created an Array list that gives additional access to control.
        ArrayList<String> alph = new ArrayList<String>();
        for (int i = 0; i < alphabet.length; i++){
            alph.add(alphabet[i]);
        }
        ArrayList<String> newAlph = new ArrayList<String>();
        for (int i = 0; i < alphabet_dec.length; i++){
            newAlph.add(alphabet_dec[i]);
        }

        System.out.println("Would you like to \"ENCODE\" a message or to \"DECODE\" a message : ");
        System.out.println("Select 1 to encode or 2 to decode a message");
        int decision = Integer.parseInt(userInput.nextLine());
        //Selection logics between encryption and decryption
        if (decision == 1){
            // Created an empty array list to hold the final result
            ArrayList<String> encrypted = new ArrayList<String>();
            System.out.println("Please provide the text that you would like to encrypt");
            //Collect user text or message
            String text_to_encrypt = userInput.nextLine();
            //Collect user key
            System.out.println("Please provide the key value ");
            int key_to_encrypt = userInput.nextInt();
            // Converting user text or message to an array
            String[] sp = text_to_encrypt.split("");
            // Looping through the user text or message a single character at a time to count shift
            for (int i = 0; i < sp.length; i++){
                // The logic for a space character
                if (!alph.contains(sp[i])){
                    encrypted.add(sp[i]);
                    continue;
                }
                // Getting the index of the user input in the whole alphabet array
                int loc = alph.indexOf(sp[i]);
                // Building a logic to restart the count process when at the last character
                int position = loc + key_to_encrypt;
                if (position > 26){
                    position = position - 26;
                }
                // Adding the character at the alphabet position plus the shift key
                encrypted.add(alphabet[position]);
            }
            String value = String.join("", encrypted);
            // Print result
            System.out.println("The Result is : " + value);

        } else if (decision ==2) { //Logic for the decryption
            ArrayList<String> decrypted = new ArrayList<String>();
            System.out.println("Please provide the text you would like to decrypt: ");
            // Collect the encrypted message you would like to decrypt
            String text_to_decrypt = userInput.nextLine();
            // Select the key to use to decrypt your text
            System.out.println("Please select the key to decrypt the message with: ");
            int key_to_decrypt = userInput.nextInt();
            String[] arrDecrypt = text_to_decrypt.split("");
            for (int i = 0; i < arrDecrypt.length; i++){
                // The logic for a space character
                if (!newAlph.contains(arrDecrypt[i])){
                    decrypted.add(arrDecrypt[i]);
                    continue;
                }
                // Getting the index of the user input in the whole alphabet array
                int loc = newAlph.indexOf(arrDecrypt[i]);
                // Building a logic to restart the count process when at the last character
                int position = loc - key_to_decrypt;
                if (position < 0){
                    position = position + 26;
                }
                // Adding the character at the alphabet position plus the shift key
                decrypted.add(alphabet_dec[position]);
            }
            String value = String.join("", decrypted);
            System.out.println("The Result is : " + value);
        } else { // Error catcher
            System.out.println("You have entered an invalid character, Please enter a correct character");
        }
    }
    public static void main(String[] args){
        ceaserCypher();
    }
}
