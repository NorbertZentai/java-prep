import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Day 4 - Advanced Algorithms and Java 8+ Features
 * 
 * This file contains advanced algorithms and modern Java features.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class AdvancedAlgorithms {

    /**
     * 1) TASK: Merge Sort Implementation
     * 
     * Goal: Implement merge sort algorithm recursively
     * Requirements:
     * - Divide the array into two parts
     * - Sort both parts recursively
     * - Merge the sorted parts together
     * - Don't modify the original array
     * 
     * Example: mergeSort([64, 34, 25, 12, 22, 11, 90]) -> [11, 12, 22, 25, 34, 64, 90]
     */
    public static int[] mergeSort(int[] arr) {
        // TODO: Implement the merge sort algorithm here
        return arr.clone();
    }

    /**
     * Helper method: merging two sorted arrays
     */
    private static int[] merge(int[] left, int[] right) {
        // TODO: Implement the merge logic here
        int[] result = new int[left.length + right.length];
        return result;
    }

    /**
     * 2) TASK: Binary Search Recursively
     * 
     * Goal: Implement binary search recursively
     * Requirements:
     * - Use recursion
     * - The array is sorted
     * - Return the index or -1
     * 
     * Example: binarySearchRecursive([1, 3, 5, 7, 9], 5, 0, 4) -> 2
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // TODO: Implement recursive binary search here
        return -1;
    }

    /**
     * 3) TASK: Lambda expressions practice
     * 
     * Goal: Filter even numbers from a list using lambda expressions
     * Requirements:
     * - Use Stream API
     * - Filter with lambda expressions
     * - Return a new list
     * 
     * Example: filterEvenNumbers([1, 2, 3, 4, 5, 6]) -> [2, 4, 6]
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        // TODO: Implement filtering with lambda expressions here
        return new ArrayList<>();
    }

    /**
     * 4) TASK: Stream Operations Chaining
     * 
     * Goal: Perform the following operations with streams:
     * - Filter words longer than 3 characters
     * - Convert to uppercase
     * - Sort alphabetically
     * - Collect to list
     * 
     * Example: processWords(["cat", "elephant", "dog", "bird"]) -> ["BIRD", "ELEPHANT"]
     */
    public static List<String> processWords(List<String> words) {
        // TODO: Implement stream operations chaining here
        return new ArrayList<>();
    }

    /**
     * 5) TASK: Grouping with Stream API
     * 
     * Goal: Group numbers by even/odd
     * Requirements:
     * - Use Collectors.groupingBy
     * - Key should be "even" or "odd" 
     * - Value should be list of numbers
     * 
     * Example: groupByParity([1, 2, 3, 4, 5, 6]) -> {"even": [2, 4, 6], "odd": [1, 3, 5]}
     */
    public static Map<String, List<Integer>> groupByParity(List<Integer> numbers) {
        // TODO: Implement grouping here
        return new HashMap<>();
    }

    // ===============================
    // TESTS - Don't modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== ADVANCED ALGORITHMS TESTS ===\n");
        
        runMergeSortTests();
        runBinarySearchRecursiveTests();
        runLambdaTests();
        runStreamProcessingTests();
        runGroupingTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runMergeSortTests() {
        System.out.println("1. MERGE SORT TESTS:");
        
        // Test 1: Random array
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        testSort(test1, expected1, "random array");
        
        // Test 2: Already sorted
        int[] test2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        testSort(test2, expected2, "already sorted");
        
        // Test 3: Reversed
        int[] test3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        testSort(test3, expected3, "reversed order");
        
        // Test 4: One element
        int[] test4 = {42};
        int[] expected4 = {42};
        testSort(test4, expected4, "one element");
        
        System.out.println();
    }

    private static void runBinarySearchRecursiveTests() {
        System.out.println("2. RECURSIVE BINARY SEARCH TESTS:");
        
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        
        // Test 1: Element found
        testBinarySearch(arr, 9, 4, "element found");
        
        // Test 2: Element not found
        testBinarySearch(arr, 10, -1, "element not found");
        
        // Test 3: First element
        testBinarySearch(arr, 1, 0, "first element");
        
        // Test 4: Last element
        testBinarySearch(arr, 17, 8, "last element");
        
        System.out.println();
    }

    private static void runLambdaTests() {
        System.out.println("3. LAMBDA EXPRESSIONS TESTS:");
        
        // Test 1: Mixed numbers
        List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expected1 = Arrays.asList(2, 4, 6, 8);
        testFilterEven(test1, expected1, "mixed numbers");
        
        // Test 2: Only odd
        List<Integer> test2 = Arrays.asList(1, 3, 5, 7);
        List<Integer> expected2 = Arrays.asList();
        testFilterEven(test2, expected2, "only odd");
        
        // Test 3: Only even
        List<Integer> test3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected3 = Arrays.asList(2, 4, 6, 8);
        testFilterEven(test3, expected3, "only even");
        
        System.out.println();
    }

    private static void runStreamProcessingTests() {
        System.out.println("4. STREAM OPERATIONS TESTS:");
        
        // Test 1: Mixed length words
        List<String> test1 = Arrays.asList("cat", "elephant", "dog", "bird", "a", "programming");
        List<String> expected1 = Arrays.asList("BIRD", "ELEPHANT", "PROGRAMMING");
        testProcessWords(test1, expected1, "mixed length words");
        
        // Test 2: All short words
        List<String> test2 = Arrays.asList("cat", "dog", "rat");
        List<String> expected2 = Arrays.asList();
        testProcessWords(test2, expected2, "all short words");
        
        System.out.println();
    }

    private static void runGroupingTests() {
        System.out.println("5. GROUPING TESTS:");
        
        // Test 1: Mixed numbers
        List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> result1 = groupByParity(test1);
        testGroupByParity(result1, Arrays.asList(2, 4, 6), Arrays.asList(1, 3, 5), "mixed numbers");
        
        // Test 2: Csak páros számok
        List<Integer> test2 = Arrays.asList(2, 4, 6, 8);
        Map<String, List<Integer>> result2 = groupByParity(test2);
        testGroupByParity(result2, Arrays.asList(2, 4, 6, 8), Arrays.asList(), "only even numbers");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testSort(int[] input, int[] expected, String description) {
        int[] result = mergeSort(input.clone());
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (expected: %s)\n", 
                         status, description, Arrays.toString(input), 
                         Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testBinarySearch(int[] arr, int target, int expected, String description) {
        int result = binarySearchRecursive(arr, target, 0, arr.length - 1);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: search %d -> index %d (expected: %d)\n", 
                         status, description, target, result, expected);
    }

    private static void testFilterEven(List<Integer> input, List<Integer> expected, String description) {
        List<Integer> result = filterEvenNumbers(input);
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (expected: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testProcessWords(List<String> input, List<String> expected, String description) {
        List<String> result = processWords(input);
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (expected: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testGroupByParity(Map<String, List<Integer>> result, 
                                        List<Integer> expectedEven, List<Integer> expectedOdd, 
                                        String description) {
        List<Integer> actualEven = result.getOrDefault("even", Arrays.asList());
        List<Integer> actualOdd = result.getOrDefault("odd", Arrays.asList());
        
        boolean evenCorrect = new HashSet<>(actualEven).equals(new HashSet<>(expectedEven));
        boolean oddCorrect = new HashSet<>(actualOdd).equals(new HashSet<>(expectedOdd));
        boolean isCorrect = evenCorrect && oddCorrect;
        
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: even:%s odd:%s (expected even:%s odd:%s)\n", 
                         status, description, actualEven, actualOdd, expectedEven, expectedOdd);
    }
}