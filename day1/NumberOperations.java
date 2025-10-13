/**
 * Day 1 - Number Operations
 * 
 * This file contains basic number operation exercises.
 * Complete all tasks, then verify your solutions using the tests at the end.
 */

public class NumberOperations {

    /**
     * 1) TASK: Find Maximum Number in Array
     * 
     * Goal: Return the largest number from an int array
     * Requirements:
     * - Solve using iteration
     * - Handle negative numbers
     * - You can assume the array is not empty
     * 
     * Example: [3, 7, 2, 9, 1] -> 9
     */
    public static int findMax(int[] numbers) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * 2) TASK: Swap Numbers with Temporary Variable
     * 
     * Goal: Swap two number values using a temporary variable
     * Requirements:
     * - Use a temporary variable
     * - Return an array: [swappedA, swappedB]
     * 
     * Example: swapWithTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithTemp(int a, int b) {
        // TODO: Implement your solution here
        return new int[]{a, b};
    }

    /**
     * 3) TASK: Swap Numbers without Temporary Variable
     * 
     * Goal: Swap two number values without using a temporary variable
     * Requirements:
     * - Use arithmetic operations (+ and -)
     * - Return an array: [swappedA, swappedB]
     * 
     * Example: swapWithoutTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithoutTemp(int a, int b) {
        // TODO: Implement your solution here
        return new int[]{a, b};
    }

    // ===============================
    // TESTS - Do not modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== NUMBER OPERATIONS TESTS ===\n");
        
        runFindMaxTests();
        runSwapWithTempTests();
        runSwapWithoutTempTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runFindMaxTests() {
        System.out.println("1. FIND MAX TESTS:");
        
        // Test 1: Positive numbers
        testFindMax(new int[]{3, 7, 2, 9, 1}, 9, "positive numbers");
        
        // Test 2: Negative numbers
        testFindMax(new int[]{-5, -2, -8, -1}, -1, "negative numbers");
        
        // Test 3: Mixed numbers
        testFindMax(new int[]{-3, 5, -1, 8, 2}, 8, "mixed numbers");
        
        // Test 4: One element
        testFindMax(new int[]{42}, 42, "single element");
        
        // Test 5: Identical elements
        testFindMax(new int[]{7, 7, 7, 7}, 7, "identical elements");
        
        System.out.println();
    }

    private static void runSwapWithTempTests() {
        System.out.println("2. SWAP WITH TEMP TESTS:");
        
        // Test 1: Positive numbers
        testSwap(NumberOperations::swapWithTemp, 5, 10, "positive numbers");
        
        // Test 2: Negative numbers
        testSwap(NumberOperations::swapWithTemp, -3, -7, "negative numbers");
        
        // Test 3: Mixed numbers
        testSwap(NumberOperations::swapWithTemp, -5, 8, "mixed numbers");
        
        // Test 4: Zero values
        testSwap(NumberOperations::swapWithTemp, 0, 15, "zero values");
        
        System.out.println();
    }

    private static void runSwapWithoutTempTests() {
        System.out.println("3. SWAP WITHOUT TEMP TESTS:");
        
        // Test 1: Positive numbers
        testSwap(NumberOperations::swapWithoutTemp, 5, 10, "positive numbers");
        
        // Test 2: Negative numbers
        testSwap(NumberOperations::swapWithoutTemp, -3, -7, "negative numbers");
        
        // Test 3: Mixed numbers
        testSwap(NumberOperations::swapWithoutTemp, -5, 8, "mixed numbers");
        
        // Test 4: Zero values
        testSwap(NumberOperations::swapWithoutTemp, 0, 15, "zero values");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testFindMax(int[] input, int expected, String description) {
        int result = findMax(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %d (expected: %d)\n", 
                         status, description, arrayToString(input), result, expected);
    }

    private static void testSwap(SwapFunction swapFunc, int a, int b, String description) {
        int[] result = swapFunc.swap(a, b);
        boolean isCorrect = result.length == 2 && result[0] == b && result[1] == a;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: (%d, %d) -> [%d, %d] (expected: [%d, %d])\n", 
                         status, description, a, b, result[0], result[1], b, a);
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

    @FunctionalInterface
    private interface SwapFunction {
        int[] swap(int a, int b);
    }
}