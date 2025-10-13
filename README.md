/**
 * JavaPracticeProject - 7-day Java practice project + interview problems
 * 
 * Goal: Preparation for 1-1.5 hour Java coding tests
 * Minero Gloster style: clean OOP code, Collections, Streams, problem solving
 * 
 * Project structure:
 * - JavaBasics.java - Basic exercises and tests
 * - CollectionsAndAlgorithms.java - Collections and algorithms
 * - OOPExercises.java - Object-oriented programming
 * - StreamsAndLambdas.java - Stream API and lambda expressions
 * - ExceptionHandling.java - Exception handling and file I/O
 * - TestingAndCleanCode.java - Testing and clean code
 * - InterviewProblems.java - Common interview problems
 */

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.io.*;

public class JavaPracticeProject {
    
    /**
     * DAILY ROUTINE AND SCHEDULE
     * 
     * Week overview:
     * Day 1 - Basics: syntax, loops, functions
     * Day 2 - Arrays and Collections: array, List/Map, sorting
     * Day 3 - OOP basics: classes, inheritance, polymorphism
     * Day 4 - Streams and Algorithms: Stream API, lambda, search/sort
     * Day 5 - Exceptions and File I/O: try-catch, custom exceptions, file handling
     * Day 6 - Testing and Clean Code: JUnit, refactor, debug
     * Day 7 - Full simulation and review: final project, timed practice
     */
    
    /**
     * TASK 1: Daily routine tracking
     * Implement a simple log that tracks daily tasks
     */
    public static class DailyRoutineTracker {
        private Map<LocalDate, List<String>> dailyTasks;
        
        public DailyRoutineTracker() {
            this.dailyTasks = new HashMap<>();
        }
        
        public void addTask(LocalDate date, String task) {
            dailyTasks.computeIfAbsent(date, k -> new ArrayList<>()).add(task);
        }
        
        public List<String> getTasksForDate(LocalDate date) {
            return dailyTasks.getOrDefault(date, new ArrayList<>());
        }
        
        public int getTotalTaskCount() {
            return dailyTasks.values().stream()
                           .mapToInt(List::size)
                           .sum();
        }
    }
    
    /**
     * TASK 2: Learning topics management
     * Create a system for categorizing learning topics
     */
    public enum StudyTopic {
        CORE_JAVA("Core Java", 1),
        COLLECTIONS("Collections", 2), 
        OOP("Object-Oriented Programming", 3),
        STREAMS("Streams & Lambdas", 4),
        EXCEPTIONS("Exception Handling", 5),
        TESTING("Testing & Clean Code", 6),
        SIMULATION("Full Simulation", 7),
        INTERVIEW("Interview Problems", 0);
        
        private final String description;
        private final int day;
        
        StudyTopic(String description, int day) {
            this.description = description;
            this.day = day;
        }
        
        public String getDescription() { return description; }
        public int getDay() { return day; }
        
        public static List<StudyTopic> getTopicsForDay(int day) {
            return Arrays.stream(values())
                        .filter(topic -> topic.day == day)
                        .collect(Collectors.toList());
        }
    }
    
    /**
     * TASK 3: Learning statistics
     * Calculate progress and statistics
     */
    public static class LearningStatistics {
        private Map<StudyTopic, Integer> topicProgress;
        
        public LearningStatistics() {
            this.topicProgress = new HashMap<>();
        }
        
        public void recordProgress(StudyTopic topic, int points) {
            topicProgress.merge(topic, points, Integer::sum);
        }
        
        public int getTotalProgress() {
            return topicProgress.values().stream()
                               .mapToInt(Integer::intValue)
                               .sum();
        }
        
        public StudyTopic getBestTopic() {
            return topicProgress.entrySet().stream()
                              .max(Map.Entry.comparingByValue())
                              .map(Map.Entry::getKey)
                              .orElse(null);
        }
        
        public double getAverageProgress() {
            return topicProgress.values().stream()
                               .mapToInt(Integer::intValue)
                               .average()
                               .orElse(0.0);
        }
    }
    
    /**
     * TASK 4: Interview preparation tracking
     * Create a system for practicing interview problems
     */
    public static class InterviewPreparation {
        private List<String> interviewProblems;
        private Set<String> solvedProblems;
        
        public InterviewPreparation() {
            this.interviewProblems = Arrays.asList(
                "FizzBuzz",
                "Missing Number", 
                "Detect Duplicate",
                "Swap Without Temp",
                "Reverse LinkedList",
                "Merge Intervals",
                "Balanced Parentheses"
            );
            this.solvedProblems = new HashSet<>();
        }
        
        public void markAsSolved(String problem) {
            if (interviewProblems.contains(problem)) {
                solvedProblems.add(problem);
            }
        }
        
        public List<String> getRemainingProblems() {
            return interviewProblems.stream()
                                  .filter(problem -> !solvedProblems.contains(problem))
                                  .collect(Collectors.toList());
        }
        
        public double getCompletionPercentage() {
            return (double) solvedProblems.size() / interviewProblems.size() * 100;
        }
    }
    
    /**
     * MAIN METHOD - Program entry point and examples
     */
    public static void main(String[] args) {
        System.out.println("=== Java Practice Project ===");
        
        // Daily routines example
        DailyRoutineTracker tracker = new DailyRoutineTracker();
        LocalDate today = LocalDate.now();
        tracker.addTask(today, "Solve JavaBasics exercises");
        tracker.addTask(today, "Write tests");
        tracker.addTask(today, "Code review");
        
        System.out.println("Today's tasks: " + tracker.getTasksForDate(today));
        System.out.println("Total tasks: " + tracker.getTotalTaskCount());
        
        // Learning topics example
        System.out.println("\n=== Learning Topics ===");
        for (StudyTopic topic : StudyTopic.values()) {
            System.out.println("Day " + topic.getDay() + ": " + topic.getDescription());
        }
        
        // Progress tracking
        LearningStatistics stats = new LearningStatistics();
        stats.recordProgress(StudyTopic.CORE_JAVA, 85);
        stats.recordProgress(StudyTopic.COLLECTIONS, 70);
        stats.recordProgress(StudyTopic.OOP, 90);
        
        System.out.println("\n=== Learning Statistics ===");
        System.out.println("Total progress: " + stats.getTotalProgress() + " points");
        System.out.println("Best topic: " + stats.getBestTopic());
        System.out.println("Average progress: " + String.format("%.1f", stats.getAverageProgress()));
        
        // Interview preparation
        InterviewPreparation prep = new InterviewPreparation();
        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");
        
        System.out.println("\n=== Interview Preparation ===");
        System.out.println("Completion: " + String.format("%.1f%%", prep.getCompletionPercentage()));
        System.out.println("Remaining tasks: " + prep.getRemainingProblems());
        
        System.out.println("\n=== Tips ===");
        System.out.println("- Write small methods");
        System.out.println("- Handle edge cases (null, empty)");
        System.out.println("- Use descriptive variable names");
        System.out.println("- Write tests for every task");
        System.out.println("- On day 7, try the final project without notes!");
    }
}
