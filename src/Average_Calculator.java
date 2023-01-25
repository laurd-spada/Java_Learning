public class Average_Calculator {
    // created the average calculator function
    static void averageDataCalculator(int[] arr){
        // create a variable that holds a double data type value
        double sum = 0;
        // created an enhanced for loop that loops the array and sums the total data
        for (int j : arr) {
            sum += j;
        }
        // created an int value to count the numbers of value inside the array
        int noChar = arr.length;
        // carried out the division arithmetics of the data (total value divided by the number of elements)
        double average = sum / noChar;
        // Printed results
        System.out.println("The sum of the data in the array provided is equal to " + sum + ", no of characters is " + noChar + " and average result is " + average);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        int[] value = {1,2,3,4,5,6,7,8,9,10};
        averageDataCalculator(value);
    }
}
