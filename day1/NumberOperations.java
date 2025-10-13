/**
 * Day 1 - Számokkal kapcsolatos műveletek
 * 
 * Ez a fájl számokkal kapcsolatos alapműveleteket tartalmaz.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class NumberOperations {

    /**
     * 1) FELADAT: Maximum szám keresése tömbben
     * 
     * Cél: Add vissza a legnagyobb számot egy int tömbből
     * Követelmények:
     * - Iterálással oldd meg
     * - Kezelje a negatív számokat is
     * - Feltételezheted, hogy a tömb nem üres
     * 
     * Példa: [3, 7, 2, 9, 1] -> 9
     */
    public static int findMax(int[] numbers) {
        // TODO: Implementáld itt a megoldást
        return 0;
    }

    /**
     * 2) FELADAT: Számok cseréje segédváltozóval
     * 
     * Cél: Cseréld meg két szám értékét segédváltozó használatával
     * Követelmények:
     * - Használj ideiglenes változót
     * - Térj vissza egy tömbbel: [csereUtánA, csereUtánB]
     * 
     * Példa: swapWithTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithTemp(int a, int b) {
        // TODO: Implementáld itt a megoldást
        return new int[]{a, b};
    }

    /**
     * 3) FELADAT: Számok cseréje segédváltozó nélkül
     * 
     * Cél: Cseréld meg két szám értékét segédváltozó nélkül
     * Követelmények:
     * - Használj aritmetikai műveleteket (+ és -)
     * - Térj vissza egy tömbbel: [csereUtánA, csereUtánB]
     * 
     * Példa: swapWithoutTemp(5, 10) -> [10, 5]
     */
    public static int[] swapWithoutTemp(int a, int b) {
        // TODO: Implementáld itt a megoldást
        return new int[]{a, b};
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== SZÁM MŰVELETEK TESZTEK ===\n");
        
        runFindMaxTests();
        runSwapWithTempTests();
        runSwapWithoutTempTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runFindMaxTests() {
        System.out.println("1. FIND MAX TESZTEK:");
        
        // Test 1: Pozitív számok
        testFindMax(new int[]{3, 7, 2, 9, 1}, 9, "pozitív számok");
        
        // Test 2: Negatív számok
        testFindMax(new int[]{-5, -2, -8, -1}, -1, "negatív számok");
        
        // Test 3: Kevert számok
        testFindMax(new int[]{-3, 5, -1, 8, 2}, 8, "kevert számok");
        
        // Test 4: Egy elem
        testFindMax(new int[]{42}, 42, "egy elem");
        
        // Test 5: Egyforma elemek
        testFindMax(new int[]{7, 7, 7, 7}, 7, "egyforma elemek");
        
        System.out.println();
    }

    private static void runSwapWithTempTests() {
        System.out.println("2. SWAP WITH TEMP TESZTEK:");
        
        // Test 1: Pozitív számok
        testSwap(NumberOperations::swapWithTemp, 5, 10, "pozitív számok");
        
        // Test 2: Negatív számok
        testSwap(NumberOperations::swapWithTemp, -3, -7, "negatív számok");
        
        // Test 3: Kevert számok
        testSwap(NumberOperations::swapWithTemp, -5, 8, "kevert számok");
        
        // Test 4: Nulla értékek
        testSwap(NumberOperations::swapWithTemp, 0, 15, "nulla értékek");
        
        System.out.println();
    }

    private static void runSwapWithoutTempTests() {
        System.out.println("3. SWAP WITHOUT TEMP TESZTEK:");
        
        // Test 1: Pozitív számok
        testSwap(NumberOperations::swapWithoutTemp, 5, 10, "pozitív számok");
        
        // Test 2: Negatív számok
        testSwap(NumberOperations::swapWithoutTemp, -3, -7, "negatív számok");
        
        // Test 3: Kevert számok
        testSwap(NumberOperations::swapWithoutTemp, -5, 8, "kevert számok");
        
        // Test 4: Nulla értékek
        testSwap(NumberOperations::swapWithoutTemp, 0, 15, "nulla értékek");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testFindMax(int[] input, int expected, String description) {
        int result = findMax(input);
        String status = expected == result ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %d (várt: %d)\n", 
                         status, description, arrayToString(input), result, expected);
    }

    private static void testSwap(SwapFunction swapFunc, int a, int b, String description) {
        int[] result = swapFunc.swap(a, b);
        boolean isCorrect = result.length == 2 && result[0] == b && result[1] == a;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: (%d, %d) -> [%d, %d] (várt: [%d, %d])\n", 
                         status, description, a, b, result[0], result[1], b, a);
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

    @FunctionalInterface
    private interface SwapFunction {
        int[] swap(int a, int b);
    }
}