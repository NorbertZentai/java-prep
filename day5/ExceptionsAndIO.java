import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Day 5 - Exception handling és File I/O
 * 
 * Ez a fájl kivételkezelés és fájlműveletek feladatait tartalmazza.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class ExceptionsAndIO {

    /**
     * 1) FELADAT: Egyedi kivétel osztály létrehozása
     * 
     * Cél: Hozz létre egy egyedi kivételt amely InvalidAgeException néven fut
     * Követelmények:
     * - Örököljön Exception osztályból
     * - Legyen konstruktora üzenettel
     * - Használható legyen az életkor validáláshoz
     */
    public static class InvalidAgeException extends Exception {
        // TODO: Implementáld itt az egyedi kivételt
        public InvalidAgeException(String message) {
            // TODO: Konstruktor implementálása
        }
    }

    /**
     * 2) FELADAT: Életkor validáció kivételkezeléssel
     * 
     * Cél: Validáld az életkort és dobj kivételt ha helytelen
     * Követelmények:
     * - Ha életkor < 0 vagy > 150, dobj InvalidAgeException-t
     * - Egyébként térj vissza true-val
     * - Használd a fenti egyedi kivételt
     * 
     * Példa: validateAge(25) -> true, validateAge(-5) -> InvalidAgeException
     */
    public static boolean validateAge(int age) throws InvalidAgeException {
        // TODO: Implementáld itt az életkor validálást
        return true;
    }

    /**
     * 3) FELADAT: Biztonságos string-int konverzió
     * 
     * Cél: Alakíts string-et int-re, de kezeld a kivételeket
     * Követelmények:
     * - Próbáld meg az Integer.parseInt-et
     * - Ha NumberFormatException jön, térj vissza a defaultValue-val
     * - Ne crasheljen a program
     * 
     * Példa: safeParseInt("123", 0) -> 123, safeParseInt("abc", 0) -> 0
     */
    public static int safeParseInt(String str, int defaultValue) {
        // TODO: Implementáld itt a biztonságos parsing-ot
        return defaultValue;
    }

    /**
     * 4) FELADAT: Fájl tartalmának beolvasása
     * 
     * Cél: Olvasd be egy fájl tartalmát string listába
     * Követelmények:
     * - Használj try-with-resources-t
     * - Minden sor legyen külön lista elem
     * - Ha a fájl nem létezik, térj vissza üres listával
     * - Kezeld az IOException-t
     * 
     * Példa: readFileLines("test.txt") -> ["line1", "line2", "line3"]
     */
    public static List<String> readFileLines(String fileName) {
        // TODO: Implementáld itt a fájl beolvasást
        return new ArrayList<>();
    }

    /**
     * 5) FELADAT: Stringek fájlba írása
     * 
     * Cél: Írj string listát fájlba, minden elemet új sorba
     * Követelmények:
     * - Használj try-with-resources-t
     * - Minden lista elem legyen külön sorban
     * - Kezeld az IOException-t
     * - Ha sikeres, térj vissza true-val
     * 
     * Példa: writeFileLines("output.txt", ["line1", "line2"]) -> true
     */
    public static boolean writeFileLines(String fileName, List<String> lines) {
        // TODO: Implementáld itt a fájlba írást
        return false;
    }

    /**
     * 6) FELADAT: CSV adat parsing
     * 
     * Cél: Dolgozz fel egy CSV sort és add vissza a mezőket
     * Követelmények:
     * - Split-eld a sort vessző mentén
     * - Távolítsd el a whitespace-eket
     * - Ha üres sor, térj vissza üres listával
     * - Kezeld a null bemenetet
     * 
     * Példa: parseCSVLine("John, 25, Engineer") -> ["John", "25", "Engineer"]
     */
    public static List<String> parseCSVLine(String csvLine) {
        // TODO: Implementáld itt a CSV parsing-ot
        return new ArrayList<>();
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== EXCEPTIONS ÉS IO TESZTEK ===\n");
        
        runAgeValidationTests();
        runSafeParseIntTests();
        runFileOperationTests();
        runCSVParsingTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runAgeValidationTests() {
        System.out.println("1. ÉLETKOR VALIDÁLÁS TESZTEK:");
        
        // Test 1: Érvényes életkor
        testAgeValidation(25, true, false, "érvényes életkor");
        
        // Test 2: Negatív életkor
        testAgeValidation(-5, false, true, "negatív életkor");
        
        // Test 3: Túl nagy életkor
        testAgeValidation(200, false, true, "túl nagy életkor");
        
        // Test 4: Határ értékek
        testAgeValidation(0, true, false, "nulladik év");
        testAgeValidation(150, true, false, "150. év");
        
        System.out.println();
    }

    private static void runSafeParseIntTests() {
        System.out.println("2. BIZTONSÁGOS PARSING TESZTEK:");
        
        // Test 1: Érvényes számok
        testSafeParse("123", 0, 123, "érvényes szám");
        testSafeParse("-456", 0, -456, "negatív szám");
        
        // Test 2: Érvénytelen input
        testSafeParse("abc", 999, 999, "betűk");
        testSafeParse("", 42, 42, "üres string");
        testSafeParse(null, 100, 100, "null input");
        
        System.out.println();
    }

    private static void runFileOperationTests() {
        System.out.println("3. FÁJL MŰVELETEK TESZTEK:");
        
        // Test 1: Fájl írás és olvasás teszt
        List<String> testLines = Arrays.asList("Line 1", "Line 2", "Line 3");
        String testFileName = "test_output.txt";
        
        // Írás teszt
        boolean writeSuccess = writeFileLines(testFileName, testLines);
        System.out.printf("   %s - fájl írás: %s\n", 
                         writeSuccess ? "✅ PASS" : "❌ FAIL", writeSuccess);
        
        // Olvasás teszt (csak ha az írás sikeres volt)
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
        testCSVParsing(result1, expected1, "normál CSV sor");
        
        // Test 2: Szóközök nélkül
        List<String> result2 = parseCSVLine("Jane,30,Doctor");
        List<String> expected2 = Arrays.asList("Jane", "30", "Doctor");
        testCSVParsing(result2, expected2, "szóközök nélkül");
        
        // Test 3: Üres sor
        List<String> result3 = parseCSVLine("");
        List<String> expected3 = Arrays.asList();
        testCSVParsing(result3, expected3, "üres sor");
        
        // Test 4: Null input
        List<String> result4 = parseCSVLine(null);
        List<String> expected4 = Arrays.asList();
        testCSVParsing(result4, expected4, "null input");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testAgeValidation(int age, boolean shouldSucceed, boolean shouldThrow, String description) {
        try {
            boolean result = validateAge(age);
            if (shouldSucceed && result) {
                System.out.printf("   ✅ PASS - %s: %d -> érvényes\n", description, age);
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