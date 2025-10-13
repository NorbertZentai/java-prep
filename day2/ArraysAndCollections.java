import java.util.*;

/**
 * Day 2 - Tömbök és kollekciók
 * 
 * Ez a fájl tömb és kollekció műveletek feladatait tartalmazza.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class ArraysAndCollections {

    /**
     * 1) FELADAT: Alapvető tömb műveletek
     * 
     * Cél: Implementálj alapműveletek: összeg, átlag, minimum, maximum
     * Követelmények:
     * - Használj ciklusokat
     * - Az átlagnál figyelj a 0-val osztásra
     * 
     * Példa: [1, 2, 3, 4, 5] -> összeg: 15, átlag: 3.0, min: 1, max: 5
     */
    public static int arraySum(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    public static double arrayAverage(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0.0;
    }

    public static int arrayMin(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    public static int arrayMax(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    /**
     * 2) FELADAT: Második legnagyobb szám
     * 
     * Cél: Találd meg a második legnagyobb számot a tömbben
     * Követelmények:
     * - Kezelje a duplikátumokat (egyedi értékek között második legnagyobb)
     * - Ha nincs második legnagyobb, dobj IllegalArgumentException-t
     * 
     * Példa: [1, 5, 2, 9, 3, 9] -> 5 (a 9 után a legnagyobb)
     */
    public static int secondLargest(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    /**
     * 3) FELADAT: Duplikátumok eltávolítása
     * 
     * Cél: Távolítsd el a duplikátumokat egy tömbből
     * Követelmények:
     * - Használj Set-et a duplikátumok eltávolítására
     * - Térj vissza egy új tömbbel
     * - A sorrend nem számít
     * 
     * Példa: [1, 2, 2, 3, 3, 3, 4] -> [1, 2, 3, 4]
     */
    public static int[] removeDuplicates(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return new int[0];
    }

    /**
     * 4) FELADAT: List alapműveletek
     * 
     * Cél: Gyakorold a List műveletek: hozzáadás, keresés, eltávolítás
     * 
     * Ez a metódus demonstrációs célú - adj vissza egy listát amely:
     * - Tartalmazza a bemeneti elemeket
     * - Eltávolítja a "remove" stringet ha benne van
     * - Hozzáadja a végére a "added" stringet
     */
    public static List<String> listOperations(String[] initialElements, String toRemove) {
        // TODO: Implementáld itt a megoldást
        return new ArrayList<>();
    }

    /**
     * 5) FELADAT: Map alapműveletek
     * 
     * Cél: Gyakorold a Map műveletek
     * 
     * Készíts egy Map-et amely:
     * - A string hosszát tárolja kulcsként, magát a stringet értékként
     * - Ha több string ugyanolyan hosszú, az utolsót tárolja
     */
    public static Map<Integer, String> createLengthMap(String[] words) {
        // TODO: Implementáld itt a megoldást
        return new HashMap<>();
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== TÖMBÖK ÉS KOLLEKCIÓK TESZTEK ===\n");
        
        runArrayOperationsTests();
        runSecondLargestTests();
        runRemoveDuplicatesTests();
        runListOperationsTests();
        runMapOperationsTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runArrayOperationsTests() {
        System.out.println("1. TÖMB ALAPMŰVELETEK TESZTEK:");
        
        int[] test1 = {1, 2, 3, 4, 5};
        testArrayOperations(test1, 15, 3.0, 1, 5, "pozitív számok");
        
        int[] test2 = {-5, -2, -8, -1};
        testArrayOperations(test2, -16, -4.0, -8, -1, "negatív számok");
        
        int[] test3 = {10};
        testArrayOperations(test3, 10, 10.0, 10, 10, "egy elem");
        
        System.out.println();
    }

    private static void runSecondLargestTests() {
        System.out.println("2. MÁSODIK LEGNAGYOBB TESZTEK:");
        
        // Test 1: Normál eset
        testSecondLargest(new int[]{1, 5, 2, 9, 3}, 5, "normál eset");
        
        // Test 2: Duplikátumokkal
        testSecondLargest(new int[]{9, 1, 5, 2, 9, 3}, 5, "duplikátumokkal");
        
        // Test 3: Rendezett tömb
        testSecondLargest(new int[]{1, 2, 3, 4, 5}, 4, "rendezett tömb");
        
        System.out.println();
    }

    private static void runRemoveDuplicatesTests() {
        System.out.println("3. DUPLIKÁTUMOK ELTÁVOLÍTÁSA TESZTEK:");
        
        // Test 1: Duplikátumokkal
        testRemoveDuplicates(new int[]{1, 2, 2, 3, 3, 3, 4}, 
                           new int[]{1, 2, 3, 4}, "duplikátumokkal");
        
        // Test 2: Nincs duplikátum
        testRemoveDuplicates(new int[]{1, 2, 3, 4}, 
                           new int[]{1, 2, 3, 4}, "nincs duplikátum");
        
        // Test 3: Mind egyforma
        testRemoveDuplicates(new int[]{5, 5, 5}, 
                           new int[]{5}, "mind egyforma");
        
        System.out.println();
    }

    private static void runListOperationsTests() {
        System.out.println("4. LIST MŰVELETEK TESZTEK:");
        
        // Test 1: Normál eset
        String[] input1 = {"apple", "banana", "remove", "cherry"};
        List<String> result1 = listOperations(input1, "remove");
        testListOperations(result1, Arrays.asList("apple", "banana", "cherry", "added"), 
                          "normál eset");
        
        // Test 2: Nincs eltávolítandó elem
        String[] input2 = {"apple", "banana"};
        List<String> result2 = listOperations(input2, "notfound");
        testListOperations(result2, Arrays.asList("apple", "banana", "added"), 
                          "nincs eltávolítandó elem");
        
        System.out.println();
    }

    private static void runMapOperationsTests() {
        System.out.println("5. MAP MŰVELETEK TESZTEK:");
        
        // Test 1: Különböző hosszúságú szavak
        String[] words1 = {"cat", "dog", "elephant", "hi"};
        Map<Integer, String> result1 = createLengthMap(words1);
        testMapOperations(result1, Map.of(3, "dog", 8, "elephant", 2, "hi"), 
                         "különböző hosszúságú szavak");
        
        // Test 2: Ugyanolyan hosszú szavak (utolsót kell tárolni)
        String[] words2 = {"cat", "dog", "rat"};
        Map<Integer, String> result2 = createLengthMap(words2);
        testMapOperations(result2, Map.of(3, "rat"), 
                         "ugyanolyan hosszú szavak");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testArrayOperations(int[] input, int expectedSum, double expectedAvg, 
                                          int expectedMin, int expectedMax, String description) {
        int sum = arraySum(input);
        double avg = arrayAverage(input);
        int min = arrayMin(input);
        int max = arrayMax(input);
        
        boolean allCorrect = (sum == expectedSum && 
                            Math.abs(avg - expectedAvg) < 0.001 && 
                            min == expectedMin && 
                            max == expectedMax);
        
        String status = allCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> sum:%d avg:%.1f min:%d max:%d\n", 
                         status, description, arrayToString(input), sum, avg, min, max);
    }

    private static void testSecondLargest(int[] input, int expected, String description) {
        try {
            int result = secondLargest(input);
            String status = expected == result ? "✅ PASS" : "❌ FAIL";
            System.out.printf("   %s - %s: %s -> %d (várt: %d)\n", 
                             status, description, arrayToString(input), result, expected);
        } catch (Exception e) {
            System.out.printf("   ❌ FAIL - %s: %s -> Exception: %s\n", 
                             description, arrayToString(input), e.getMessage());
        }
    }

    private static void testRemoveDuplicates(int[] input, int[] expected, String description) {
        int[] result = removeDuplicates(input);
        Arrays.sort(result);
        Arrays.sort(expected);
        
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, arrayToString(input), 
                         arrayToString(result), arrayToString(expected));
    }

    private static void testListOperations(List<String> result, List<String> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, result, expected);
    }

    private static void testMapOperations(Map<Integer, String> result, Map<Integer, String> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, result, expected);
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