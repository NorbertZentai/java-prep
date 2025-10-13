import java.util.*;

/**
 * Day 3 - OOP alapok (Osztályok és metódusok)
 * 
 * Ez a fájl objektum-orientált programozás alapjait gyakorolja.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class OOPBasics {

    /**
     * 1) FELADAT: Book osztály létrehozása
     * 
     * Cél: Hozz létre egy Book osztályt a következő tulajdonságokkal:
     * - title (String)
     * - author (String) 
     * - price (double)
     * - pages (int)
     * 
     * Követelmények:
     * - Konstruktor az összes mezőhöz
     * - Getter metódusok
     * - toString metódus
     */
    public static class Book {
        // TODO: Implementáld itt a Book osztályt
        
        public Book(String title, String author, double price, int pages) {
            // TODO: Konstruktor implementálása
        }
        
        // TODO: Getter metódusok
        public String getTitle() { return null; }
        public String getAuthor() { return null; }
        public double getPrice() { return 0.0; }
        public int getPages() { return 0; }
        
        @Override
        public String toString() {
            // TODO: toString implementálása
            return "";
        }
    }

    /**
     * 2) FELADAT: Library osztály létrehozása
     * 
     * Cél: Hozz létre egy Library osztályt amely kezeli a könyveket
     * 
     * Követelmények:
     * - Tárolja a könyveket List<Book>-ban
     * - addBook(Book book) metódus
     * - findBooksByAuthor(String author) metódus
     * - getTotalPrice() metódus
     * - getBookCount() metódus
     */
    public static class Library {
        // TODO: Implementáld itt a Library osztályt
        
        public Library() {
            // TODO: Konstruktor implementálása
        }
        
        public void addBook(Book book) {
            // TODO: Könyv hozzáadása
        }
        
        public List<Book> findBooksByAuthor(String author) {
            // TODO: Szerző alapján keresés
            return new ArrayList<>();
        }
        
        public double getTotalPrice() {
            // TODO: Összes könyv árának összege
            return 0.0;
        }
        
        public int getBookCount() {
            // TODO: Könyvek számának visszaadása
            return 0;
        }
        
        public List<Book> getAllBooks() {
            // TODO: Összes könyv visszaadása
            return new ArrayList<>();
        }
    }

    /**
     * 3) FELADAT: Student osztály létrehozása
     * 
     * Cél: Hozz létre egy Student osztályt jegyek kezelésére
     * 
     * Követelmények:
     * - name (String)
     * - grades (List<Integer>)
     * - addGrade(int grade) metódus
     * - getAverage() metódus
     * - getGradeCount() metódus
     */
    public static class Student {
        // TODO: Implementáld itt a Student osztályt
        
        public Student(String name) {
            // TODO: Konstruktor implementálása
        }
        
        public String getName() { return null; }
        
        public void addGrade(int grade) {
            // TODO: Jegy hozzáadása (1-5 között)
        }
        
        public double getAverage() {
            // TODO: Átlag számítása
            return 0.0;
        }
        
        public int getGradeCount() {
            // TODO: Jegyek számának visszaadása
            return 0;
        }
        
        public List<Integer> getGrades() {
            // TODO: Összes jegy visszaadása
            return new ArrayList<>();
        }
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== OOP ALAPOK TESZTEK ===\n");
        
        runBookTests();
        runLibraryTests();
        runStudentTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runBookTests() {
        System.out.println("1. BOOK OSZTÁLY TESZTEK:");
        
        // Test 1: Konstruktor és getterek
        Book book = new Book("1984", "George Orwell", 2500.0, 328);
        testBookProperties(book, "1984", "George Orwell", 2500.0, 328, "konstruktor és getterek");
        
        // Test 2: toString nem üres
        String toStringResult = book.toString();
        boolean toStringWorks = toStringResult != null && !toStringResult.isEmpty() && !toStringResult.equals("");
        System.out.printf("   %s - toString működik: '%s'\n", 
                         toStringWorks ? "✅ PASS" : "❌ FAIL", toStringResult);
        
        System.out.println();
    }

    private static void runLibraryTests() {
        System.out.println("2. LIBRARY OSZTÁLY TESZTEK:");
        
        Library library = new Library();
        
        // Test 1: Üres könyvtár
        testLibraryState(library, 0, 0.0, "üres könyvtár");
        
        // Test 2: Könyvek hozzáadása
        Book book1 = new Book("1984", "George Orwell", 2500.0, 328);
        Book book2 = new Book("Animal Farm", "George Orwell", 2200.0, 112);
        Book book3 = new Book("Brave New World", "Aldous Huxley", 2800.0, 268);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        testLibraryState(library, 3, 7500.0, "3 könyv hozzáadása után");
        
        // Test 3: Keresés szerző alapján
        List<Book> orwellBooks = library.findBooksByAuthor("George Orwell");
        testAuthorSearch(orwellBooks, 2, "George Orwell könyvek keresése");
        
        List<Book> huxleyBooks = library.findBooksByAuthor("Aldous Huxley");
        testAuthorSearch(huxleyBooks, 1, "Aldous Huxley könyvek keresése");
        
        List<Book> notFound = library.findBooksByAuthor("Unknown Author");
        testAuthorSearch(notFound, 0, "nem létező szerző keresése");
        
        System.out.println();
    }

    private static void runStudentTests() {
        System.out.println("3. STUDENT OSZTÁLY TESZTEK:");
        
        Student student = new Student("Kovács János");
        
        // Test 1: Új diák
        testStudentState(student, "Kovács János", 0, 0.0, "új diák");
        
        // Test 2: Jegyek hozzáadása
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(3);
        student.addGrade(5);
        
        testStudentState(student, "Kovács János", 4, 4.25, "jegyek hozzáadása után");
        
        // Test 3: További jegyek
        student.addGrade(2);
        student.addGrade(4);
        
        testStudentState(student, "Kovács János", 6, 3.83, "további jegyek után");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testBookProperties(Book book, String expectedTitle, String expectedAuthor, 
                                         double expectedPrice, int expectedPages, String description) {
        boolean titleOk = expectedTitle.equals(book.getTitle());
        boolean authorOk = expectedAuthor.equals(book.getAuthor());
        boolean priceOk = Math.abs(book.getPrice() - expectedPrice) < 0.01;
        boolean pagesOk = book.getPages() == expectedPages;
        
        boolean allOk = titleOk && authorOk && priceOk && pagesOk;
        String status = allOk ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: title:%s author:%s price:%.0f pages:%d\n", 
                         status, description, book.getTitle(), book.getAuthor(), 
                         book.getPrice(), book.getPages());
    }

    private static void testLibraryState(Library library, int expectedCount, double expectedTotal, String description) {
        int count = library.getBookCount();
        double total = library.getTotalPrice();
        
        boolean countOk = count == expectedCount;
        boolean totalOk = Math.abs(total - expectedTotal) < 0.01;
        boolean allOk = countOk && totalOk;
        
        String status = allOk ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: könyvek száma:%d össz ár:%.0f\n", 
                         status, description, count, total);
    }

    private static void testAuthorSearch(List<Book> books, int expectedCount, String description) {
        int count = books.size();
        boolean isCorrect = count == expectedCount;
        
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: találatok száma:%d (várt:%d)\n", 
                         status, description, count, expectedCount);
    }

    private static void testStudentState(Student student, String expectedName, int expectedGradeCount, 
                                       double expectedAverage, String description) {
        String name = student.getName();
        int gradeCount = student.getGradeCount();
        double average = student.getAverage();
        
        boolean nameOk = expectedName.equals(name);
        boolean countOk = gradeCount == expectedGradeCount;
        boolean avgOk = Math.abs(average - expectedAverage) < 0.01;
        boolean allOk = nameOk && countOk && avgOk;
        
        String status = allOk ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: név:%s jegyek száma:%d átlag:%.2f\n", 
                         status, description, name, gradeCount, average);
    }
}