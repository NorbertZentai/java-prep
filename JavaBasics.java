/**
 * JavaBasics - Gyakorló feladatok alapvető Java dolgokhoz
 * 
 * Ez a fájl alapvető Java szintaxis, ciklusok és egyszerű algoritmusok gyakorlását szolgálja.
 * Minden feladat tartalmaz leírást, példát és tesztelési lehetőségeket.
 */

import java.util.*;
import java.util.stream.*;

public class JavaBasics {

    /**
     * FELADAT 1: Számok maximuma
     * Cél: Adja vissza a legnagyobb számot egy tömbből
     * Követelmények: Kezelje a negatív számokat is, nem üres tömb
     */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("A tömb nem lehet üres vagy null!");
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * FELADAT 2: String megfordítása
     * Cél: Fordítsa meg a bemeneti stringet
     * Követelmények: Kezelje az üres és egykarkakteres stringeket
     */
    public static String reverseString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * FELADAT 3: Magánhangzók számolása
     * Cél: Számolja meg a magánhangzókat egy szóban
     * Követelmények: Nem érzékeny a kis/nagybetűkre, csak a e i o u
     */
    public static int countVowels(String word) {
        if (word == null) {
            return 0;
        }
        
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * FELADAT 4: Számok cseréje
     * Cél: Cserélje meg két szám értékét
     * Variánsok: segédváltozóval és anélkül
     */
    public static int[] swapNumbers(int a, int b) {
        // Segédváltozóval
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
    
    public static int[] swapNumbersWithoutTemp(int a, int b) {
        // Aritmetikai módszer
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    /**
     * FELADAT 5: Palindróma ellenőrzés
     * Cél: Ellenőrizze, hogy egy string palindróma-e
     * Követelmények: Nem érzékeny a kis/nagybetűkre
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        
        String cleaned = input.toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * FELADAT 6: Tömbműveletek
     * Cél: Alapműveletek: összeg, átlag, min/max
     */
    public static int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
    
    public static double average(int[] numbers) {
        if (numbers.length == 0) return 0;
        return (double) sum(numbers) / numbers.length;
    }
    
    public static int min(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }

    /**
     * FELADAT 7: Duplikátumok eltávolítása
     * Cél: Egyedi elemek visszaadása egy tömbből
     */
    public static int[] removeDuplicates(int[] numbers) {
        return Arrays.stream(numbers)
                    .distinct()
                    .toArray();
    }

    /**
     * FELADAT 8: Második legnagyobb szám
     * Cél: Adja vissza a második legnagyobb számot
     */
    public static int secondLargest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Legalább 2 elem szükséges!");
        }
        
        int[] uniqueSorted = Arrays.stream(numbers)
                                  .distinct()
                                  .sorted()
                                  .toArray();
        
        if (uniqueSorted.length < 2) {
            throw new IllegalArgumentException("Nincs második legnagyobb elem!");
        }
        
        return uniqueSorted[uniqueSorted.length - 2];
    }

    /**
     * FELADAT 9: FizzBuzz játék
     * Cél: 1-től n-ig számolva, 3-mal oszthatóknál "Fizz", 
     *      5-tel oszthatóknál "Buzz", mindkettővel "FizzBuzz"
     */
    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }

    /**
     * FELADAT 10: Faktoriális számítás
     * Cél: Számítsa ki n! értékét rekurzívan és iteratívan
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív számnak nincs faktoriálisa!");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív számnak nincs faktoriálisa!");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * FELADAT 11: Fibonacci sorozat
     * Cél: Adja vissza az első n Fibonacci számot
     */
    public static int[] fibonacciSequence(int n) {
        if (n <= 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[]{0};
        }
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /**
     * FELADAT 12: Prímszám ellenőrzés
     * Cél: Ellenőrizze, hogy egy szám prím-e
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * FŐPROGRAM - Teszteléshez és demónstrációhoz
     */
    public static void main(String[] args) {
        System.out.println("=== JAVA ALAPOK GYAKORLÓ FELADATOK ===\n");
        
        // 1. Maximumkeresés tesztelése
        int[] testNumbers = {3, 7, 2, 9, 1, 5};
        System.out.println("1. Maximum keresés:");
        System.out.println("Tömb: " + Arrays.toString(testNumbers));
        System.out.println("Maximum: " + findMax(testNumbers) + "\n");
        
        // 2. String megfordítás
        String testString = "hello";
        System.out.println("2. String megfordítás:");
        System.out.println("Eredeti: " + testString);
        System.out.println("Megfordítva: " + reverseString(testString) + "\n");
        
        // 3. Magánhangzók számolása
        String testWord = "programming";
        System.out.println("3. Magánhangzók számolása:");
        System.out.println("Szó: " + testWord);
        System.out.println("Magánhangzók száma: " + countVowels(testWord) + "\n");
        
        // 4. Palindróma ellenőrzés
        String[] testPalindromes = {"racecar", "hello", "madam"};
        System.out.println("4. Palindróma ellenőrzés:");
        for (String word : testPalindromes) {
            System.out.println(word + " palindróma? " + isPalindrome(word));
        }
        System.out.println();
        
        // 5. FizzBuzz
        System.out.println("5. FizzBuzz 1-től 15-ig:");
        String[] fizzBuzzResult = fizzBuzz(15);
        System.out.println(Arrays.toString(fizzBuzzResult) + "\n");
        
        // 6. Faktoriális
        int factNum = 5;
        System.out.println("6. Faktoriális számítás:");
        System.out.println(factNum + "! = " + factorialRecursive(factNum) + " (rekurzív)");
        System.out.println(factNum + "! = " + factorialIterative(factNum) + " (iteratív)\n");
        
        // 7. Fibonacci
        System.out.println("7. Fibonacci sorozat (első 10 szám):");
        int[] fibSeq = fibonacciSequence(10);
        System.out.println(Arrays.toString(fibSeq) + "\n");
        
        // 8. Prímszám ellenőrzés
        int[] primeTests = {2, 3, 4, 17, 25, 29};
        System.out.println("8. Prímszám ellenőrzés:");
        for (int num : primeTests) {
            System.out.println(num + " prím? " + isPrime(num));
        }
    }
}
