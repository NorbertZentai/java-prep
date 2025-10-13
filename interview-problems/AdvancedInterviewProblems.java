import java.util.*;

/**
 * Interview Problems - Haladó algoritmusok
 * 
 * Ez a fájl haladóbb interview feladatokat tartalmaz.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class AdvancedInterviewProblems {

    /**
     * 1) FELADAT: LinkedList megfordítása
     * 
     * Cél: Fordítsd meg egy egyszerű linked list-et
     * 
     * Először definiálj egy ListNode osztályt, majd implementáld a megfordítást
     */
    public static class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public static ListNode reverseLinkedList(ListNode head) {
        // TODO: Implementáld a linked list megfordítását
        return null;
    }

    /**
     * 2) FELADAT: Intervallumok összevonása (Merge Intervals)
     * 
     * Cél: Vonj össze átfedő intervallumokat
     * Bemeneti formátum: int[][] intervals ahol intervals[i] = [start, end]
     * 
     * Példa: [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]
     */
    public static int[][] mergeIntervals(int[][] intervals) {
        // TODO: Implementáld az intervallumok összevonását
        return new int[0][0];
    }

    /**
     * 3) FELADAT: Leghosszabb substring ismétlődő karakterek nélkül
     * 
     * Cél: Keresd meg a leghosszabb substring hosszát amely nem tartalmaz ismétlődő karaktereket
     * 
     * Példa: "abcabcbb" -> 3 (abc)
     * Példa: "bbbbb" -> 1 (b)
     * Példa: "pwwkew" -> 3 (wke)
     */
    public static int lengthOfLongestSubstring(String s) {
        // TODO: Implementáld a sliding window algoritmust
        return 0;
    }

    /**
     * 4) FELADAT: Két szám összege (Two Sum)
     * 
     * Cél: Keresd meg két szám indexét amelyek összege egyenlő a target-tel
     * 
     * Példa: nums = [2,7,11,15], target = 9 -> [0,1] (2 + 7 = 9)
     */
    public static int[] twoSum(int[] nums, int target) {
        // TODO: Implementáld a two sum algoritmust (HashMap használatával)
        return new int[0];
    }

    /**
     * 5) FELADAT: Érvényes Binary Search Tree ellenőrzés
     * 
     * Cél: Ellenőrizd, hogy egy binary tree érvényes BST-e
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
        }
        
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static boolean isValidBST(TreeNode root) {
        // TODO: Implementáld a BST validációt
        return true;
    }
    
    // Segéd metódus a BST validációhoz
    private static boolean validate(TreeNode node, Integer min, Integer max) {
        // TODO: Rekurzív validáció
        return true;
    }

    /**
     * 6) FELADAT: Legnagyobb téglalap területe hisztogramban
     * 
     * Cél: Keresd meg a legnagyobb téglalap területét egy hisztogramban
     * 
     * Példa: heights = [2,1,5,6,2,3] -> 10 (5*2 téglalap)
     */
    public static int largestRectangleArea(int[] heights) {
        // TODO: Implementáld stack-alapú megoldással
        return 0;
    }

    /**
     * 7) FELADAT: Minimum Window Substring
     * 
     * Cél: Keresd meg a legkisebb substring-et s-ben amely tartalmazza t összes karakterét
     * 
     * Példa: s = "ADOBECODEBANC", t = "ABC" -> "BANC"
     */
    public static String minWindow(String s, String t) {
        // TODO: Implementáld sliding window + hash map technikával
        return "";
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== HALADÓ INTERVIEW ALGORITMUSOK ===\n");
        
        runLinkedListTests();
        runMergeIntervalsTests();
        runLongestSubstringTests();
        runTwoSumTests();
        runValidBSTTests();
        runLargestRectangleTests();
        runMinWindowTests();
        
        System.out.println("\n=== HALADÓ ALGORITMUSOK BEFEJEZVE ===");
    }

    private static void runLinkedListTests() {
        System.out.println("1. LINKED LIST MEGFORDÍTÁS TESZTEK:");
        
        // Test 1: 1->2->3->null -> 3->2->1->null
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed1 = reverseLinkedList(list1);
        testLinkedList(reversed1, new int[]{3, 2, 1}, "3 elemű lista");
        
        // Test 2: 1->null -> 1->null
        ListNode list2 = new ListNode(1);
        ListNode reversed2 = reverseLinkedList(list2);
        testLinkedList(reversed2, new int[]{1}, "1 elemű lista");
        
        // Test 3: null -> null
        ListNode reversed3 = reverseLinkedList(null);
        testLinkedList(reversed3, new int[]{}, "üres lista");
        
        System.out.println();
    }

    private static void runMergeIntervalsTests() {
        System.out.println("2. INTERVALLUM ÖSSZEVONÁS TESZTEK:");
        
        // Test 1: Átfedő intervallumok
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected1 = {{1,6},{8,10},{15,18}};
        testMergeIntervals(intervals1, expected1, "átfedő intervallumok");
        
        // Test 2: Nincs átfedés
        int[][] intervals2 = {{1,4},{5,6}};
        int[][] expected2 = {{1,4},{5,6}};
        testMergeIntervals(intervals2, expected2, "nincs átfedés");
        
        System.out.println();
    }

    private static void runLongestSubstringTests() {
        System.out.println("3. LEGHOSSZABB SUBSTRING TESZTEK:");
        
        testLongestSubstring("abcabcbb", 3, "ismétlődő karakterek");
        testLongestSubstring("bbbbb", 1, "mind ugyanaz");
        testLongestSubstring("pwwkew", 3, "vegyes karakterek");
        testLongestSubstring("", 0, "üres string");
        
        System.out.println();
    }

    private static void runTwoSumTests() {
        System.out.println("4. TWO SUM TESZTEK:");
        
        testTwoSum(new int[]{2,7,11,15}, 9, new int[]{0,1}, "alapvető eset");
        testTwoSum(new int[]{3,2,4}, 6, new int[]{1,2}, "másik kombináció");
        testTwoSum(new int[]{3,3}, 6, new int[]{0,1}, "duplikátumok");
        
        System.out.println();
    }

    private static void runValidBSTTests() {
        System.out.println("5. ÉRVÉNYES BST TESZTEK:");
        
        // Test 1: Érvényes BST: 2,1,3
        TreeNode validBST = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        testValidBST(validBST, true, "érvényes BST");
        
        // Test 2: Érvénytelen BST: 5,1,4,null,null,3,6
        TreeNode invalidBST = new TreeNode(5, 
            new TreeNode(1), 
            new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        testValidBST(invalidBST, false, "érvénytelen BST");
        
        // Test 3: Null fa
        testValidBST(null, true, "null fa");
        
        System.out.println();
    }

    private static void runLargestRectangleTests() {
        System.out.println("6. LEGNAGYOBB TÉGLALAP TESZTEK:");
        
        testLargestRectangle(new int[]{2,1,5,6,2,3}, 10, "vegyes magasságok");
        testLargestRectangle(new int[]{2,4}, 4, "növekvő magasságok");
        testLargestRectangle(new int[]{1,1,1,1}, 4, "egyforma magasságok");
        
        System.out.println();
    }

    private static void runMinWindowTests() {
        System.out.println("7. MINIMUM WINDOW SUBSTRING TESZTEK:");
        
        testMinWindow("ADOBECODEBANC", "ABC", "BANC", "alapvető eset");
        testMinWindow("a", "a", "a", "egy karakter");
        testMinWindow("a", "aa", "", "lehetetlen eset");
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testLinkedList(ListNode head, int[] expected, String description) {
        List<Integer> actual = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            actual.add(current.val);
            current = current.next;
        }
        
        boolean isCorrect = actual.equals(Arrays.stream(expected).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s (várt: %s)\n", 
                         status, description, actual, Arrays.toString(expected));
    }

    private static void testMergeIntervals(int[][] intervals, int[][] expected, String description) {
        int[][] result = mergeIntervals(intervals);
        boolean isCorrect = Arrays.deepEquals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %s (várt: %s)\n", 
                         status, description, Arrays.deepToString(intervals), 
                         Arrays.deepToString(result), Arrays.deepToString(expected));
    }

    private static void testLongestSubstring(String input, int expected, String description) {
        int result = lengthOfLongestSubstring(input);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: '%s' -> %d (várt: %d)\n", 
                         status, description, input, result, expected);
    }

    private static void testTwoSum(int[] nums, int target, int[] expected, String description) {
        int[] result = twoSum(nums, target);
        Arrays.sort(result); // Rendezés az összehasonlításhoz
        Arrays.sort(expected);
        boolean isCorrect = Arrays.equals(result, expected);
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s, target=%d -> %s (várt: %s)\n", 
                         status, description, Arrays.toString(nums), target,
                         Arrays.toString(result), Arrays.toString(expected));
    }

    private static void testValidBST(TreeNode root, boolean expected, String description) {
        boolean result = isValidBST(root);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: -> %s (várt: %s)\n", 
                         status, description, result, expected);
    }

    private static void testLargestRectangle(int[] heights, int expected, String description) {
        int result = largestRectangleArea(heights);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: %s -> %d (várt: %d)\n", 
                         status, description, Arrays.toString(heights), result, expected);
    }

    private static void testMinWindow(String s, String t, String expected, String description) {
        String result = minWindow(s, t);
        String status = result.equals(expected) ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: s='%s', t='%s' -> '%s' (várt: '%s')\n", 
                         status, description, s, t, result, expected);
    }
}