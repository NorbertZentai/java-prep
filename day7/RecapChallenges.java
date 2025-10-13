import java.util.*;
import java.util.stream.Collectors;

/**
 * Day 7 - Összefoglaló kihívások és ismétlés
 * 
 * Ez a fájl a korábbi hetek anyagát foglalja össze kihívásszerű feladatokkal.
 * Minden feladat egy-egy témakört testez az eddigiek közül.
 */

public class RecapChallenges {

    /**
     * 1) FELADAT: String manipuláció kombináció
     * 
     * Cél: Kombináld a string műveleteket:
     * - Távolítsd el az ismétlődő karaktereket
     * - Fordítsd meg a stringet
     * - Alakítsd nagybetűssé
     * 
     * Példa: processString("aabBcCc") -> "CBA"
     */
    public static String processString(String input) {
        // TODO: Implementáld a kombinált string műveleteket
        return "";
    }

    /**
     * 2) FELADAT: Komplex tömb műveletek
     * 
     * Cél: 
     * - Keresd meg a második legkisebb számot
     * - Számold meg hány szám van az átlag felett
     * - Add vissza egy tömbbel: [secondMin, countAboveAvg]
     * 
     * Példa: arrayAnalysis([1, 5, 3, 9, 2]) -> [2, 2] (második legkisebb: 2, átlag felett: 5, 9)
     */
    public static int[] arrayAnalysis(int[] numbers) {
        // TODO: Implementáld a komplex tömb elemzést
        return new int[]{0, 0};
    }

    /**
     * 3) FELADAT: Map-alapú szó számláló
     * 
     * Cél: Számold meg hány alkalommal szerepel minden szó egy mondatban
     * - Alakítsd kisbetűssé
     * - Távolítsd el az írásjeleket
     * - Számold a szavakat
     * 
     * Példa: countWords("Hello, world! Hello Java.") -> {"hello": 2, "world": 1, "java": 1}
     */
    public static Map<String, Integer> countWords(String sentence) {
        // TODO: Implementáld a szószámlálást
        return new HashMap<>();
    }

    /**
     * 4) FELADAT: Rekurzív faktoriális és Fibonacci kombináció
     * 
     * Cél: Számítsd ki n! + fibonacci(n) értékét
     * - Használj rekurziót mindkettőhöz
     * - Optimalizálj memoization-nel a fibonacci-hoz
     * 
     * Példa: factorialPlusFib(5) -> 120 + 5 = 125
     */
    public static long factorialPlusFib(int n) {
        // TODO: Implementáld a kombinált számítást
        return 0;
    }
    
    // Segéd metódusok a rekurzióhoz
    private static long factorial(int n) {
        // TODO: Rekurzív faktoriális
        return 0;
    }
    
    private static Map<Integer, Long> fibCache = new HashMap<>();
    private static long fibonacciMemo(int n) {
        // TODO: Memoizált Fibonacci
        return 0;
    }

    /**
     * 5) FELADAT: Stream API mesterfeladat
     * 
     * Cél: Adott egy lista személyekről (név, életkor), végezd el:
     * - Szűrd ki a 18+ személyeket
     * - Csoportosítsd az első betű szerint (név alapján)
     * - Számold meg mennyien vannak csoportonként
     * - Csak azokat a csoportokat tartsd meg ahol legalább 2 ember van
     * 
     * Példa bemenetre: [("Alice", 25), ("Bob", 17), ("Anna", 30), ("Charlie", 22)]
     * Kimenet: {"A": 2} (Alice és Anna 18+, és "A"-val kezdődnek, 2-en vannak)
     */
    public static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() { return name; }
        public int getAge() { return age; }
        
        @Override
        public String toString() {
            return String.format("Person{name='%s', age=%d}", name, age);
        }
    }
    
    public static Map<Character, Long> groupAndCountAdults(List<Person> people) {
        // TODO: Implementáld a komplex Stream műveleteket
        return new HashMap<>();
    }

    /**
     * 6) FELADAT: Exception handling gyakorlat
     * 
     * Cél: Próbálj meg több műveletet végrehajtani, de kezeld a kivételeket:
     * - String to Integer konverzió
     * - Tömb index elérés
     * - Map kulcs keresés
     * Ha bármelyik kivételt dob, térj vissza -1-el
     * 
     * Példa: safeOperations("5", new int[]{1,2,3}, 1, Map.of("key", 10), "key") -> 5+2+10=17
     */
    public static int safeOperations(String numberStr, int[] array, int index, 
                                   Map<String, Integer> map, String key) {
        // TODO: Implementáld a biztonságos műveleteket
        return -1;
    }

    /**
     * 7) FELADAT: Algoritmus kombináció - keresés és rendezés
     * 
     * Cél: 
     * - Rendezd a tömböt bubble sort-tal
     * - Keresd meg egy elem pozícióját bináris kereséssel
     * - Ha nem található, add vissza -1-et
     * 
     * Példa: sortAndSearch([5, 1, 3, 2, 4], 3) -> 2 (3-as index a rendezett tömbben)
     */
    public static int sortAndSearch(int[] array, int target) {
        // TODO: Implementáld a rendezést és keresést
        return -1;
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== ÖSSZEFOGLALÓ KIHÍVÁSOK ===\n");
        
        runStringProcessingTests();
        runArrayAnalysisTests();
        runWordCountTests();
        runFactorialFibTests();
        runStreamMasteryTests();
        runExceptionHandlingTests();
        runAlgorithmCombinationTests();
        
        System.out.println("\n=== 🏆 MINDEN KIHÍVÁS TELJESÍTVE! 🏆 ===");
        System.out.println("Gratulálok! Elsajátítottad a Java alapjait! 🎉");
    }

    private static void runStringProcessingTests() {
        System.out.println("1. STRING FELDOLGOZÁS TESZTEK:");
        
        testStringProcessing("aabBcCc", "CBA", "duplikátumok és rendezés");
        testStringProcessing("hello", "OLEH", "egyszerű string");
        testStringProcessing("AAaa", "A", "mind ugyanaz");
        testStringProcessing("", "", "üres string");
        
        System.out.println();
    }

    private static void runArrayAnalysisTests() {
        System.out.println("2. TÖMB ELEMZÉS TESZTEK:");
        
        testArrayAnalysis(new int[]{1, 5, 3, 9, 2}, new int[]{2, 2}, "vegyes számok");
        testArrayAnalysis(new int[]{10, 20, 30}, new int[]{20, 1}, "növekvő sorrend");
        testArrayAnalysis(new int[]{5, 5, 5}, new int[]{5, 0}, "egyforma számok");
        
        System.out.println();
    }

    private static void runWordCountTests() {
        System.out.println("3. SZÓSZÁMLÁLÁS TESZTEK:");
        
        Map<String, Integer> expected1 = Map.of("hello", 2, "world", 1, "java", 1);
        testWordCount("Hello, world! Hello Java.", expected1, "vegyes mondat");
        
        Map<String, Integer> expected2 = Map.of("test", 1);
        testWordCount("Test", expected2, "egy szó");
        
        Map<String, Integer> expected3 = Map.of();
        testWordCount("", expected3, "üres mondat");
        
        System.out.println();
    }

    private static void runFactorialFibTests() {
        System.out.println("4. FAKTORIÁLIS + FIBONACCI TESZTEK:");
        
        testFactorialPlusFib(5, 125, "n=5 (120+5)");
        testFactorialPlusFib(0, 1, "n=0 (1+0)");
        testFactorialPlusFib(1, 2, "n=1 (1+1)");
        testFactorialPlusFib(3, 8, "n=3 (6+2)");
        
        System.out.println();
    }

    private static void runStreamMasteryTests() {
        System.out.println("5. STREAM MESTERFELADAT TESZTEK:");
        
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Anna", 30),
            new Person("Charlie", 22),
            new Person("Carol", 19)
        );
        
        Map<Character, Long> result = groupAndCountAdults(people);
        Map<Character, Long> expected = Map.of('A', 2L, 'C', 2L);
        testStreamMastery(result, expected, "komplex személy csoportosítás");
        
        System.out.println();
    }

    private static void runExceptionHandlingTests() {
        System.out.println("6. EXCEPTION HANDLING TESZTEK:");
        
        // Test 1: Minden működik
        testSafeOperations("5", new int[]{1, 2, 3}, 1, Map.of("key", 10), "key", 17, "minden működik");
        
        // Test 2: Hibás szám
        testSafeOperations("abc", new int[]{1, 2, 3}, 1, Map.of("key", 10), "key", -1, "hibás szám");
        
        // Test 3: Hibás index
        testSafeOperations("5", new int[]{1, 2, 3}, 10, Map.of("key", 10), "key", -1, "hibás index");
        
        // Test 4: Hiányzó kulcs
        testSafeOperations("5", new int[]{1, 2, 3}, 1, Map.of("other", 10), "key", -1, "hiányzó kulcs");
        
        System.out.println();
    }

    private static void runAlgorithmCombinationTests() {
        System.out.println("7. ALGORITMUS KOMBINÁCIÓ TESZTEK:");
        
        testSortAndSearch(new int[]{5, 1, 3, 2, 4}, 3, 2, "keresés rendezett tömbben");
        testSortAndSearch(new int[]{5, 1, 3, 2, 4}, 1, 0, "első elem keresése");
        testSortAndSearch(new int[]{5, 1, 3, 2, 4}, 6, -1, "nem létező elem");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testStringProcessing(String input, String expected, String description) {
        String result = processString(input);
        String status = expected.equals(result) ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> '%s' (várt: '%s')\n", 
                         status, description, input, result, expected);
    }

    private static void testArrayAnalysis(int[] input, int[] expected, String description) {
        int[] result = arrayAnalysis(input);
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, Arrays.toString(input), 
                         Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testWordCount(String input, Map<String, Integer> expected, String description) {
        Map<String, Integer> result = countWords(input);
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %s (várt: %s)\n", 
                         status, description, input, result, expected);
    }

    private static void testFactorialPlusFib(int input, long expected, String description) {
        long result = factorialPlusFib(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %d -> %d (várt: %d)\n", 
                         status, description, input, result, expected);
    }

    private static void testStreamMastery(Map<Character, Long> result, Map<Character, Long> expected, String description) {
        boolean isCorrect = result.equals(expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, result, expected);
    }

    private static void testSafeOperations(String numberStr, int[] array, int index, 
                                         Map<String, Integer> map, String key, 
                                         int expected, String description) {
        int result = safeOperations(numberStr, array, index, map, key);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: -> %d (várt: %d)\n", 
                         status, description, result, expected);
    }

    private static void testSortAndSearch(int[] input, int target, int expected, String description) {
        int result = sortAndSearch(input.clone(), target);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s keresés %d -> index %d (várt: %d)\n", 
                         status, description, Arrays.toString(input), target, result, expected);
    }
}