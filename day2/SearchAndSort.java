import java.util.Arrays;

/**
 * Day 2 - Keresés és rendezés
 * 
 * Ez a fájl keresési és rendezési algoritmusok feladatait tartalmazza.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class SearchAndSort {

    /**
     * 1) FELADAT: Lineáris keresés
     * 
     * Cél: Keresd meg egy elem indexét a tömbben lineáris kereséssel
     * Követelmények:
     * - Menj végig a tömbön elejétől a végéig
     * - Ha megtalálod, add vissza az indexet
     * - Ha nem találod, térj vissza -1-el
     * 
     * Példa: linearSearch([1, 3, 5, 7, 9], 5) -> 2
     */
    public static int linearSearch(int[] arr, int target) {
        // TODO: Implementáld itt a megoldást
        return -1;
    }

    /**
     * 2) FELADAT: Bináris keresés
     * 
     * Cél: Keresd meg egy elem indexét egy RENDEZETT tömbben bináris kereséssel
     * Követelmények:
     * - A tömb már rendezett
     * - Használj bal/jobb pointer technikát
     * - Ha megtalálod, add vissza az indexet
     * - Ha nem találod, térj vissza -1-el
     * 
     * Példa: binarySearch([1, 3, 5, 7, 9], 5) -> 2
     */
    public static int binarySearch(int[] arr, int target) {
        // TODO: Implementáld itt a megoldást
        return -1;
    }

    /**
     * 3) FELADAT: Bubble sort növekvő sorrendbe
     * 
     * Cél: Rendezd a tömböt növekvő sorrendbe bubble sort algoritmussal
     * Követelmények:
     * - Ne módosítsd az eredeti tömböt
     * - Készíts másolatot és azt rendezd
     * - Használj egymásba ágyazott ciklusokat
     * - Cserélj szomszédos elemeket ha szükséges
     * 
     * Példa: bubbleSortAsc([64, 34, 25, 12, 22, 11, 90]) -> [11, 12, 22, 25, 34, 64, 90]
     */
    public static int[] bubbleSortAsc(int[] arr) {
        // TODO: Implementáld itt a megoldást
        return arr.clone();
    }

    /**
     * 4) FELADAT: Selection sort csökkenő sorrendbe
     * 
     * Cél: Rendezd a tömböt csökkenő sorrendbe selection sort algoritmussal
     * Követelmények:
     * - Ne módosítsd az eredeti tömböt
     * - Készíts másolatot és azt rendezd
     * - Minden iterációban keresd meg a legnagyobb elemet
     * - Tedd a megfelelő helyre
     * 
     * Példa: selectionSortDesc([64, 34, 25, 12, 22, 11, 90]) -> [90, 64, 34, 25, 22, 12, 11]
     */
    public static int[] selectionSortDesc(int[] arr) {
        // TODO: Implementáld itt a megoldást
        return arr.clone();
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== KERESÉS ÉS RENDEZÉS TESZTEK ===\n");
        
        runLinearSearchTests();
        runBinarySearchTests();
        runBubbleSortTests();
        runSelectionSortTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runLinearSearchTests() {
        System.out.println("1. LINEÁRIS KERESÉS TESZTEK:");
        
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        
        // Test 1: Elem megtalálható
        testSearch("linearSearch", arr, 5, 2, "elem megtalálható");
        
        // Test 2: Elem nincs benne
        testSearch("linearSearch", arr, 10, -1, "elem nincs benne");
        
        // Test 3: Első elem
        testSearch("linearSearch", arr, 1, 0, "első elem");
        
        // Test 4: Utolsó elem
        testSearch("linearSearch", arr, 8, 8, "utolsó elem");
        
        System.out.println();
    }

    private static void runBinarySearchTests() {
        System.out.println("2. BINÁRIS KERESÉS TESZTEK:");
        
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        
        // Test 1: Elem megtalálható középen
        testSearch("binarySearch", sortedArr, 9, 4, "elem középen");
        
        // Test 2: Elem nincs benne
        testSearch("binarySearch", sortedArr, 10, -1, "elem nincs benne");
        
        // Test 3: Első elem
        testSearch("binarySearch", sortedArr, 1, 0, "első elem");
        
        // Test 4: Utolsó elem
        testSearch("binarySearch", sortedArr, 17, 8, "utolsó elem");
        
        System.out.println();
    }

    private static void runBubbleSortTests() {
        System.out.println("3. BUBBLE SORT NÖVEKVŐ TESZTEK:");
        
        // Test 1: Random tömb
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        testSort("bubbleSortAsc", test1, expected1, "random tömb");
        
        // Test 2: Már rendezett
        int[] test2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        testSort("bubbleSortAsc", test2, expected2, "már rendezett");
        
        // Test 3: Fordított sorrend
        int[] test3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        testSort("bubbleSortAsc", test3, expected3, "fordított sorrend");
        
        System.out.println();
    }

    private static void runSelectionSortTests() {
        System.out.println("4. SELECTION SORT CSÖKKENŐ TESZTEK:");
        
        // Test 1: Random tömb
        int[] test1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expected1 = {90, 64, 34, 25, 22, 12, 11};
        testSort("selectionSortDesc", test1, expected1, "random tömb");
        
        // Test 2: Már csökkenő rendezett
        int[] test2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 4, 3, 2, 1};
        testSort("selectionSortDesc", test2, expected2, "már rendezett");
        
        // Test 3: Növekvő sorrend
        int[] test3 = {1, 2, 3, 4, 5};
        int[] expected3 = {5, 4, 3, 2, 1};
        testSort("selectionSortDesc", test3, expected3, "növekvő sorrend");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testSearch(String methodName, int[] arr, int target, int expected, String description) {
        int result;
        if (methodName.equals("linearSearch")) {
            result = linearSearch(arr, target);
        } else {
            result = binarySearch(arr, target);
        }
        
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: keresés %d -> index %d (várt: %d)\n", 
                         status, description, target, result, expected);
    }

    private static void testSort(String methodName, int[] input, int[] expected, String description) {
        int[] result;
        if (methodName.equals("bubbleSortAsc")) {
            result = bubbleSortAsc(input);
        } else {
            result = selectionSortDesc(input);
        }
        
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, arrayToString(input), 
                         arrayToString(result), arrayToString(expected));
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