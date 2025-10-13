import java.util.*;

/**
 * Day 6 - Tesztelés és hibakeresés
 * 
 * Ez a fájl unit testing, debug gyakorlatokat és kódminőség javítást tartalmaz.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class TestingAndDebugging {

    /**
     * 1) FELADAT: Hibás kód javítása - NullPointerException
     * 
     * Cél: Javítsd ki ezt a metódust ami NPE-t dob
     * A metódus a string hosszát kell visszaadja, de kezelnie kell a null esetet
     * 
     * Hibás verzió: return input.length();
     */
    public static int getStringLengthSafely(String input) {
        // TODO: Javítsd ki a null pointer exception-t
        return input.length(); // Ez hibás - javítsd ki!
    }

    /**
     * 2) FELADAT: Hibás kód javítása - ArrayIndexOutOfBoundsException
     * 
     * Cél: Javítsd ki ezt a metódust ami tömbindex hibát dob
     * A metódus az utolsó elemet kell visszaadja a tömbből
     * 
     * Hibás verzió próbálja elérni az utolsó elemet, de rosszul számol
     */
    public static int getLastElement(int[] array) {
        // TODO: Javítsd ki az index out of bounds hibát
        if (array.length == 0) {
            throw new IllegalArgumentException("A tömb nem lehet üres!");
        }
        return array[array.length]; // Ez hibás - javítsd ki!
    }

    /**
     * 3) FELADAT: Logikai hiba javítása - rossz feltétel
     * 
     * Cél: Ez a metódus ellenőrizni kell hogy egy szám páros-e
     * De van benne logikai hiba - javítsd ki!
     */
    public static boolean isEven(int number) {
        // TODO: Javítsd ki a logikai hibát
        return number % 2 == 1; // Ez hibás logika - javítsd ki!
    }

    /**
     * 4) FELADAT: Edge case kezelés - lista műveletek
     * 
     * Cél: Implementálj egy metódust ami megfordítja a lista elemeit
     * De figyeld az edge case-eket: null lista, üres lista, egy elem
     */
    public static <T> List<T> reverseList(List<T> input) {
        // TODO: Implementáld a lista megfordítását edge case-ekkel
        return new ArrayList<>();
    }

    /**
     * 5) FELADAT: Teljesítmény optimalizálás - string concatenation
     * 
     * Cél: Ez a metódus sok stringet fűz össze, de inefficiensen
     * Optimalizáld StringBuilder használatával!
     */
    public static String concatenateNumbers(int count) {
        // TODO: Optimalizáld StringBuilder használatával
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += i + ","; // Ez inefficiens - javítsd ki!
        }
        return result;
    }

    /**
     * 6) FELADAT: Kód refaktorálás - tiszta kód
     * 
     * Cél: Ez a metódus működik, de olvashatatlan és bonyolult
     * Refaktoráld tisztább, érthetőbb kóddá!
     */
    public static boolean checkPasswordStrength(String pwd) {
        // TODO: Refaktoráld ezt tisztább, olvashatóbb kóddá
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
     * 7) FELADAT: Unit test írása
     * 
     * Cél: Írj teszteket az alábbi egyszerű metódushoz
     * Teszteld a normál esetet, edge case-eket és hibás bemeneteket
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nullával nem lehet osztani!");
        }
        return a / b;
    }

    /**
     * 8) FELADAT: Debug segéd metódus
     * 
     * Cél: Írj egy metódust ami debug információkat ír ki egy tömbről
     * Legyen informatív és segítse a hibakeresést
     */
    public static void debugArrayInfo(int[] array, String arrayName) {
        // TODO: Implementálj hasznos debug kiírást
        System.out.println("Debug info nincs implementálva");
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== TESZTELÉS ÉS HIBAKERESÉS TESZTEK ===\n");
        
        runNullPointerFixTests();
        runArrayIndexFixTests();
        runLogicalErrorFixTests();
        runEdgeCaseTests();
        runPerformanceTests();
        runRefactoringTests();
        runDivisionTests();
        runDebugTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
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