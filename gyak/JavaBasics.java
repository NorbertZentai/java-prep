/**
 * JavaBasics - Practice exercises for fundamental Java concepts
 * 
 * This file provides practice for basic Java syntax, loops, and simple algorithms.
 * Every task contains description, example, and testing opportunities.
 */

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.nio.file.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class JavaBasics {

    /**
     * TASK 1: Maximum of numbers
     * Goal: Return the largest number from an array
     * Requirements: Handle negative numbers too, non-empty array
     */
    public static int findMax(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TASK 2: String reversal
     * Goal: Reverse the input string
     * Requirements: Handle empty and single-character strings
     */
    public static String reverseString(String input) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * TASK 3: Vowel counting
     * Goal: Count the vowels in a word
     * Requirements: Case-insensitive, only a e i o u
     */
    public static int countVowels(String word) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TASK 4: Number swapping
     * Goal: Swap the values of two numbers
     * Variants: with helper variable and without
     */
    public static int[] swapNumbers(int a, int b) {
        // TODO: Implement your solution here
        return new int[]{0, 0};
    }
    
    public static int[] swapNumbersWithoutTemp(int a, int b) {
        // TODO: Implement your solution here
        return new int[]{0, 0};
    }

    /**
     * TASK 5: Palindrome check
     * Goal: Check if a string is a palindrome
     * Requirements: Case-insensitive
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * TASK 6: Array operations
     * Goal: Basic operations: sum, average, min/max
     */
    public static int sum(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }
    
    public static double average(int[] numbers) {
        // TODO: Implement your solution here
        return 0.0;
    }
    
    public static int min(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TASK 7: Remove duplicates
     * Goal: Return unique elements from an array
     */
    public static int[] removeDuplicates(int[] numbers) {
        // TODO: Implement your solution here
        return new int[0];
    }

    /**
     * TASK 8: Second largest number
     * Goal: Return the second largest number
     */
    public static int secondLargest(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TASK 9: FizzBuzz game
     * Goal: Counting from 1 to n, "Fizz" for divisible by 3, 
     *       "Buzz" for divisible by 5, "FizzBuzz" for both
     */
    public static String[] fizzBuzz(int n) {
        // TODO: Implement your solution here
        return new String[0];
    }

    /**
     * TASK 10: Factorial calculation
     * Goal: Calculate n! value recursively and iteratively
     */
    public static long factorialRecursive(int n) {
        // TODO: Implement your solution here
        return 0;
    }
    
    public static long factorialIterative(int n) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * TASK 11: Fibonacci sequence
     * Goal: Return the first n Fibonacci numbers
     */
    public static int[] fibonacciSequence(int n) {
        // TODO: Implement your solution here
        return new int[0];
    }

    /**
     * TASK 12: Prime number check
     * Goal: Check if a number is prime
     */
    public static boolean isPrime(int n) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * MAIN PROGRAM - For testing and demonstration
     */
    public static void main(String[] args) {
        System.out.println("=== JAVA BASICS PRACTICE EXERCISES ===\n");
        
        // 1. Maximum search testing
        int[] testNumbers = {3, 7, 2, 9, 1, 5};
        System.out.println("1. Maximum search:");
        System.out.println("Array: " + Arrays.toString(testNumbers));
        System.out.println("Maximum: " + findMax(testNumbers) + "\n");
        
        // 2. String reversal
        String testString = "hello";
        System.out.println("2. String reversal:");
        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + reverseString(testString) + "\n");
        
        // 3. Vowel counting
        String testWord = "programming";
        System.out.println("3. Vowel counting:");
        System.out.println("Word: " + testWord);
        System.out.println("Vowel count: " + countVowels(testWord) + "\n");
        
        // 4. Palindrome check
        String[] testPalindromes = {"racecar", "hello", "madam"};
        System.out.println("4. Palindrome check:");
        for (String word : testPalindromes) {
            System.out.println(word + " palindrome? " + isPalindrome(word));
        }
        System.out.println();
        
        // 5. FizzBuzz
        System.out.println("5. FizzBuzz from 1 to 15:");
        String[] fizzBuzzResult = fizzBuzz(15);
        System.out.println(Arrays.toString(fizzBuzzResult) + "\n");
        
        // 6. Factorial
        int factNum = 5;
        System.out.println("6. Factorial calculation:");
        System.out.println(factNum + "! = " + factorialRecursive(factNum) + " (recursive)");
        System.out.println(factNum + "! = " + factorialIterative(factNum) + " (iterative)\n");
        
        // 7. Fibonacci
        System.out.println("7. Fibonacci sequence (first 10 numbers):");
        int[] fibSeq = fibonacciSequence(10);
        System.out.println(Arrays.toString(fibSeq) + "\n");
        
        // 8. Prime number check
        int[] primeTests = {2, 3, 4, 17, 25, 29};
        System.out.println("8. Prime number check:");
        for (int num : primeTests) {
            System.out.println(num + " prime? " + isPrime(num));
        }
    }
}
