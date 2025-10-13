import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Day 4 - Haladó algoritmusok és Java 8+ funkciók
 * 
 * Ez a fájl haladóbb algoritmusokat és modern Java funkciókat tartalmaz.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class AdvancedAlgorithms {

    /**
     * 1) FELADAT: Merge Sort implementálás
     * 
     * Cél: Implementáld a merge sort algoritmust rekurzívan
     * Követelmények:
     * - Oszd fel a tömböt két részre
     * - Rendezd mindkét részt rekurzívan
     * - Merge-eld össze a rendezett részeket
     * - Ne módosítsd az eredeti tömböt
     * 
     * Példa: mergeSort([64, 34, 25, 12, 22, 11, 90]) -> [11, 12, 22, 25, 34, 64, 90]
     */
    public static int[] mergeSort(int[] arr) {
        // TODO: Implementáld itt a merge sort algoritmust
        return arr.clone();
    }

    /**
     * Segédmetódus: két rendezett tömb összefésülése
     */
    private static int[] merge(int[] left, int[] right) {
        // TODO: Implementáld itt a merge logikát
        int[] result = new int[left.length + right.length];
        return result;
    }

    /**
     * 2) FELADAT: Bináris keresés rekurzívan
     * 
     * Cél: Implementáld a bináris keresést rekurzív módon
     * Követelmények:
     * - Használj rekurziót
     * - A tömb rendezett
     * - Térj vissza az index-szel vagy -1-el
     * 
     * Példa: binarySearchRecursive([1, 3, 5, 7, 9], 5, 0, 4) -> 2
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // TODO: Implementáld itt a rekurzív bináris keresést
        return -1;
    }

    /**
     * 3) FELADAT: Lambda kifejezések gyakorlás
     * 
     * Cél: Szűrd ki a páros számokat egy listából lambda kifejezéssel
     * Követelmények:
     * - Használj Stream API-t
     * - Lambda kifejezéssel szűrj
     * - Térj vissza új listával
     * 
     * Példa: filterEvenNumbers([1, 2, 3, 4, 5, 6]) -> [2, 4, 6]
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        // TODO: Implementáld itt a szűrést lambda kifejezéssel
        return new ArrayList<>();
    }

    /**
     * 4) FELADAT: Stream műveletek láncolása
     * 
     * Cél: A következő műveletet végezd el stream-ekkel:
     * - Szűrd ki a 3-nál hosszabb szavakat
     * - Alakítsd nagybetűssé
     * - Rendezd ábécé sorrendbe
     * - Gyűjtsd listába
     * 
     * Példa: processWords(["cat", "elephant", "dog", "bird"]) -> ["BIRD", "ELEPHANT"]
     */
    public static List<String> processWords(List<String> words) {
        // TODO: Implementáld itt a stream műveletek láncolását
        return new ArrayList<>();
    }

    /**
     * 5) FELADAT: Csoportosítás Stream API-val
     * 
     * Cél: Csoportosítsd a számokat páros/páratlan szerint
     * Követelmények:
     * - Használj Collectors.groupingBy-t
     * - A kulcs legyen "even" vagy "odd" 
     * - Az érték legyen a számok listája
     * 
     * Példa: groupByParity([1, 2, 3, 4, 5, 6]) -> {"even": [2, 4, 6], "odd": [1, 3, 5]}
     */
    public static Map<String, List<Integer>> groupByParity(List<Integer> numbers) {
        // TODO: Implementáld itt a csoportosítást
        return new HashMap<>();
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== HALADÓ ALGORITMUSOK TESZTEK ===\n");
        
        runMergeSortTests();
        runBinarySearchRecursiveTests();
        runLambdaTests();
        runStreamProcessingTests();
        runGroupingTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runMergeSortTests() {
        System.out.println("1. MERGE SORT TESZTEK:");
        
        // Test 1: Random tömb
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        testSort(test1, expected1, "random tömb");
        
        // Test 2: Már rendezett
        int[] test2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        testSort(test2, expected2, "már rendezett");
        
        // Test 3: Fordított
        int[] test3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        testSort(test3, expected3, "fordított sorrend");
        
        // Test 4: Egy elem
        int[] test4 = {42};
        int[] expected4 = {42};
        testSort(test4, expected4, "egy elem");
        
        System.out.println();
    }

    private static void runBinarySearchRecursiveTests() {
        System.out.println("2. REKURZÍV BINÁRIS KERESÉS TESZTEK:");
        
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        
        // Test 1: Elem megtalálható
        testBinarySearch(arr, 9, 4, "elem megtalálható");
        
        // Test 2: Elem nincs benne
        testBinarySearch(arr, 10, -1, "elem nincs benne");
        
        // Test 3: Első elem
        testBinarySearch(arr, 1, 0, "első elem");
        
        // Test 4: Utolsó elem
        testBinarySearch(arr, 17, 8, "utolsó elem");
        
        System.out.println();
    }

    private static void runLambdaTests() {
        System.out.println("3. LAMBDA KIFEJEZÉSEK TESZTEK:");
        
        // Test 1: Kevert számok
        List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expected1 = Arrays.asList(2, 4, 6, 8);
        testFilterEven(test1, expected1, "kevert számok");
        
        // Test 2: Csak páratlan
        List<Integer> test2 = Arrays.asList(1, 3, 5, 7);
        List<Integer> expected2 = Arrays.asList();
        testFilterEven(test2, expected2, "csak páratlan");
        
        // Test 3: Csak páros
        List<Integer> test3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected3 = Arrays.asList(2, 4, 6, 8);
        testFilterEven(test3, expected3, "csak páros");
        
        System.out.println();
    }

    private static void runStreamProcessingTests() {
        System.out.println("4. STREAM MŰVELETEK TESZTEK:");
        
        // Test 1: Kevert hosszúságú szavak
        List<String> test1 = Arrays.asList("cat", "elephant", "dog", "bird", "a", "programming");
        List<String> expected1 = Arrays.asList("BIRD", "ELEPHANT", "PROGRAMMING");
        testProcessWords(test1, expected1, "kevert hosszúságú szavak");
        
        // Test 2: Mind rövid szavak
        List<String> test2 = Arrays.asList("cat", "dog", "rat");
        List<String> expected2 = Arrays.asList();
        testProcessWords(test2, expected2, "mind rövid szavak");
        
        System.out.println();
    }

    private static void runGroupingTests() {
        System.out.println("5. CSOPORTOSÍTÁS TESZTEK:");
        
        // Test 1: Kevert számok
        List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> result1 = groupByParity(test1);
        testGroupByParity(result1, Arrays.asList(2, 4, 6), Arrays.asList(1, 3, 5), "kevert számok");
        
        // Test 2: Csak páros számok
        List<Integer> test2 = Arrays.asList(2, 4, 6, 8);
        Map<String, List<Integer>> result2 = groupByParity(test2);
        testGroupByParity(result2, Arrays.asList(2, 4, 6, 8), Arrays.asList(), "csak páros számok");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testSort(int[] input, int[] expected, String description) {
        int[] result = mergeSort(input.clone());
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, Arrays.toString(input), 
                         Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testBinarySearch(int[] arr, int target, int expected, String description) {
        int result = binarySearchRecursive(arr, target, 0, arr.length - 1);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: keresés %d -> index %d (várt: %d)\n", 
                         status, description, target, result, expected);
    }

    private static void testFilterEven(List<Integer> input, List<Integer> expected, String description) {
        List<Integer> result = filterEvenNumbers(input);
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testProcessWords(List<String> input, List<String> expected, String description) {
        List<String> result = processWords(input);
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testGroupByParity(Map<String, List<Integer>> result, 
                                        List<Integer> expectedEven, List<Integer> expectedOdd, 
                                        String description) {
        List<Integer> actualEven = result.getOrDefault("even", Arrays.asList());
        List<Integer> actualOdd = result.getOrDefault("odd", Arrays.asList());
        
        boolean evenCorrect = new HashSet<>(actualEven).equals(new HashSet<>(expectedEven));
        boolean oddCorrect = new HashSet<>(actualOdd).equals(new HashSet<>(expectedOdd));
        boolean isCorrect = evenCorrect && oddCorrect;
        
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: even:%s odd:%s (várt even:%s odd:%s)\n", 
                         status, description, actualEven, actualOdd, expectedEven, expectedOdd);
    }
}