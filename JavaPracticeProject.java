import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * JavaPracticeProject - Java gyakorló projekt szervezés
 * 
 * Ez az osztály segít a Java tanulás szervezésében, haladás követésében
 * és interview felkészülés menedzselésében.
 */
public class JavaPracticeProject {

    /**
     * FELADAT 1: Napi rutin követő (Daily Routine Tracker)
     * Cél: Napi feladatok szervezése és követése
     */
    public static class DailyRoutineTracker {
        private Map<LocalDate, List<String>> dailyTasks;

        public DailyRoutineTracker() {
            this.dailyTasks = new HashMap<>();
        }

        /**
         * Feladat hozzáadása adott naphoz
         */
        public void addTask(LocalDate date, String task) {
            dailyTasks.computeIfAbsent(date, k -> new ArrayList<>()).add(task);
        }

        /**
         * Adott nap feladatainak lekérése
         */
        public List<String> getTasksForDate(LocalDate date) {
            return dailyTasks.getOrDefault(date, new ArrayList<>());
        }

        /**
         * Összes feladat számának lekérése
         */
        public int getTotalTaskCount() {
            return dailyTasks.values().stream()
                    .mapToInt(List::size)
                    .sum();
        }

        /**
         * Mai feladatok kiírása
         */
        public void printTodaysTasks() {
            LocalDate today = LocalDate.now();
            List<String> tasks = getTasksForDate(today);
            System.out.println("=== Mai feladatok (" + today + ") ===");
            if (tasks.isEmpty()) {
                System.out.println("Nincsenek feladatok ma.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }
    }

    /**
     * FELADAT 2: Tanulási témák enumeráció
     * Cél: Java tanulási témák strukturált kezelése
     */
    public enum StudyTopic {
        CORE_JAVA("Core Java", 1),
        OOP("Object Oriented Programming", 3),
        COLLECTIONS("Collections Framework", 2),
        STREAMS("Streams and Lambda", 4),
        EXCEPTIONS("Exception Handling", 5),
        IO_FILES("File I/O Operations", 5),
        ALGORITHMS("Algorithms & Data Structures", 4),
        TESTING("Unit Testing", 6),
        INTERVIEW("Interview Problems", 0);

        private final String description;
        private final int day;

        StudyTopic(String description, int day) {
            this.description = description;
            this.day = day;
        }

        public String getDescription() {
            return description;
        }

        public int getDay() {
            return day;
        }

        /**
         * Adott naphoz tartozó témák lekérése
         */
        public static List<StudyTopic> getTopicsForDay(int day) {
            return Arrays.stream(StudyTopic.values())
                    .filter(topic -> topic.getDay() == day)
                    .collect(Collectors.toList());
        }

        @Override
        public String toString() {
            return String.format("Day %d: %s", day, description);
        }
    }

    /**
     * FELADAT 3: Tanulási statisztikák követése
     * Cél: Haladás mérése és elemzése
     */
    public static class LearningStatistics {
        private Map<StudyTopic, Integer> topicProgress;

        public LearningStatistics() {
            this.topicProgress = new HashMap<>();
        }

        /**
         * Haladás rögzítése egy témában (százalék)
         */
        public void recordProgress(StudyTopic topic, int progressPercent) {
            if (progressPercent < 0 || progressPercent > 100) {
                throw new IllegalArgumentException("A haladás 0-100 között kell legyen!");
            }
            topicProgress.merge(topic, progressPercent, Integer::sum);
        }

        /**
         * Összes haladás összesítése
         */
        public int getTotalProgress() {
            return topicProgress.values().stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        /**
         * Legjobb téma meghatározása
         */
        public StudyTopic getBestTopic() {
            return topicProgress.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse(null);
        }

        /**
         * Átlagos haladás számítása
         */
        public double getAverageProgress() {
            if (topicProgress.isEmpty()) {
                return 0.0;
            }
            return (double) getTotalProgress() / topicProgress.size();
        }

        /**
         * Haladási jelentés kiírása
         */
        public void printProgressReport() {
            System.out.println("=== TANULÁSI HALADÁS JELENTÉS ===");
            if (topicProgress.isEmpty()) {
                System.out.println("Még nincs rögzített haladás.");
                return;
            }

            topicProgress.entrySet().stream()
                    .sorted(Map.Entry.<StudyTopic, Integer>comparingByValue().reversed())
                    .forEach(entry -> 
                        System.out.printf("%s: %d%%\n", 
                            entry.getKey().getDescription(), entry.getValue())
                    );

            System.out.printf("\nÖsszes haladás: %d pont\n", getTotalProgress());
            System.out.printf("Átlagos haladás: %.2f%%\n", getAverageProgress());
            StudyTopic best = getBestTopic();
            if (best != null) {
                System.out.printf("Legjobb téma: %s\n", best.getDescription());
            }
        }
    }

    /**
     * FELADAT 4: Interview felkészülés kezelő
     * Cél: Programozó interview feladatok nyomon követése
     */
    public static class InterviewPreparation {
        private Set<String> solvedProblems;
        private final List<String> allProblems;

        public InterviewPreparation() {
            this.solvedProblems = new HashSet<>();
            this.allProblems = Arrays.asList(
                "FizzBuzz",
                "Missing Number",
                "Detect Duplicate", 
                "Swap Without Temp",
                "Reverse LinkedList",
                "Merge Intervals",
                "Balanced Parentheses"
            );
        }

        /**
         * Feladat megoldottnak jelölése
         */
        public void markAsSolved(String problemName) {
            if (allProblems.contains(problemName)) {
                solvedProblems.add(problemName);
            }
        }

        /**
         * Hátralevő feladatok listája
         */
        public List<String> getRemainingProblems() {
            return allProblems.stream()
                    .filter(problem -> !solvedProblems.contains(problem))
                    .collect(Collectors.toList());
        }

        /**
         * Befejezettségi százalék
         */
        public double getCompletionPercentage() {
            if (allProblems.isEmpty()) {
                return 0.0;
            }
            return (double) solvedProblems.size() / allProblems.size() * 100;
        }

        /**
         * Következő feladat javaslat
         */
        public String getNextProblemSuggestion() {
            List<String> remaining = getRemainingProblems();
            return remaining.isEmpty() ? "Minden feladat kész!" : remaining.get(0);
        }

        /**
         * Interview felkészültség jelentés
         */
        public void printPreparationStatus() {
            System.out.println("=== INTERVIEW FELKÉSZÜLÉS ÁLLAPOT ===");
            System.out.printf("Befejezett: %d/%d (%.1f%%)\n", 
                solvedProblems.size(), allProblems.size(), getCompletionPercentage());
            
            System.out.println("\nMegoldott feladatok:");
            solvedProblems.forEach(problem -> System.out.println("✓ " + problem));
            
            System.out.println("\nHátralevő feladatok:");
            getRemainingProblems().forEach(problem -> System.out.println("○ " + problem));
            
            if (!getRemainingProblems().isEmpty()) {
                System.out.println("\nKövetkező ajánlott: " + getNextProblemSuggestion());
            }
        }
    }

    /**
     * FŐPROGRAM - Projekt demo és tesztelés
     */
    public static void main(String[] args) {
        System.out.println("=== JAVA GYAKORLÓ PROJEKT DEMO ===\n");

        // 1. Napi rutin tracker demo
        System.out.println("1. NAPI FELADAT TRACKER:");
        DailyRoutineTracker tracker = new DailyRoutineTracker();
        LocalDate today = LocalDate.now();
        
        tracker.addTask(today, "Java alapok gyakorlása");
        tracker.addTask(today, "Tesztek írása");
        tracker.addTask(today, "Kód review");
        tracker.addTask(today.plusDays(1), "Algoritmusok tanulása");
        
        tracker.printTodaysTasks();
        System.out.println("Összes feladat: " + tracker.getTotalTaskCount() + "\n");

        // 2. Tanulási témák demo
        System.out.println("2. TANULÁSI TÉMÁK:");
        System.out.println("1. napi témák:");
        StudyTopic.getTopicsForDay(1).forEach(System.out::println);
        
        System.out.println("Összes téma:");
        Arrays.stream(StudyTopic.values())
              .forEach(topic -> System.out.println(topic));
        System.out.println();

        // 3. Haladás statisztikák demo
        System.out.println("3. TANULÁSI STATISZTIKÁK:");
        LearningStatistics stats = new LearningStatistics();
        stats.recordProgress(StudyTopic.CORE_JAVA, 85);
        stats.recordProgress(StudyTopic.OOP, 92);
        stats.recordProgress(StudyTopic.COLLECTIONS, 78);
        stats.recordProgress(StudyTopic.STREAMS, 65);
        
        stats.printProgressReport();
        System.out.println();

        // 4. Interview felkészülés demo
        System.out.println("4. INTERVIEW FELKÉSZÜLÉS:");
        InterviewPreparation prep = new InterviewPreparation();
        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");
        prep.markAsSolved("Swap Without Temp");
        
        prep.printPreparationStatus();
    }
}