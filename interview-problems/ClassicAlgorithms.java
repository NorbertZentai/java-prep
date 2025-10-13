import java.util.*;

/**
 * Interview Problems - Klasszikus algoritmusok
 * 
 * Ez a fájl gyakori interview feladatok klasszikus algoritmusait tartalmazza.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class ClassicAlgorithms {

    /**
     * 1) FELADAT: FizzBuzz
     * 
     * Cél: Írj egy programot ami 1-től n-ig számol, de:
     * - 3-mal osztható számoknál "Fizz"-t ír
     * - 5-tel osztható számoknál "Buzz"-t ír  
     * - Mindkettővel osztható számoknál "FizzBuzz"-t ír
     * - Egyébként a számot írja
     * 
     * Példa: fizzBuzz(15) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
     */
    public static String[] fizzBuzz(int n) {
        // TODO: Implementáld itt a megoldást
        return new String[0];
    }

    /**
     * 2) FELADAT: Hiányzó szám keresése
     * 
     * Cél: Egy 0-tól n-ig tartó tömben pontosan egy szám hiányzik. Keresd meg!
     * Követelmények:
     * - A tömb hossza n (tehát n+1 számból egy hiányzik)
     * - A számok 0-tól n-ig vannak, de egy hiányzik
     * - Hatékony megoldást keress (ne brute force)
     * 
     * Példa: findMissingNumber([3, 0, 1], 3) -> 2
     */
    public static int findMissingNumber(int[] nums, int n) {
        // TODO: Implementáld itt a megoldást (összeg formula használható)
        return -1;
    }

    /**
     * 3) FELADAT: Duplikátum keresése
     * 
     * Cél: Keresd meg azt az elemet amely többször szerepel a tömbben
     * Követelmények:
     * - A tömb 1-től n-ig tartalmaz számokat
     * - Pontosan egy szám ismétlődik
     * - Hatékony megoldást keress (Set vagy ciklus-detektálás)
     * 
     * Példa: findDuplicate([1, 3, 4, 2, 2]) -> 2
     */
    public static int findDuplicate(int[] nums) {
        // TODO: Implementáld itt a megoldást
        return -1;
    }

    /**
     * 4) FELADAT: Számok cseréje ideiglenes változó nélkül
     * 
     * Cél: Cseréld fel két számot anélkül, hogy ideiglenes változót használnál
     * Követelmények:
     * - Használhatsz aritmetikai műveleteket
     * - Vagy XOR bitwise műveletet
     * - Térj vissza a megcserélt értékekkel
     * 
     * Példa: swapWithoutTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithoutTemp(int a, int b) {
        // TODO: Implementáld itt a megoldást
        return new int[]{a, b};
    }

    /**
     * 5) FELADAT: Balanced Parentheses (Kiegyensúlyozott zárójelek)
     * 
     * Cél: Ellenőrizd, hogy egy stringben a zárójelek kiegyensúlyozottak-e
     * Követelmények:
     * - Támogatott zárójelek: (), [], {}
     * - Minden nyitó zárójel után megfelelő záró zárójel kell jöjjön
     * - A sorrend is számít
     * 
     * Példa: isValidParentheses("({[]})") -> true, isValidParentheses("({[}])") -> false
     */
    public static boolean isValidParentheses(String s) {
        // TODO: Implementáld itt a megoldást (Stack használatával)
        return false;
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== KLASSZIKUS ALGORITMUSOK TESZTEK ===\n");
        
        runFizzBuzzTests();
        runMissingNumberTests();
        runFindDuplicateTests();
        runSwapWithoutTempTests();
        runValidParenthesesTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runFizzBuzzTests() {
        System.out.println("1. FIZZBUZZ TESZTEK:");
        
        // Test 1: Kis szám
        String[] result1 = fizzBuzz(5);
        String[] expected1 = {"1", "2", "Fizz", "4", "Buzz"};
        testStringArray(result1, expected1, "n=5");
        
        // Test 2: 15-ig (FizzBuzz is benne)
        String[] result2 = fizzBuzz(15);
        String[] expected2 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        testStringArray(result2, expected2, "n=15");
        
        System.out.println();
    }

    private static void runMissingNumberTests() {
        System.out.println("2. HIÁNYZÓ SZÁM TESZTEK:");
        
        // Test 1: Hiányzó 2
        testMissingNumber(new int[]{3, 0, 1}, 3, 2, "hiányzó 2");
        
        // Test 2: Hiányzó 0
        testMissingNumber(new int[]{1, 2}, 2, 0, "hiányzó 0");
        
        // Test 3: Hiányzó utolsó
        testMissingNumber(new int[]{0, 1}, 2, 2, "hiányzó utolsó");
        
        // Test 4: Nagyobb tömb
        testMissingNumber(new int[]{0, 1, 3, 4, 5}, 5, 2, "nagyobb tömb");
        
        System.out.println();
    }

    private static void runFindDuplicateTests() {
        System.out.println("3. DUPLIKÁTUM KERESÉS TESZTEK:");
        
        // Test 1: Egyszerű eset
        testFindDuplicate(new int[]{1, 3, 4, 2, 2}, 2, "egyszerű eset");
        
        // Test 2: Első elem ismétlődik
        testFindDuplicate(new int[]{3, 1, 3, 4, 2}, 3, "első elem ismétlődik");
        
        // Test 3: Utolsó elem ismétlődik
        testFindDuplicate(new int[]{1, 1}, 1, "utolsó elem ismétlődik");
        
        System.out.println();
    }

    private static void runSwapWithoutTempTests() {
        System.out.println("4. CSERE TEMP NÉLKÜL TESZTEK:");
        
        // Test 1: Pozitív számok
        testSwap(5, 10, "pozitív számok");
        
        // Test 2: Negatív számok
        testSwap(-3, -7, "negatív számok");
        
        // Test 3: Kevert számok
        testSwap(-5, 8, "kevert számok");
        
        System.out.println();
    }

    private static void runValidParenthesesTests() {
        System.out.println("5. KIEGYENSÚLYOZOTT ZÁRÓJELEK TESZTEK:");
        
        // Test 1: Érvényes esetek
        testValidParentheses("()", true, "egyszerű ()");
        testValidParentheses("()[]{}", true, "vegyes típusok");
        testValidParentheses("({[]})", true, "beágyazott");
        testValidParentheses("", true, "üres string");
        
        // Test 2: Érvénytelen esetek
        testValidParentheses("(]", false, "hibás párosítás");
        testValidParentheses("([)]", false, "keresztezett");
        testValidParentheses("((", false, "csak nyitó");
        testValidParentheses("))", false, "csak záró");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testStringArray(String[] result, String[] expected, String description) {
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testMissingNumber(int[] nums, int n, int expected, String description) {
        int result = findMissingNumber(nums, n);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s, n=%d -> %d (várt: %d)\n", 
                         status, description, Arrays.toString(nums), n, result, expected);
    }

    private static void testFindDuplicate(int[] nums, int expected, String description) {
        int result = findDuplicate(nums);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %d (várt: %d)\n", 
                         status, description, Arrays.toString(nums), result, expected);
    }

    private static void testSwap(int a, int b, String description) {
        int[] result = swapWithoutTemp(a, b);
        boolean isCorrect = result.length == 2 && result[0] == b && result[1] == a;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: (%d, %d) -> [%d, %d] (várt: [%d, %d])\n", 
                         status, description, a, b, result[0], result[1], b, a);
    }

    private static void testValidParentheses(String input, boolean expected, String description) {
        boolean result = isValidParentheses(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }
}