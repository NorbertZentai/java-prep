import java.util.Arrays;

/**
 * Day 2 - Search and Sort
 * 
 * This file contains exercises for search and sort algorithms.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class SearchAndSort {

    /**
     * 1) TASK: Linear Search
     * 
     * Goal: Find an element's index in the array using linear search
          * Requirements:
     * - Return index if found, -1 if not found
     * - Handle empty arrays
     * - Compare using equals() method
     * 
     * Example: linearSearch([1, 3, 5, 7, 9], 5) -> 2
     */
    public static int linearSearch(int[] arr, int target) {
        // TODO: Implement your solution here
        return -1;
    }

    /**
     * 2) TASK: Binary Search
     * 
     * Goal: Find an element's index in a SORTED array using binary search
     * Követelmények:
     * - The array is already sorted
     * - Use left/right pointer technique
     * - Ha megtalálod, add vissza az indexet
     * - Ha nem találod, térj vissza -1-el
     * 
     * Example: binarySearch([1, 3, 5, 7, 9], 5) -> 2
     */
    public static int binarySearch(int[] arr, int target) {
        // TODO: Implement your solution here
        return -1;
    }

    /**
     * 3) TASK: Bubble Sort Ascending
     * 
     * Goal: Sort the array in ascending order using bubble sort algorithm
     * Követelmények:
     * - Ne módosítsd az eredeti tömböt
     * - Készíts másolatot és azt rendezd
     * - Use nested loops
     * - Swap adjacent elements if necessary
     * 
     * Example: bubbleSortAsc([64, 34, 25, 12, 22, 11, 90]) -> [11, 12, 22, 25, 34, 64, 90]
     */
    public static int[] bubbleSortAsc(int[] arr) {
        // TODO: Implement your solution here
        return arr.clone();
    }

    /**
     * 4) TASK: Selection Sort Descending
     * 
     * Goal: Sort the array in descending order using selection sort algorithm
     * Követelmények:
     * - Ne módosítsd az eredeti tömböt
     * - Készíts másolatot és azt rendezd
     * - Find the largest element in each iteration
     * - Put it in the correct position
     * 
     * Example: selectionSortDesc([64, 34, 25, 12, 22, 11, 90]) -> [90, 64, 34, 25, 22, 12, 11]
     */
    public static int[] selectionSortDesc(int[] arr) {
        // TODO: Implement your solution here
        return arr.clone();
    }

    // ===============================
    // TESTS - Don't modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== SEARCH AND SORT TESTS ===\n");
        
        runLinearSearchTests();
        runBinarySearchTests();
        runBubbleSortTests();
        runSelectionSortTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runLinearSearchTests() {
        System.out.println("1. LINEAR SEARCH TESTS:");
        
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        
        // Test 1: Elem megtalálható
        testSearch("linearSearch", arr, 5, 2, "element found");
        
        // Test 2: Elem nincs benne
        testSearch("linearSearch", arr, 10, -1, "element not found");
        
        // Test 3: Első elem
        testSearch("linearSearch", arr, 1, 0, "first element");
        
        // Test 4: Utolsó elem
        testSearch("linearSearch", arr, 8, 8, "last element");
        
        System.out.println();
    }

    private static void runBinarySearchTests() {
        System.out.println("2. BINARY SEARCH TESTS:");
        
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        
        // Test 1: Elem megtalálható középen
        testSearch("binarySearch", sortedArr, 9, 4, "element in middle");
        
        // Test 2: Elem nincs benne
        testSearch("binarySearch", sortedArr, 10, -1, "element not found");
        
        // Test 3: Első elem
        testSearch("binarySearch", sortedArr, 1, 0, "first element");
        
        // Test 4: Utolsó elem
        testSearch("binarySearch", sortedArr, 17, 8, "last element");
        
        System.out.println();
    }

    private static void runBubbleSortTests() {
        System.out.println("3. BUBBLE SORT ASCENDING TESTS:");
        
        // Test 1: Random tömb
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        testSort("bubbleSortAsc", test1, expected1, "random array");
        
        // Test 2: Már rendezett
        int[] test2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        testSort("bubbleSortAsc", test2, expected2, "already sorted");
        
        // Test 3: Fordított sorrend
        int[] test3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        testSort("bubbleSortAsc", test3, expected3, "reverse order");
        
        System.out.println();
    }

    private static void runSelectionSortTests() {
        System.out.println("4. SELECTION SORT DESCENDING TESTS:");
        
        // Test 1: Random tömb
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {90, 64, 34, 25, 22, 12, 11};
        testSort("selectionSortDesc", test1, expected1, "random array");
        
        // Test 2: Már csökkenő rendezett
        int[] test2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 4, 3, 2, 1};
        testSort("selectionSortDesc", test2, expected2, "already sorted");
        
        // Test 3: Növekvő sorrend
        int[] test3 = {1, 2, 3, 4, 5};
        int[] expected3 = {5, 4, 3, 2, 1};
        testSort("selectionSortDesc", test3, expected3, "ascending order");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testSearch(String methodName, int[] arr, int target, int expected, String description) {
        int result;
        if (methodName.equals("linearSearch")) {
            result = linearSearch(arr, target);
        } else {
            result = binarySearch(arr, target);
        }
        
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: search %d -> index %d (expected: %d)\n", 
                         status, description, target, result, expected);
    }

    private static void testSort(String methodName, int[] input, int[] expected, String description) {
        int[] result;
        if (methodName.equals("bubbleSortAsc")) {
            result = bubbleSortAsc(input);
        } else {
            result = selectionSortDesc(input);
        }
        
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (expected: %s)\n", 
                         status, description, arrayToString(input), 
                         arrayToString(result), arrayToString(expected));
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