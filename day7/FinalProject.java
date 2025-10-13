import java.util.*;
import java.util.stream.Collectors;

/**
 * Day 7 - Záró projekt: Online áruház rendszer
 * 
 * Ez a fájl egy komplex záró projektet tartalmaz amely összeköti az eddig tanultakat.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class FinalProject {

    /**
     * 1) FELADAT: Product osztály létrehozása
     * 
     * Cél: Hozz létre egy Product osztályt amely egy áruház terméket reprezentál
     * 
     * Követelmények:
     * - id (int) - egyedi azonosító
     * - name (String) - termék neve
     * - category (String) - kategória (pl. "Electronics", "Books")
     * - price (double) - ár
     * - stock (int) - raktárkészlet
     * 
     * Metódusok:
     * - Konstruktor az összes mezővel
     * - Getterek és setterek
     * - toString metódus
     * - equals és hashCode (id alapján)
     */
    public static class Product {
        // TODO: Implementáld itt a Product osztályt
        
        public Product(int id, String name, String category, double price, int stock) {
            // TODO: Konstruktor implementálása
        }
        
        // TODO: Getterek
        public int getId() { return 0; }
        public String getName() { return null; }
        public String getCategory() { return null; }
        public double getPrice() { return 0.0; }
        public int getStock() { return 0; }
        
        // TODO: Setterek (ár és készlet frissítéséhez)
        public void setPrice(double price) { }
        public void setStock(int stock) { }
        
        @Override
        public String toString() {
            // TODO: Informatív toString
            return "";
        }
        
        @Override
        public boolean equals(Object obj) {
            // TODO: equals implementálása id alapján
            return false;
        }
        
        @Override
        public int hashCode() {
            // TODO: hashCode implementálása
            return 0;
        }
    }

    /**
     * 2) FELADAT: Store osztály - áruház kezelő
     * 
     * Cél: Hozz létre egy Store osztályt amely termékeket kezel
     * 
     * Követelmények:
     * - Tárolja a termékeket Map<Integer, Product>-ban (id szerint)
     * - CRUD műveletek: add, remove, update
     * - Keresési és szűrési funkciók
     * - Statisztikai metódusok
     */
    public static class Store {
        // TODO: Implementáld itt a Store osztályt
        
        public Store() {
            // TODO: Konstruktor - inicializáld a Map-et
        }
        
        /**
         * Termék hozzáadása
         * Ha már létezik az id, ne adja hozzá újra
         */
        public boolean addProduct(Product product) {
            // TODO: Termék hozzáadása
            return false;
        }
        
        /**
         * Termék eltávolítása id alapján
         */
        public boolean removeProduct(int productId) {
            // TODO: Termék eltávolítása
            return false;
        }
        
        /**
         * Termék keresése id alapján
         */
        public Product findProductById(int id) {
            // TODO: Termék keresése
            return null;
        }
        
        /**
         * Termék keresése név alapján
         */
        public Product findProductByName(String name) {
            // TODO: Termék keresése név alapján
            return null;
        }
        
        /**
         * Termékek kategória alapján
         */
        public List<Product> findProductsByCategory(String category) {
            // TODO: Kategória alapján szűrés
            return new ArrayList<>();
        }
        
        /**
         * Raktárkészlet frissítése
         */
        public boolean updateStock(int productId, int newStock) {
            // TODO: Készlet frissítése
            return false;
        }
        
        /**
         * Ár frissítése
         */
        public boolean updatePrice(int productId, double newPrice) {
            // TODO: Ár frissítése
            return false;
        }
        
        /**
         * Átlagos ár számítása
         */
        public double getAveragePrice() {
            // TODO: Átlagos ár számítása
            return 0.0;
        }
        
        /**
         * Legjobb értékű termék (ár alapján)
         */
        public Product getMostExpensiveProduct() {
            // TODO: Legdrágább termék
            return null;
        }
        
        /**
         * Alacsony készletű termékek (készlet < threshold)
         */
        public List<Product> getLowStockProducts(int threshold) {
            // TODO: Alacsony készletű termékek
            return new ArrayList<>();
        }
        
        /**
         * Összes termék száma
         */
        public int getTotalProductCount() {
            // TODO: Termékek száma
            return 0;
        }
        
        /**
         * Összes termék értéke (ár * készlet összege)
         */
        public double getTotalInventoryValue() {
            // TODO: Teljes készlet értéke
            return 0.0;
        }
    }

    /**
     * 3) FELADAT: Gyors kódolási kihívások
     * 
     * Implementáld újra gyorsan ezeket a korábbi feladatokat
     * (Szimulálva egy 15 perces interview kört)
     */
    
    /**
     * Speed Challenge 1: FizzBuzz (2 perc)
     */
    public static String[] speedFizzBuzz(int n) {
        // TODO: Gyors FizzBuzz implementáció
        return new String[0];
    }
    
    /**
     * Speed Challenge 2: Palindróma ellenőrzés (3 perc)
     */
    public static boolean speedIsPalindrome(String s) {
        // TODO: Gyors palindróma ellenőrzés
        return false;
    }
    
    /**
     * Speed Challenge 3: Tömb rendezés (5 perc)
     */
    public static int[] speedSort(int[] arr) {
        // TODO: Gyors rendezés (bármely algoritmussal)
        return arr.clone();
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== ZÁRÓ PROJEKT TESZTEK ===\n");
        
        runProductTests();
        runStoreTests();
        runSpeedChallenges();
        
        System.out.println("\n=== 🎉 GRATULÁLOK! MINDEN TESZT BEFEJEZVE! 🎉 ===");
    }

    private static void runProductTests() {
        System.out.println("1. PRODUCT OSZTÁLY TESZTEK:");
        
        // Test 1: Konstruktor és getterek
        Product product = new Product(1, "Laptop", "Electronics", 999.99, 5);
        testProductProperties(product, 1, "Laptop", "Electronics", 999.99, 5, "konstruktor és getterek");
        
        // Test 2: Setterek
        product.setPrice(899.99);
        product.setStock(3);
        testProductProperties(product, 1, "Laptop", "Electronics", 899.99, 3, "setterek után");
        
        // Test 3: equals és hashCode
        Product product2 = new Product(1, "Different Name", "Different Category", 1.0, 1);
        testProductEquals(product, product2, true, "equals ugyanazzal az id-val");
        
        Product product3 = new Product(2, "Laptop", "Electronics", 999.99, 5);
        testProductEquals(product, product3, false, "equals különböző id-val");
        
        System.out.println();
    }

    private static void runStoreTests() {
        System.out.println("2. STORE OSZTÁLY TESZTEK:");
        
        Store store = new Store();
        
        // Termékek létrehozása teszteléshez
        Product laptop = new Product(1, "Laptop", "Electronics", 999.99, 5);
        Product mouse = new Product(2, "Mouse", "Electronics", 25.99, 50);
        Product book = new Product(3, "Java Book", "Books", 39.99, 10);
        Product phone = new Product(4, "Phone", "Electronics", 699.99, 2);
        
        // Test 1: Termékek hozzáadása
        testStoreAdd(store, laptop, true, "laptop hozzáadása");
        testStoreAdd(store, mouse, true, "mouse hozzáadása");
        testStoreAdd(store, book, true, "könyv hozzáadása");
        testStoreAdd(store, phone, true, "telefon hozzáadása");
        
        // Test 2: Duplikált ID
        Product duplicateLaptop = new Product(1, "Another Laptop", "Electronics", 1200.00, 3);
        testStoreAdd(store, duplicateLaptop, false, "duplikált ID hozzáadása");
        
        // Test 3: Keresések
        testStoreFindById(store, 1, "Laptop", "ID alapján keresés");
        testStoreFindByName(store, "Mouse", 2, "név alapján keresés");
        testStoreFindByCategory(store, "Electronics", 3, "kategória alapján keresés");
        
        // Test 4: Frissítések
        testStoreUpdateStock(store, 1, 8, true, "készlet frissítése");
        testStoreUpdatePrice(store, 2, 19.99, true, "ár frissítése");
        
        // Test 5: Statisztikák
        testStoreStatistics(store);
        
        // Test 6: Alacsony készlet
        testStoreLowStock(store, 5, 1, "alacsony készlet keresése");
        
        System.out.println();
    }

    private static void runSpeedChallenges() {
        System.out.println("3. GYORS KÓDOLÁSI KIHÍVÁSOK:");
        
        // Speed Challenge 1: FizzBuzz
        String[] fizzBuzzResult = speedFizzBuzz(15);
        String[] expectedFizzBuzz = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        testSpeedChallenge("FizzBuzz", Arrays.equals(fizzBuzzResult, expectedFizzBuzz), 
                          Arrays.toString(fizzBuzzResult), Arrays.toString(expectedFizzBuzz));
        
        // Speed Challenge 2: Palindróma
        boolean palindromeResult1 = speedIsPalindrome("racecar");
        boolean palindromeResult2 = speedIsPalindrome("hello");
        testSpeedChallenge("Palindróma racecar", palindromeResult1 == true, 
                          String.valueOf(palindromeResult1), "true");
        testSpeedChallenge("Palindróma hello", palindromeResult2 == false, 
                          String.valueOf(palindromeResult2), "false");
        
        // Speed Challenge 3: Rendezés
        int[] sortResult = speedSort(new int[]{5, 2, 8, 1, 9});
        int[] expectedSort = {1, 2, 5, 8, 9};
        testSpeedChallenge("Rendezés", Arrays.equals(sortResult, expectedSort), 
                          Arrays.toString(sortResult), Arrays.toString(expectedSort));
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testProductProperties(Product product, int expectedId, String expectedName, 
                                            String expectedCategory, double expectedPrice, int expectedStock, 
                                            String description) {
        boolean allCorrect = product.getId() == expectedId &&
                           expectedName.equals(product.getName()) &&
                           expectedCategory.equals(product.getCategory()) &&
                           Math.abs(product.getPrice() - expectedPrice) < 0.01 &&
                           product.getStock() == expectedStock;
        
        String status = allCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: id:%d név:%s kategória:%s ár:%.2f készlet:%d\n", 
                         status, description, product.getId(), product.getName(), 
                         product.getCategory(), product.getPrice(), product.getStock());
    }

    private static void testProductEquals(Product p1, Product p2, boolean expected, String description) {
        boolean result = p1.equals(p2);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, description, result, expected);
    }

    private static void testStoreAdd(Store store, Product product, boolean expected, String description) {
        boolean result = store.addProduct(product);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, description, result, expected);
    }

    private static void testStoreFindById(Store store, int id, String expectedName, String description) {
        Product result = store.findProductById(id);
        boolean isCorrect = result != null && expectedName.equals(result.getName());
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        String resultName = result != null ? result.getName() : "null";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, description, resultName, expectedName);
    }

    private static void testStoreFindByName(Store store, String name, int expectedId, String description) {
        Product result = store.findProductByName(name);
        boolean isCorrect = result != null && result.getId() == expectedId;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        int resultId = result != null ? result.getId() : -1;
        System.out.printf("   %s - %s: %d (várt: %d)\n", status, description, resultId, expectedId);
    }

    private static void testStoreFindByCategory(Store store, String category, int expectedCount, String description) {
        List<Product> result = store.findProductsByCategory(category);
        boolean isCorrect = result.size() == expectedCount;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %d termék (várt: %d)\n", status, description, result.size(), expectedCount);
    }

    private static void testStoreUpdateStock(Store store, int id, int newStock, boolean expected, String description) {
        boolean result = store.updateStock(id, newStock);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, description, result, expected);
    }

    private static void testStoreUpdatePrice(Store store, int id, double newPrice, boolean expected, String description) {
        boolean result = store.updatePrice(id, newPrice);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, description, result, expected);
    }

    private static void testStoreStatistics(Store store) {
        int count = store.getTotalProductCount();
        double avgPrice = store.getAveragePrice();
        double totalValue = store.getTotalInventoryValue();
        Product mostExpensive = store.getMostExpensiveProduct();
        
        System.out.printf("   📊 STATISZTIKÁK - termékek: %d, átlag ár: %.2f, készlet érték: %.2f\n", 
                         count, avgPrice, totalValue);
        if (mostExpensive != null) {
            System.out.printf("   📊 Legdrágább: %s (%.2f)\n", 
                             mostExpensive.getName(), mostExpensive.getPrice());
        }
    }

    private static void testStoreLowStock(Store store, int threshold, int expectedCount, String description) {
        List<Product> result = store.getLowStockProducts(threshold);
        boolean isCorrect = result.size() == expectedCount;
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %d termék (várt: %d)\n", status, description, result.size(), expectedCount);
    }

    private static void testSpeedChallenge(String challengeName, boolean isCorrect, String result, String expected) {
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", status, challengeName, result, expected);
    }
}