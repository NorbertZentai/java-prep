/**
 * JavaBasics - Practice exercises for fundamental Java concepts
 * 
 * This file provides practice for basic Java syntax, loops, and simple algorithms.
 * Every task contains description, example, and testing opportunities.
 */

import java.util.*;
import java.util.stream.*;

public class JavaBasics {

    /**
     * TASK 1: Maximum of numbers
     * Goal: Return the largest number from an array
     * Requirements: Handle negative numbers too, non-empty array
     */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null!");
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * TASK 2: String reversal
     * Goal: Reverse the input string
     * Requirements: Handle empty and single-character strings
     */
    public static String reverseString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * TASK 3: Vowel counting
     * Goal: Count the vowels in a word
     * Requirements: Case-insensitive, only a e i o u
     */
    public static int countVowels(String word) {
        if (word == null) {
            return 0;
        }
        
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * TASK 4: Number swapping
     * Goal: Swap the values of two numbers
     * Variants: with helper variable and without
     */
    public static int[] swapNumbers(int a, int b) {
        // With helper variable
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
    
    public static int[] swapNumbersWithoutTemp(int a, int b) {
        // Arithmetic method
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    /**
     * TASK 5: Palindrome check
     * Goal: Check if a string is a palindrome
     * Requirements: Case-insensitive
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        
        String cleaned = input.toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * TASK 6: Array operations
     * Goal: Basic operations: sum, average, min/max
     */
    public static int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
    
    public static double average(int[] numbers) {
        if (numbers.length == 0) return 0;
        return (double) sum(numbers) / numbers.length;
    }
    
    public static int min(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    /**
     * TASK 7: Remove duplicates
     * Goal: Return unique elements from an array
     */
    public static int[] removeDuplicates(int[] numbers) {
        return Arrays.stream(numbers)
                    .distinct()
                    .toArray();
    }

    /**
     * TASK 8: Second largest number
     * Goal: Return the second largest number
     */
    public static int secondLargest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least 2 elements required!");
        }
        
        int[] uniqueSorted = Arrays.stream(numbers)
                                  .distinct()
                                  .sorted()
                                  .toArray();
        
        if (uniqueSorted.length < 2) {
            throw new IllegalArgumentException("No second largest element!");
        }
        
        return uniqueSorted[uniqueSorted.length - 2];
    }

    /**
     * TASK 9: FizzBuzz game
     * Goal: Counting from 1 to n, "Fizz" for divisible by 3, 
     *       "Buzz" for divisible by 5, "FizzBuzz" for both
     */
    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }

    /**
     * TASK 10: Factorial calculation
     * Goal: Calculate n! value recursively and iteratively
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers don't have factorial!");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers don't have factorial!");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * TASK 11: Fibonacci sequence
     * Goal: Return the first n Fibonacci numbers
     */
    public static int[] fibonacciSequence(int n) {
        if (n <= 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[]{0};
        }
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /**
     * TASK 12: Prime number check
     * Goal: Check if a number is prime
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
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
