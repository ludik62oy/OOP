package Labaratory1.com;

public class Main {

    // 1. Method to check if an array is non-decreasing
    public static boolean isNonDecreasing(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            // If an element is smaller than the previous one, return false
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        // If no element violates the non-decreasing condition, return true
        return true;
    }

    // 2. Method for the FizzBuzz game
    public static void fizzBuzz() {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // If the number is divisible by both 3 and 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // If the number is divisible only by 3, print "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If the number is divisible only by 5, print "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }

    // 3*. Method to check if the array can be split into two parts with equal sums
    public static boolean canPartition(int[] arr) {
        int totalSum = 0;
        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // If the total sum is odd, it's impossible to split it into two equal parts
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2; // The sum each part needs to reach
        int currentSum = 0;

        // Traverse through the array and accumulate the sum
        for (int num : arr) {
            currentSum += num;
            // If the accumulated sum equals the target sum, return true
            if (currentSum == targetSum) {
                return true;
            }
        }

        // If no equal partition is found, return false
        return false;
    }
}
