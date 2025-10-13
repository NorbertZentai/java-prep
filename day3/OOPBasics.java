import java.util.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.nio.file.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/**
 * Day 3 - Object-Oriented Programming Basics
 * 
 * This file practices the basics of object-oriented programming.
 * Complete all exercises and verify your solutions using the tests at the end.
 */

public class OOPBasics {

    /**
     * 1) TASK: Create Book Class
     * 
     * Goal: Create a Book class with the following properties:
     * - title (String)
     * - author (String) 
     * - price (double)
     * - pages (int)
     * 
     * Requirements:
     * - Private fields for title, author, price, pages
     * - Constructor with all parameters
     * - Getters for all fields (no setters needed)
     * - toString() method for nice output
     */
    public static class Book {
        // TODO: Implement the Book class here
        
        public Book(String title, String author, double price, int pages) {
            // TODO: Implement constructor
        }
        
        // TODO: Getter methods
        public String getTitle() { return null; }
        public String getAuthor() { return null; }
        public double getPrice() { return 0.0; }
        public int getPages() { return 0; }
        
        @Override
        public String toString() {
            // TODO: Implement toString
            return "";
        }
    }

    /**
     * 2) TASK: Create Library Class
     * 
     * Goal: Create a Library class that manages books
     * 
     * Követelmények:
     * - Store books in List<Book>
     * - addBook(Book book) method
     * - findBooksByAuthor(String author) method
     * - getTotalPrice() method
     * - getBookCount() method
     */
    public static class Library {
        // TODO: Implement the Library class here
        
        public Library() {
            // TODO: Implement constructor
        }
        
        public void addBook(Book book) {
            // TODO: Add book
        }
        
        public List<Book> findBooksByAuthor(String author) {
            // TODO: Search by author
            return new ArrayList<>();
        }
        
        public double getTotalPrice() {
            // TODO: Sum of all book prices
            return 0.0;
        }
        
        public int getBookCount() {
            // TODO: Return number of books
            return 0;
        }
        
        public List<Book> getAllBooks() {
            // TODO: Return all books
            return new ArrayList<>();
        }
    }

    /**
     * 3) TASK: Create Student Class
     * 
     * Goal: Create a Student class for managing grades
     * 
     * Követelmények:
     * - name (String)
     * - grades (List<Integer>)
     * - addGrade(int grade) method
     * - getAverage() method
     * - getGradeCount() method
     */
    public static class Student {
        // TODO: Implement the Student class here
        
        public Student(String name) {
            // TODO: Implement constructor
        }
        
        public String getName() { return null; }
        
        public void addGrade(int grade) {
            // TODO: Add grade (between 1-5)
        }
        
        public double getAverage() {
            // TODO: Calculate average
            return 0.0;
        }
        
        public int getGradeCount() {
            // TODO: Return number of grades
            return 0;
        }
        
        public List<Integer> getGrades() {
            // TODO: Return all grades
            return new ArrayList<>();
        }
    }

    // ===============================
    // TESTS - Don't modify these!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== OOP BASICS TESTS ===\n");
        
        runBookTests();
        runLibraryTests();
        runStudentTests();
        
        System.out.println("\n=== TESTS COMPLETED ===");
    }

    private static void runBookTests() {
        System.out.println("1. BOOK CLASS TESTS:");
        
        // Test 1: Konstruktor és getterek
        Book book = new Book("1984", "George Orwell", 2500.0, 328);
        testBookProperties(book, "1984", "George Orwell", 2500.0, 328, "constructor and getters");
        
        // Test 2: toString nem üres
        String toStringResult = book.toString();
        boolean toStringWorks = toStringResult != null && !toStringResult.isEmpty() && !toStringResult.equals("");
        System.out.printf("   %s - toString works: '%s'\n", 
                         toStringWorks ? "✅ PASS" : "❌ FAIL", toStringResult);
        
        System.out.println();
    }

    private static void runLibraryTests() {
        System.out.println("2. LIBRARY CLASS TESTS:");
        
        Library library = new Library();
        
        // Test 1: Üres könyvtár
        testLibraryState(library, 0, 0.0, "empty library");
        
        // Test 2: Könyvek hozzáadása
        Book book1 = new Book("1984", "George Orwell", 2500.0, 328);
        Book book2 = new Book("Animal Farm", "George Orwell", 2200.0, 112);
        Book book3 = new Book("Brave New World", "Aldous Huxley", 2800.0, 268);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        testLibraryState(library, 3, 7500.0, "after adding 3 books");
        
        // Test 3: Keresés szerző alapján
        List<Book> orwellBooks = library.findBooksByAuthor("George Orwell");
        testAuthorSearch(orwellBooks, 2, "George Orwell books search");
        
        List<Book> huxleyBooks = library.findBooksByAuthor("Aldous Huxley");
        testAuthorSearch(huxleyBooks, 1, "Aldous Huxley books search");
        
        List<Book> notFound = library.findBooksByAuthor("Unknown Author");
        testAuthorSearch(notFound, 0, "unknown author search");
        
        System.out.println();
    }

    private static void runStudentTests() {
        System.out.println("3. STUDENT CLASS TESTS:");
        
        Student student = new Student("Kovács János");
        
        // Test 1: Új diák
        testStudentState(student, "Kovács János", 0, 0.0, "new student");
        
        // Test 2: Jegyek hozzáadása
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(3);
        student.addGrade(5);
        
        testStudentState(student, "Kovács János", 4, 4.25, "after adding grades");
        
        // Test 3: További jegyek
        student.addGrade(2);
        student.addGrade(4);
        
        testStudentState(student, "Kovács János", 6, 3.83, "after additional grades");
        
        System.out.println();
    }

    // Helper methods for testing
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
        System.out.printf("   %s - %s: book count:%d total price:%.0f\n", 
                         status, description, count, total);
    }

    private static void testAuthorSearch(List<Book> books, int expectedCount, String description) {
        int count = books.size();
        boolean isCorrect = count == expectedCount;
        
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: found:%d (expected:%d)\n", 
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
        System.out.printf("   %s - %s: name:%s grade count:%d average:%.2f\n", 
                         status, description, name, gradeCount, average);
    }
}