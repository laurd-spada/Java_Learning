import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to FizzBuzz");
        System.out.println("Please enter a number: ");
        int data = userInput.nextInt();

        if (data % 3 == 0 && data % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (data % 5 == 0){
            System.out.println("Fizz");
        } else if (data % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(data);
        }
    }
}
