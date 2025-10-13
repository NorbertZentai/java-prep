import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * JavaPracticeProject - Java practice project organization
 * 
 * This class helps with organizing Java learning, tracking progress
 * and managing interview preparation.
 */
public class JavaPracticeProject {

    /**
     * TASK 1: Daily Routine Tracker
     * Goal: Daily task organization and tracking
     */
    public static class DailyRoutineTracker {
        private Map<LocalDate, List<String>> dailyTasks;

        public DailyRoutineTracker() {
            this.dailyTasks = new HashMap<>();
        }

        /**
         * Add task to given date
         */
        public void addTask(LocalDate date, String task) {
            dailyTasks.computeIfAbsent(date, k -> new ArrayList<>()).add(task);
        }

        /**
         * Get tasks for given date
         */
        public List<String> getTasksForDate(LocalDate date) {
            return dailyTasks.getOrDefault(date, new ArrayList<>());
        }

        /**
         * Get total task count
         */
        public int getTotalTaskCount() {
            return dailyTasks.values().stream()
                    .mapToInt(List::size)
                    .sum();
        }

        /**
         * Print today's tasks
         */
        public void printTodaysTasks() {
            LocalDate today = LocalDate.now();
            List<String> tasks = getTasksForDate(today);
            System.out.println("=== Today's tasks (" + today + ") ===");
            if (tasks.isEmpty()) {
                System.out.println("No tasks for today.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }
    }

    /**
     * TASK 2: Study topics enumeration
     * Goal: Structured handling of Java study topics
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
         * Get topics for given day
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
     * TASK 3: Learning statistics tracking
     * Goal: Progress measurement and analysis
     */
    public static class LearningStatistics {
        private Map<StudyTopic, Integer> topicProgress;

        public LearningStatistics() {
            this.topicProgress = new HashMap<>();
        }

        /**
         * Record progress in a topic (percentage)
         */
        public void recordProgress(StudyTopic topic, int progressPercent) {
            if (progressPercent < 0 || progressPercent > 100) {
                throw new IllegalArgumentException("Progress must be between 0-100!");
            }
            topicProgress.merge(topic, progressPercent, Integer::sum);
        }

        /**
         * Total progress summary
         */
        public int getTotalProgress() {
            return topicProgress.values().stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        /**
         * Determine best topic
         */
        public StudyTopic getBestTopic() {
            return topicProgress.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse(null);
        }

        /**
         * Calculate average progress
         */
        public double getAverageProgress() {
            if (topicProgress.isEmpty()) {
                return 0.0;
            }
            return (double) getTotalProgress() / topicProgress.size();
        }

        /**
         * Print progress report
         */
        public void printProgressReport() {
            System.out.println("=== LEARNING PROGRESS REPORT ===");
            if (topicProgress.isEmpty()) {
                System.out.println("No progress recorded yet.");
                return;
            }

            topicProgress.entrySet().stream()
                    .sorted(Map.Entry.<StudyTopic, Integer>comparingByValue().reversed())
                    .forEach(entry -> 
                        System.out.printf("%s: %d%%\n", 
                            entry.getKey().getDescription(), entry.getValue())
                    );

            System.out.printf("\nTotal progress: %d points\n", getTotalProgress());
            System.out.printf("Average progress: %.2f%%\n", getAverageProgress());
            StudyTopic best = getBestTopic();
            if (best != null) {
                System.out.printf("Best topic: %s\n", best.getDescription());
            }
        }
    }

    /**
     * TASK 4: Interview preparation manager
     * Goal: Programming interview problems tracking
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
         * Mark problem as solved
         */
        public void markAsSolved(String problemName) {
            if (allProblems.contains(problemName)) {
                solvedProblems.add(problemName);
            }
        }

        /**
         * List of remaining problems
         */
        public List<String> getRemainingProblems() {
            return allProblems.stream()
                    .filter(problem -> !solvedProblems.contains(problem))
                    .collect(Collectors.toList());
        }

        /**
         * Completion percentage
         */
        public double getCompletionPercentage() {
            if (allProblems.isEmpty()) {
                return 0.0;
            }
            return (double) solvedProblems.size() / allProblems.size() * 100;
        }

        /**
         * Next problem suggestion
         */
        public String getNextProblemSuggestion() {
            List<String> remaining = getRemainingProblems();
            return remaining.isEmpty() ? "All problems completed!" : remaining.get(0);
        }

        /**
         * Interview preparation report
         */
        public void printPreparationStatus() {
            System.out.println("=== INTERVIEW PREPARATION STATUS ===");
            System.out.printf("Completed: %d/%d (%.1f%%)\n", 
                solvedProblems.size(), allProblems.size(), getCompletionPercentage());
            
            System.out.println("\nSolved problems:");
            solvedProblems.forEach(problem -> System.out.println("✓ " + problem));
            
            System.out.println("\nRemaining problems:");
            getRemainingProblems().forEach(problem -> System.out.println("○ " + problem));
            
            if (!getRemainingProblems().isEmpty()) {
                System.out.println("\nNext recommended: " + getNextProblemSuggestion());
            }
        }
    }

    /**
     * MAIN PROGRAM - Project demo and testing
     */
    public static void main(String[] args) {
        System.out.println("=== JAVA PRACTICE PROJECT DEMO ===\n");

        // 1. Daily routine tracker demo
        System.out.println("1. DAILY TASK TRACKER:");
        DailyRoutineTracker tracker = new DailyRoutineTracker();
        LocalDate today = LocalDate.now();
        
        tracker.addTask(today, "Java basics practice");
        tracker.addTask(today, "Write tests");
        tracker.addTask(today, "Code review");
        tracker.addTask(today.plusDays(1), "Learn algorithms");
        
        tracker.printTodaysTasks();
        System.out.println("Total tasks: " + tracker.getTotalTaskCount() + "\n");

        // 2. Study topics demo
        System.out.println("2. STUDY TOPICS:");
        System.out.println("Day 1 topics:");
        StudyTopic.getTopicsForDay(1).forEach(System.out::println);
        
        System.out.println("All topics:");
        Arrays.stream(StudyTopic.values())
              .forEach(topic -> System.out.println(topic));
        System.out.println();

        // 3. Progress statistics demo
        System.out.println("3. LEARNING STATISTICS:");
        LearningStatistics stats = new LearningStatistics();
        stats.recordProgress(StudyTopic.CORE_JAVA, 85);
        stats.recordProgress(StudyTopic.OOP, 92);
        stats.recordProgress(StudyTopic.COLLECTIONS, 78);
        stats.recordProgress(StudyTopic.STREAMS, 65);
        
        stats.printProgressReport();
        System.out.println();

        // 4. Interview preparation demo
        System.out.println("4. INTERVIEW PREPARATION:");
        InterviewPreparation prep = new InterviewPreparation();
        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");
        prep.markAsSolved("Swap Without Temp");
        
        prep.printPreparationStatus();
    }
}