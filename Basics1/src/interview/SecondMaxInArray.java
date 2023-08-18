package interview;

import java.util.Arrays;

public class SecondMaxInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 3, 2};

        // Initialize two variables to store the largest and second largest numbers
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Iterate through the array and update the largest and second largest numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        // Print the second largest number
        System.out.println("The second largest number is: " + secondMax);
    }
}

