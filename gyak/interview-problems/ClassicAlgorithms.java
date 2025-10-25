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

/**
 * Interview Problems - Classic Algorithms
 * 
 * This file contains classic algorithms for common interview problems.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class ClassicAlgorithms {

    /**
     * 1) TASK: FizzBuzz
     * 
     * Goal: Write a program that counts from 1 to n, but:
     * - For numbers divisible by 3, write "Fizz"
     * - For numbers divisible by 5, write "Buzz"  
     * - For numbers divisible by both, write "FizzBuzz"
     * - Otherwise write the number
     * 
     * Example: fizzBuzz(15) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
     */
    public static String[] fizzBuzz(int n) {
        // TODO: Implementáld itt a megoldást
        return new String[0];
    }

    /**
     * 2) TASK: Find Missing Number
     * 
     * Goal: In an array from 0 to n, exactly one number is missing. Find it!
     * Követelmények:
     * - Array length is n (so one number from n+1 numbers is missing)
     * - Numbers are from 0 to n, but one is missing
     * - Find efficient solution (not brute force)
     * 
     * Example: findMissingNumber([3, 0, 1], 3) -> 2
     */
    public static int findMissingNumber(int[] nums, int n) {
        // TODO: Implement your solution here (sum formula can be used)
        return -1;
    }

    /**
     * 3) TASK: Find duplicate
     * 
     * Goal: Find the element that appears more than once in the array
     * Requirements:
     * - Array contains numbers from 1 to n
     * - Exactly one number repeats
     * - Find efficient solution (Set or cycle detection)
     * 
     * Example: findDuplicate([1, 3, 4, 2, 2]) -> 2
     */
    public static int findDuplicate(int[] nums) {
        // TODO: Implement your solution here
        return -1;
    }

    /**
     * 4) TASK: Swap numbers without temporary variable
     * 
     * Goal: Swap two numbers without using a temporary variable
     * Requirements:
     * - You can use arithmetic operations
     * - Or XOR bitwise operation
     * - Return the swapped values
     * 
     * Example: swapWithoutTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithoutTemp(int a, int b) {
        // TODO: Implement your solution here
        return new int[]{a, b};
    }

    /**
     * 5) TASK: Balanced Parentheses
     * 
     * Goal: Check if parentheses are balanced in a string
     * Requirements:
     * - Supported brackets: (), [], {}
     * - Every opening bracket must have a corresponding closing bracket
     * - Order matters too
     * 
     * Example: isValidParentheses("({[]})") -> true, isValidParentheses("({[}])") -> false
     */
    public static boolean isValidParentheses(String s) {
        // TODO: Implement your solution here (using Stack)
        return false;
    }

    // ===============================
    // TESTS - Do not modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== CLASSIC ALGORITHMS TESTS ===\n");
        
        runFizzBuzzTests();
        runMissingNumberTests();
        runFindDuplicateTests();
        runSwapWithoutTempTests();
        runValidParenthesesTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runFizzBuzzTests() {
        System.out.println("1. FIZZBUZZ TESTS:");
        
        // Test 1: Small number
        String[] result1 = fizzBuzz(5);
        String[] expected1 = {"1", "2", "Fizz", "4", "Buzz"};
        testStringArray(result1, expected1, "n=5");
        
        // Test 2: Up to 15 (includes FizzBuzz)
        String[] result2 = fizzBuzz(15);
        String[] expected2 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        testStringArray(result2, expected2, "n=15");
        
        System.out.println();
    }

    private static void runMissingNumberTests() {
        System.out.println("2. MISSING NUMBER TESTS:");
        
        // Test 1: Missing 2
        testMissingNumber(new int[]{3, 0, 1}, 3, 2, "missing 2");
        
        // Test 2: Missing 0
        testMissingNumber(new int[]{1, 2}, 2, 0, "missing 0");
        
        // Test 3: Missing last
        testMissingNumber(new int[]{0, 1}, 2, 2, "missing last");
        
        // Test 4: Larger array
        testMissingNumber(new int[]{0, 1, 3, 4, 5}, 5, 2, "larger array");
        
        System.out.println();
    }

    private static void runFindDuplicateTests() {
        System.out.println("3. DUPLICATE FINDING TESTS:");
        
        // Test 1: Simple case
        testFindDuplicate(new int[]{1, 3, 4, 2, 2}, 2, "simple case");
        
        // Test 2: First element repeats
        testFindDuplicate(new int[]{3, 1, 3, 4, 2}, 3, "first element repeats");
        
        // Test 3: Last element repeats
        testFindDuplicate(new int[]{1, 1}, 1, "last element repeats");
        
        System.out.println();
    }

    private static void runSwapWithoutTempTests() {
        System.out.println("4. SWAP WITHOUT TEMP TESTS:");
        
        // Test 1: Positive numbers
        testSwap(5, 10, "positive numbers");
        
        // Test 2: Negative numbers
        testSwap(-3, -7, "negative numbers");
        
        // Test 3: Mixed numbers
        testSwap(-5, 8, "mixed numbers");
        
        System.out.println();
    }

    private static void runValidParenthesesTests() {
        System.out.println("5. BALANCED PARENTHESES TESTS:");
        
        // Test 1: Valid cases
        testValidParentheses("()", true, "simple ()");
        testValidParentheses("()[]{}", true, "mixed types");
        testValidParentheses("({[]})", true, "nested");
        testValidParentheses("", true, "empty string");
        
        // Test 2: Invalid cases
        testValidParentheses("(]", false, "wrong pairing");
        testValidParentheses("([)]", false, "crossed");
        testValidParentheses("((", false, "only opening");
        testValidParentheses("))", false, "only closing");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testStringArray(String[] result, String[] expected, String description) {
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (expected: %s)\n", 
                         status, description, Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testMissingNumber(int[] nums, int n, int expected, String description) {
        int result = findMissingNumber(nums, n);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s, n=%d -> %d (expected: %d)\n", 
                         status, description, Arrays.toString(nums), n, result, expected);
    }

    private static void testFindDuplicate(int[] nums, int expected, String description) {
        int result = findDuplicate(nums);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %d (expected: %d)\n", 
                         status, description, Arrays.toString(nums), result, expected);
    }

    private static void testSwap(int a, int b, String description) {
        int[] result = swapWithoutTemp(a, b);
        boolean isCorrect = result.length == 2 && result[0] == b && result[1] == a;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: (%d, %d) -> [%d, %d] (expected: [%d, %d])\n", 
                         status, description, a, b, result[0], result[1], b, a);
    }

    private static void testValidParentheses(String input, boolean expected, String description) {
        boolean result = isValidParentheses(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (expected: %s)\n", 
                         status, description, input, result, expected);
    }
}