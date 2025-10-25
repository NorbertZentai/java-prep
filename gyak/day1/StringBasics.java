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
 * Day 1 - String Basics
 * 
 * This file contains basic string manipulation exercises.
 * Complete all tasks, then verify your solutions using the tests at the end.
 */

public class StringBasics {

    /**
     * 1) TASK: String Reversal
     * 
     * Goal: Reverse the input string
     * Requirements: 
     * - Handle empty strings
     * - Handle single character strings
     * 
     * Example: "hello" -> "olleh"
     */
    public static String reverseString(String input) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * 2) TASK: Count Vowels
     * 
     * Goal: Count the vowels in a word
     * Requirements:
     * - Case insensitive
     * - Only a, e, i, o, u count as vowels
     * 
     * Example: "hello" -> 2 (e, o)
     */
    public static int countVowels(String word) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * 3) TASK: Palindrome Check
     * 
     * Goal: Check if a string is a palindrome
     * Requirements:
     * - Case insensitive
     * - No need to handle spaces (simplified version)
     * 
     * Example: "racecar" -> true, "hello" -> false
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implement your solution here
        return false;
    }

    // ===============================
    // TESTS - Do not modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== STRING BASICS TESTS ===\n");
        
        runReverseStringTests();
        runCountVowelsTests();
        runIsPalindromeTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runReverseStringTests() {
        System.out.println("1. REVERSE STRING TESTS:");
        
        // Test 1: Normál string
        testReverse("hello", "olleh", "normal string");
        
        // Test 2: Empty string
        testReverse("", "", "empty string");
        
        // Test 3: Egy karakter
        testReverse("a", "a", "single character");
        
        // Test 4: Palindróma
        testReverse("racecar", "racecar", "palindrome");
        
        System.out.println();
    }

    private static void runCountVowelsTests() {
        System.out.println("2. COUNT VOWELS TESTS:");
        
        // Test 1: Normál szó
        testCountVowels("hello", 2, "normal word");
        
        // Test 2: Only consonants
        testCountVowels("bcdfg", 0, "only consonants");
        
        // Test 3: Only vowels
        testCountVowels("aeiou", 5, "only vowels");
        
        // Test 4: Mixed upper/lowercase
        testCountVowels("Hello World", 3, "mixed case letters");
        
        System.out.println();
    }

    private static void runIsPalindromeTests() {
        System.out.println("3. PALINDROME TESTS:");
        
        // Test 1: Igaz palindróma
        testPalindrome("racecar", true, "true palindrome");
        
        // Test 2: Hamis eset
        testPalindrome("hello", false, "false case");
        
        // Test 3: Egy karakter
        testPalindrome("a", true, "single character");
        
        // Test 4: Empty string
        testPalindrome("", true, "empty string");
        
        // Test 5: Mixed letters
        testPalindrome("RaceCar", true, "mixed case letters");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testReverse(String input, String expected, String description) {
        String result = reverseString(input);
        String status = expected.equals(result) ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> '%s' (expected: '%s')\n", 
                         status, description, input, result, expected);
    }

    private static void testCountVowels(String input, int expected, String description) {
        int result = countVowels(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %d (expected: %d)\n", 
                         status, description, input, result, expected);
    }

    private static void testPalindrome(String input, boolean expected, String description) {
        boolean result = isPalindrome(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (expected: %s)\n", 
                         status, description, input, result, expected);
    }
}