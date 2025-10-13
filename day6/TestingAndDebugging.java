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
 * Day 6 - Testing and Debugging
 * 
 * This file contains unit testing, debugging practices, and code quality improvements.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class TestingAndDebugging {

    /**
     * 1) TASK: Fix Buggy Code - NullPointerException
     * 
     * Goal: Fix this method that throws NPE
     * The method should return string length but must handle null case
     * 
     * Buggy version: return input.length();
     */
    public static int getStringLengthSafely(String input) {
        // TODO: Fix the null pointer exception
        return input.length(); // This is buggy - fix it!
    }

    /**
     * 2) TASK: Fix Buggy Code - ArrayIndexOutOfBoundsException
     * 
     * Goal: Fix this method that throws array index error
     * The method should return the last element from the array
     * 
     * Buggy version tries to access last element but calculates wrong
     */
    public static int getLastElement(int[] array) {
        // TODO: Fix the index out of bounds error
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty!");
        }
        return array[array.length]; // This is buggy - fix it!
    }

    /**
     * 3) TASK: Fix Logic Error - Wrong Condition
     * 
     * Goal: This method should check if a number is even
     * But it has a logic error - fix it!
     */
    public static boolean isEven(int number) {
        // TODO: Fix the logic error
        return number % 2 == 1; // This is wrong logic - fix it!
    }

    /**
     * 4) TASK: Edge Case Handling - List Operations
     * 
     * Goal: Implement a method that reverses list elements
     * But watch for edge cases: null list, empty list, single element
     */
    public static <T> List<T> reverseList(List<T> input) {
        // TODO: Implement list reversal with edge cases
        return new ArrayList<>();
    }

    /**
     * 5) TASK: Performance Optimization - String Concatenation
     * 
     * Goal: This method concatenates many strings but inefficiently
     * Optimize using StringBuilder!
     */
    public static String concatenateNumbers(int count) {
        // TODO: Optimize using StringBuilder
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += i + ","; // This is inefficient - fix it!
        }
        return result;
    }

    /**
     * 6) TASK: Code refactoring - clean code
     * 
     * Goal: This method works, but is unreadable and complicated
     * Refaktoráld tisztább, érthetőbb kóddá!
     */
    public static boolean checkPasswordStrength(String pwd) {
        // TODO: Refactor this to cleaner, more readable code
        if (pwd == null || pwd.length() < 8) return false;
        boolean a = false, b = false, c = false, d = false;
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (ch >= 'A' && ch <= 'Z') a = true;
            if (ch >= 'a' && ch <= 'z') b = true;
            if (ch >= '0' && ch <= '9') c = true;
            if ("!@#$%^&*".indexOf(ch) != -1) d = true;
        }
        return a && b && c && d;
    }

    /**
     * 7) TASK: Unit test writing
     * 
     * Goal: Write tests for the following simple method
     * Test normal cases, edge cases and invalid inputs
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nullával nem lehet osztani!");
        }
        return a / b;
    }

    /**
     * 8) TASK: Debug helper method
     * 
     * Goal: Write a method that prints debug information about an array
     * Should be informative and help with debugging
     */
    public static void debugArrayInfo(int[] array, String arrayName) {
        // TODO: Implementálj hasznos debug kiírást
        System.out.println("Debug info nincs implementálva");
    }

    // ===============================
    // TESTS - Do not modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== TESTING AND DEBUGGING TESTS ===\n");
        
        runNullPointerFixTests();
        runArrayIndexFixTests();
        runLogicalErrorFixTests();
        runEdgeCaseTests();
        runPerformanceTests();
        runRefactoringTests();
        runDivisionTests();
        runDebugTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runNullPointerFixTests() {
        System.out.println("1. NULL POINTER FIX TESZTEK:");
        
        // Test 1: Normál string
        testStringLength("hello", 5, "normál string");
        
        // Test 2: Üres string
        testStringLength("", 0, "üres string");
        
        // Test 3: Null string - ez a kritikus teszt
        testStringLength(null, 0, "null string");
        
        System.out.println();
    }

    private static void runArrayIndexFixTests() {
        System.out.println("2. ARRAY INDEX FIX TESZTEK:");
        
        // Test 1: Normál tömb
        testLastElement(new int[]{1, 2, 3, 4, 5}, 5, "normál tömb");
        
        // Test 2: Egy elemű tömb
        testLastElement(new int[]{42}, 42, "egy elemű tömb");
        
        // Test 3: Üres tömb - exception kell dobjon
        testLastElementException(new int[]{}, "üres tömb");
        
        System.out.println();
    }

    private static void runLogicalErrorFixTests() {
        System.out.println("3. LOGIKAI HIBA FIX TESZTEK:");
        
        // Test páros számok
        testIsEven(2, true, "2 páros");
        testIsEven(4, true, "4 páros");
        testIsEven(10, true, "10 páros");
        
        // Test páratlan számok
        testIsEven(1, false, "1 páratlan");
        testIsEven(3, false, "3 páratlan");
        testIsEven(7, false, "7 páratlan");
        
        // Test nulla
        testIsEven(0, true, "0 páros");
        
        System.out.println();
    }

    private static void runEdgeCaseTests() {
        System.out.println("4. EDGE CASE TESZTEK:");
        
        // Test 1: Normál lista
        List<String> normal = Arrays.asList("a", "b", "c");
        List<String> expectedNormal = Arrays.asList("c", "b", "a");
        testReverseList(normal, expectedNormal, "normál lista");
        
        // Test 2: Egy elemű lista
        List<String> single = Arrays.asList("only");
        List<String> expectedSingle = Arrays.asList("only");
        testReverseList(single, expectedSingle, "egy elemű lista");
        
        // Test 3: Üres lista
        List<String> empty = Arrays.asList();
        List<String> expectedEmpty = Arrays.asList();
        testReverseList(empty, expectedEmpty, "üres lista");
        
        // Test 4: Null lista
        testReverseList(null, Arrays.asList(), "null lista");
        
        System.out.println();
    }

    private static void runPerformanceTests() {
        System.out.println("5. TELJESÍTMÉNY OPTIMALIZÁLÁS TESZTEK:");
        
        // Test 1: Kis szám
        testConcatenateNumbers(5, "1,2,3,4,5,", "kis szám");
        
        // Test 2: Nulla
        testConcatenateNumbers(0, "", "nula");
        
        // Test 3: Egy szám
        testConcatenateNumbers(1, "1,", "egy szám");
        
        System.out.println();
    }

    private static void runRefactoringTests() {
        System.out.println("6. REFAKTORÁLÁS TESZTEK:");
        
        // Test 1: Erős jelszó
        testPasswordStrength("StrongPass123!", true, "erős jelszó");
        
        // Test 2: Túl rövid
        testPasswordStrength("Short1!", false, "túl rövid");
        
        // Test 3: Nincs nagybetű
        testPasswordStrength("lowercase123!", false, "nincs nagybetű");
        
        // Test 4: Nincs szám
        testPasswordStrength("NoNumbers!", false, "nincs szám");
        
        // Test 5: Null jelszó
        testPasswordStrength(null, false, "null jelszó");
        
        System.out.println();
    }

    private static void runDivisionTests() {
        System.out.println("7. OSZTÁS UNIT TESZTEK:");
        
        // Test 1: Normál osztás
        testDivision(10, 2, 5, "normál osztás");
        
        // Test 2: Negatív számok
        testDivision(-10, 2, -5, "negatív számok");
        
        // Test 3: Nullával osztás - exception
        testDivisionException(10, 0, "nullával osztás");
        
        System.out.println();
    }

    private static void runDebugTests() {
        System.out.println("8. DEBUG SEGÉD TESZTEK:");
        
        System.out.println("   Debug output példák:");
        debugArrayInfo(new int[]{1, 2, 3, 4, 5}, "testArray");
        debugArrayInfo(new int[]{}, "emptyArray");
        debugArrayInfo(null, "nullArray");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testStringLength(String input, int expected, String description) {
        try {
            int result = getStringLengthSafely(input);
            String status = result == expected ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: '%s' -> %d (várt: %d)\n", 
                             status, description, input, result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: '%s' -> Exception: %s\n", 
                             description, input, e.getClass().getSimpleName());
        }
    }

    private static void testLastElement(int[] input, int expected, String description) {
        try {
            int result = getLastElement(input);
            String status = result == expected ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: %s -> %d (várt: %d)\n", 
                             status, description, Arrays.toString(input), result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %s -> Exception: %s\n", 
                             description, Arrays.toString(input), e.getClass().getSimpleName());
        }
    }

    private static void testLastElementException(int[] input, String description) {
        try {
            int result = getLastElement(input);
            System.out.printf("   ❌ FAIL - %s: %s -> %d (Exception-t kellett volna dobni)\n", 
                             description, Arrays.toString(input), result);
        } catch (IllegalArgumentException e) {
            System.out.printf("   ✅ PASS - %s: %s -> IllegalArgumentException dobva\n", 
                             description, Arrays.toString(input));
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %s -> Rossz exception: %s\n", 
                             description, Arrays.toString(input), e.getClass().getSimpleName());
        }
    }

    private static void testIsEven(int input, boolean expected, String description) {
        boolean result = isEven(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %d -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testReverseList(List<String> input, List<String> expected, String description) {
        try {
            List<String> result = reverseList(input);
            boolean isCorrect = (result == null && expected.isEmpty()) || 
                               (result != null && result.equals(expected));
            String status = isCorrect ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                             status, description, input, result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %s -> Exception: %s\n", 
                             description, input, e.getClass().getSimpleName());
        }
    }

    private static void testConcatenateNumbers(int count, String expected, String description) {
        String result = concatenateNumbers(count);
        String status = result.equals(expected) ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %d -> '%s' (várt: '%s')\n", 
                         status, description, count, result, expected);
    }

    private static void testPasswordStrength(String input, boolean expected, String description) {
        boolean result = checkPasswordStrength(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testDivision(int a, int b, int expected, String description) {
        try {
            int result = divide(a, b);
            String status = result == expected ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: %d/%d -> %d (várt: %d)\n", 
                             status, description, a, b, result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %d/%d -> Exception: %s\n", 
                             description, a, b, e.getClass().getSimpleName());
        }
    }

    private static void testDivisionException(int a, int b, String description) {
        try {
            int result = divide(a, b);
            System.out.printf("   ❌ FAIL - %s: %d/%d -> %d (Exception-t kellett volna dobni)\n", 
                             description, a, b, result);
        } catch (ArithmeticException e) {
            System.out.printf("   ✅ PASS - %s: %d/%d -> ArithmeticException dobva\n", 
                             description, a, b);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %d/%d -> Rossz exception: %s\n", 
                             description, a, b, e.getClass().getSimpleName());
        }
    }
}