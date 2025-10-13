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
 * Day 2 - Arrays and Collections
 * 
 * This file contains exercises for array and collection operations.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class ArraysAndCollections {

    /**
     * 1) TASK: Basic Array Operations
     * 
     * Goal: Implement basic operations: sum, average, minimum, maximum
          * Requirements:
     * - Iterate through the array
     * - Handle negative numbers and zero
     * - Return proper average (double type)
     * 
     * Example: [1, 2, 3, 4, 5] -> sum: 15, average: 3.0, min: 1, max: 5
     */
    public static int arraySum(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    public static double arrayAverage(int[] numbers) {
        // TODO: Implement your solution here
        return 0.0;
    }

    public static int arrayMin(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    public static int arrayMax(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * 2) TASK: Second Largest Number
     * 
     * Goal: Find the second largest number in the array
     * Követelmények:
     * - Handle duplicates (second largest among unique values)
     * - If there's no second largest, throw IllegalArgumentException
     * 
     * Example: [1, 5, 2, 9, 3, 9] -> 5 (largest after 9)
     */
    public static int secondLargest(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * 3) TASK: Remove Duplicates
     * 
     * Goal: Remove duplicates from an array
     * Követelmények:
     * - Use Set to remove duplicates
     * - Return a new array
     * - Order doesn't matter
     * 
     * Example: [1, 2, 2, 3, 3, 3, 4] -> [1, 2, 3, 4]
     */
    public static int[] removeDuplicates(int[] numbers) {
        // TODO: Implement your solution here
        return new int[0];
    }

    /**
     * 4) TASK: List Basic Operations
     * 
     * Goal: Practice List operations: add, search, remove
     * 
     * This method is for demonstration - return a list that:
     * - Contains the input elements
     * - Removes the "remove" string if it exists
     * - Adds "added" string to the end
     */
    public static List<String> listOperations(String[] initialElements, String toRemove) {
        // TODO: Implement your solution here
        return new ArrayList<>();
    }

    /**
     * 5) TASK: Map Basic Operations
     * 
     * Goal: Practice Map operations
     * 
     * Create a Map that:
     * - Stores string length as key, the string itself as value
     * - If multiple strings have same length, store the last one
     */
    public static Map<Integer, String> createLengthMap(String[] words) {
        // TODO: Implement your solution here
        return new HashMap<>();
    }

    // ===============================
    // TESTS - Don't modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== ARRAYS AND COLLECTIONS TESTS ===\n");
        
        runArrayOperationsTests();
        runSecondLargestTests();
        runRemoveDuplicatesTests();
        runListOperationsTests();
        runMapOperationsTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runArrayOperationsTests() {
        System.out.println("1. ARRAY BASIC OPERATIONS TESTS:");
        
        int[] test1 = {1, 2, 3, 4, 5};
        testArrayOperations(test1, 15, 3.0, 1, 5, "positive numbers");
        
        int[] test2 = {-5, -2, -8, -1};
        testArrayOperations(test2, -16, -4.0, -8, -1, "negative numbers");
        
        int[] test3 = {10};
        testArrayOperations(test3, 10, 10.0, 10, 10, "single element");
        
        System.out.println();
    }

    private static void runSecondLargestTests() {
        System.out.println("2. SECOND LARGEST TESTS:");
        
        // Test 1: Normál eset
        testSecondLargest(new int[]{1, 5, 2, 9, 3}, 5, "normal case");
        
        // Test 2: Duplikátumokkal
        testSecondLargest(new int[]{9, 1, 5, 2, 9, 3}, 5, "with duplicates");
        
        // Test 3: Rendezett tömb
        testSecondLargest(new int[]{1, 2, 3, 4, 5}, 4, "sorted array");
        
        System.out.println();
    }

    private static void runRemoveDuplicatesTests() {
        System.out.println("3. REMOVE DUPLICATES TESTS:");
        
        // Test 1: Duplikátumokkal
        testRemoveDuplicates(new int[]{1, 2, 2, 3, 3, 3, 4}, 
                           new int[]{1, 2, 3, 4}, "with duplicates");
        
        // Test 2: Nincs duplikátum
        testRemoveDuplicates(new int[]{1, 2, 3, 4}, 
                           new int[]{1, 2, 3, 4}, "no duplicates");
        
        // Test 3: Mind egyforma
        testRemoveDuplicates(new int[]{5, 5, 5}, 
                           new int[]{5}, "all identical");
        
        System.out.println();
    }

    private static void runListOperationsTests() {
        System.out.println("4. LIST OPERATIONS TESTS:");
        
        // Test 1: Normál eset
        String[] input1 = {"apple", "banana", "remove", "cherry"};
        List<String> result1 = listOperations(input1, "remove");
        testListOperations(result1, Arrays.asList("apple", "banana", "cherry", "added"), 
                          "normal case");
        
        // Test 2: Nincs eltávolítandó elem
        String[] input2 = {"apple", "banana"};
        List<String> result2 = listOperations(input2, "notfound");
        testListOperations(result2, Arrays.asList("apple", "banana", "added"), 
                          "no element to remove");
        
        System.out.println();
    }

    private static void runMapOperationsTests() {
        System.out.println("5. MAP OPERATIONS TESTS:");
        
        // Test 1: Különböző hosszúságú szavak
        String[] words1 = {"cat", "dog", "elephant", "hi"};
        Map<Integer, String> result1 = createLengthMap(words1);
        testMapOperations(result1, Map.of(3, "dog", 8, "elephant", 2, "hi"), 
                         "different length words");
        
        // Test 2: Ugyanolyan hosszú szavak (utolsót kell tárolni)
        String[] words2 = {"cat", "dog", "rat"};
        Map<Integer, String> result2 = createLengthMap(words2);
        testMapOperations(result2, Map.of(3, "rat"), 
                         "same length words");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testArrayOperations(int[] input, int expectedSum, double expectedAvg, 
                                          int expectedMin, int expectedMax, String description) {
        int sum = arraySum(input);
        double avg = arrayAverage(input);
        int min = arrayMin(input);
        int max = arrayMax(input);
        
        boolean allCorrect = (sum == expectedSum && 
                            Math.abs(avg - expectedAvg) < 0.001 && 
                            min == expectedMin && 
                            max == expectedMax);
        
        String status = allCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> sum:%d avg:%.1f min:%d max:%d\n", 
                         status, description, arrayToString(input), sum, avg, min, max);
    }

    private static void testSecondLargest(int[] input, int expected, String description) {
        try {
            int result = secondLargest(input);
            String status = expected == result ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: %s -> %d (expected: %d)\n", 
                             status, description, arrayToString(input), result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %s -> Exception: %s\n", 
                             description, arrayToString(input), e.getMessage());
        }
    }

    private static void testRemoveDuplicates(int[] input, int[] expected, String description) {
        int[] result = removeDuplicates(input);
        Arrays.sort(result);
        Arrays.sort(expected);
        
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (expected: %s)\n", 
                         status, description, arrayToString(input), 
                         arrayToString(result), arrayToString(expected));
    }

    private static void testListOperations(List<String> result, List<String> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (expected: %s)\n", 
                         status, description, result, expected);
    }

    private static void testMapOperations(Map<Integer, String> result, Map<Integer, String> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (expected: %s)\n", 
                         status, description, result, expected);
    }

    private static String arrayToString(int[] arr) {
        if (arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}