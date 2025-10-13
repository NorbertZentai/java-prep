/**
 * Day 1 - String és alapműveletek
 * 
 * Ez a fájl string manipulációs és alapvető műveleti feladatokat tartalmaz.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class StringBasics {

    /**
     * 1) FELADAT: String megfordítása
     * 
     * Cél: Fordítsd meg a bemeneti stringet
     * Követelmények: 
     * - Kezelje az üres stringet
     * - Kezelje az egy karakteres stringet
     * 
     * Példa: "hello" -> "olleh"
     */
    public static String reverseString(String input) {
        // TODO: Implementáld itt a megoldást
        return null;
    }

    /**
     * 2) FELADAT: Magánhangzók számolása
     * 
     * Cél: Számold meg a magánhangzókat egy szóban
     * Követelmények:
     * - Nem érzékeny a kis/nagybetűkre
     * - Csak a, e, i, o, u számít magánhangzónak
     * 
     * Példa: "hello" -> 2 (e, o)
     */
    public static int countVowels(String word) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    /**
     * 3) FELADAT: Palindróma ellenőrzés
     * 
     * Cél: Ellenőrizd, hogy egy string palindróma-e
     * Követelmények:
     * - Nem érzékeny a kis/nagybetűkre
     * - Szóközöket nem kell kezelni (egyszerűsített verzió)
     * 
     * Példa: "racecar" -> true, "hello" -> false
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implementáld itt a megoldást
        return false;
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== STRING ALAPOK TESZTEK ===\n");
        
        runReverseStringTests();
        runCountVowelsTests();
        runIsPalindromeTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runReverseStringTests() {
        System.out.println("1. REVERSE STRING TESZTEK:");
        
        // Test 1: Normál string
        testReverse("hello", "olleh", "normál string");
        
        // Test 2: Üres string
        testReverse("", "", "üres string");
        
        // Test 3: Egy karakter
        testReverse("a", "a", "egy karakter");
        
        // Test 4: Palindróma
        testReverse("racecar", "racecar", "palindróma");
        
        System.out.println();
    }

    private static void runCountVowelsTests() {
        System.out.println("2. COUNT VOWELS TESZTEK:");
        
        // Test 1: Normál szó
        testCountVowels("hello", 2, "normál szó");
        
        // Test 2: Csak mássalhangzók
        testCountVowels("bcdfg", 0, "csak mássalhangzók");
        
        // Test 3: Csak magánhangzók
        testCountVowels("aeiou", 5, "csak magánhangzók");
        
        // Test 4: Kevert nagy/kisbetűk
        testCountVowels("Hello World", 3, "kevert nagy/kisbetűk");
        
        System.out.println();
    }

    private static void runIsPalindromeTests() {
        System.out.println("3. PALINDROME TESZTEK:");
        
        // Test 1: Igaz palindróma
        testPalindrome("racecar", true, "igaz palindróma");
        
        // Test 2: Hamis eset
        testPalindrome("hello", false, "hamis eset");
        
        // Test 3: Egy karakter
        testPalindrome("a", true, "egy karakter");
        
        // Test 4: Üres string
        testPalindrome("", true, "üres string");
        
        // Test 5: Kevert betűk
        testPalindrome("RaceCar", true, "kevert nagy/kisbetűk");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testReverse(String input, String expected, String description) {
        String result = reverseString(input);
        String status = expected.equals(result) ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> '%s' (várt: '%s')\n", 
                         status, description, input, result, expected);
    }

    private static void testCountVowels(String input, int expected, String description) {
        int result = countVowels(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %d (várt: %d)\n", 
                         status, description, input, result, expected);
    }

    private static void testPalindrome(String input, boolean expected, String description) {
        boolean result = isPalindrome(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }
}