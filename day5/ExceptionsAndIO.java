import java.io.*;
import java.nio.file.*;
import java.util.*;

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
 * Day 5 - Exceptions and File I/O
 * 
 * This file contains exception handling and file operations exercises.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class ExceptionsAndIO {

    /**
     * 1) TASK: Create Custom Exception Class
     * 
     * Goal: Create a custom exception called InvalidAgeException
     * Követelmények:
     * - Should inherit from Exception class
     * - Should have constructor with message
     * - Should be usable for age validation
     */
    public static class InvalidAgeException extends Exception {
        // TODO: Implement the custom exception here
        public InvalidAgeException(String message) {
            // TODO: Implement constructor
        }
    }

    /**
     * 2) TASK: Age Validation with Exception Handling
     * 
     * Goal: Validate age and throw exception if invalid
     * Követelmények:
     * - If age < 0 or > 150, throw InvalidAgeException
     * - Otherwise return true
     * - Use the custom exception above
     * 
     * Example: validateAge(25) -> true, validateAge(-5) -> InvalidAgeException
     */
    public static boolean validateAge(int age) throws InvalidAgeException {
        // TODO: Implement age validation here
        return true;
    }

    /**
     * 3) TASK: Safe String-to-Int Conversion
     * 
     * Goal: Convert string to int, but handle exceptions
     * Követelmények:
     * - Try Integer.parseInt
     * - If NumberFormatException occurs, return defaultValue
     * - Don't crash the program
     * 
     * Example: safeParseInt("123", 0) -> 123, safeParseInt("abc", 0) -> 0
     */
    public static int safeParseInt(String str, int defaultValue) {
        // TODO: Implement safe parsing here
        return defaultValue;
    }

    /**
     * 4) TASK: Read File Contents
     * 
     * Goal: Read file contents into string list
     * Követelmények:
     * - Használj try-with-resources-t
     * - Each line should be a separate list item
     * - If file doesn't exist, return empty list
     * - Kezeld az IOException-t
     * 
     * Example: readFileLines("test.txt") -> ["line1", "line2", "line3"]
     */
    public static List<String> readFileLines(String fileName) {
        // TODO: Implement file reading here
        return new ArrayList<>();
    }

    /**
     * 5) TASK: Write Strings to File
     * 
     * Goal: Write string list to file, each element on new line
     * Követelmények:
     * - Használj try-with-resources-t
     * - Each list item should be on separate line
     * - Kezeld az IOException-t
     * - If successful, return true
     * 
     * Example: writeFileLines("output.txt", ["line1", "line2"]) -> true
     */
    public static boolean writeFileLines(String fileName, List<String> lines) {
        // TODO: Implement file writing here
        return false;
    }

    /**
     * 6) TASK: CSV Data Parsing
     * 
     * Goal: Process a CSV line and return the fields
     * Követelmények:
     * - Split the line by comma
     * - Remove whitespaces
     * - If empty line, return empty list
     * - Handle null input
     * 
     * Example: parseCSVLine("John, 25, Engineer") -> ["John", "25", "Engineer"]
     */
    public static List<String> parseCSVLine(String csvLine) {
        // TODO: Implement CSV parsing here
        return new ArrayList<>();
    }

    // ===============================
    // TESTS - Don't modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== EXCEPTIONS AND IO TESTS ===\n");
        
        runAgeValidationTests();
        runSafeParseIntTests();
        runFileOperationTests();
        runCSVParsingTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runAgeValidationTests() {
        System.out.println("1. AGE VALIDATION TESTS:");
        
        // Test 1: Érvényes életkor
        testAgeValidation(25, true, false, "valid age");
        
        // Test 2: Negatív életkor
        testAgeValidation(-5, false, true, "negative age");
        
        // Test 3: Túl nagy életkor
        testAgeValidation(200, false, true, "age too high");
        
        // Test 4: Határ értékek
        testAgeValidation(0, true, false, "zero age");
        testAgeValidation(150, true, false, "150 years");
        
        System.out.println();
    }

    private static void runSafeParseIntTests() {
        System.out.println("2. SAFE PARSING TESTS:");
        
        // Test 1: Érvényes számok
        testSafeParse("123", 0, 123, "valid number");
        testSafeParse("-456", 0, -456, "negative number");
        
        // Test 2: Érvénytelen input
        testSafeParse("abc", 999, 999, "letters");
        testSafeParse("", 42, 42, "empty string");
        testSafeParse(null, 100, 100, "null input");
        
        System.out.println();
    }

    private static void runFileOperationTests() {
        System.out.println("3. FILE OPERATIONS TESTS:");
        
        // Test 1: Fájl írás és olvasás teszt
        List<String> testLines = Arrays.asList("Line 1", "Line 2", "Line 3");
        String testFileName = "test_output.txt";
        
        // Write test
        boolean writeSuccess = writeFileLines(testFileName, testLines);
        System.out.printf("   %s - file write: %s\n", 
                         writeSuccess ? "✅ PASS" : "❌ FAIL", writeSuccess);
        
        // Read test (only if write was successful)
        if (writeSuccess) {
            List<String> readLines = readFileLines(testFileName);
            boolean readSuccess = readLines.equals(testLines);
            System.out.printf("   %s - fájl olvasás: várt %s, kapott %s\n", 
                             readSuccess ? "✅ PASS" : "❌ FAIL", testLines, readLines);
            
            // Tisztítás
            try {
                Files.deleteIfExists(Paths.get(testFileName));
            } catch (IOException e) {
                // Nem probléma ha nem sikerül törölni
            }
        }
        
        // Test 2: Nem létező fájl olvasása
        List<String> nonExistentResult = readFileLines("non_existent_file_xyz.txt");
        boolean emptyOnNonExistent = nonExistentResult.isEmpty();
        System.out.printf("   %s - nem létező fájl: üres lista %s\n", 
                         emptyOnNonExistent ? "✅ PASS" : "❌ FAIL", nonExistentResult);
        
        System.out.println();
    }

    private static void runCSVParsingTests() {
        System.out.println("4. CSV PARSING TESZTEK:");
        
        // Test 1: Normál CSV sor
        List<String> result1 = parseCSVLine("John, 25, Engineer");
        List<String> expected1 = Arrays.asList("John", "25", "Engineer");
        testCSVParsing(result1, expected1, "normal CSV line");
        
        // Test 2: Without spaces
        List<String> result2 = parseCSVLine("Jane,30,Doctor");
        List<String> expected2 = Arrays.asList("Jane", "30", "Doctor");
        testCSVParsing(result2, expected2, "without spaces");
        
        // Test 3: Üres sor
        List<String> result3 = parseCSVLine("");
        List<String> expected3 = Arrays.asList();
        testCSVParsing(result3, expected3, "empty line");
        
        // Test 4: Null input
        List<String> result4 = parseCSVLine(null);
        List<String> expected4 = Arrays.asList();
        testCSVParsing(result4, expected4, "null input");
        
        System.out.println();
    }

    // Helper methods for testing
    private static void testAgeValidation(int age, boolean shouldSucceed, boolean shouldThrow, String description) {
        try {
            boolean result = validateAge(age);
            if (shouldSucceed && result) {
                System.out.printf("   ✅ PASS - %s: %d -> valid\n", description, age);
            } else if (shouldSucceed && !result) {
                System.out.printf("   ❌ FAIL - %s: %d -> váratlan false\n", description, age);
            } else if (!shouldSucceed && result) {
                System.out.printf("   ❌ FAIL - %s: %d -> kivételt kellett volna dobni\n", description, age);
            }
        } catch (InvalidAgeException e) {
            if (shouldThrow) {
                System.out.printf("   ✅ PASS - %s: %d -> kivétel dobva: %s\n", description, age, e.getMessage());
            } else {
                System.out.printf("   ❌ FAIL - %s: %d -> váratlan kivétel: %s\n", description, age, e.getMessage());
            }
        }
    }

    private static void testSafeParse(String input, int defaultValue, int expected, String description) {
        int result = safeParseInt(input, defaultValue);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' (default: %d) -> %d (várt: %d)\n", 
                         status, description, input, defaultValue, result, expected);
    }

    private static void testCSVParsing(List<String> result, List<String> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, result, expected);
    }
}