/**
 * JavaPracticeProject - 7 napos Java gyakorló projekt + interjú feladatok
 * 
 * Cél: Felkészülés 1-1.5 órás Java kódolási tesztre
 * Minero Gloster stílusú: tiszta OOP kód, Collections, Streams, problémamegoldás
 * 
 * Projekt struktúra:
 * - JavaBasics.java - Alapvető feladatok és tesztek
 * - CollectionsAndAlgorithms.java - Gyűjtemények és algoritmusok
 * - OOPExercises.java - Objektum-orientált programozás
 * - StreamsAndLambdas.java - Stream API és lambda kifejezések
 * - ExceptionHandling.java - Kivételkezelés és fájl I/O
 * - TestingAndCleanCode.java - Tesztelés és tiszta kód
 * - InterviewProblems.java - Gyakori interjú feladatok
 */

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.io.*;

public class JavaPracticeProject {
    
    /**
     * NAPI RUTIN ÉS ÜTEMTERV
     * 
     * Hét áttekintés:
     * Nap 1 - Alapok: szintaxis, ciklusok, függvények
     * Nap 2 - Tömbök és Collections: array, List/Map, rendezés
     * Nap 3 - OOP alapok: osztályok, öröklés, polimorfizmus
     * Nap 4 - Streams és Algoritmusok: Stream API, lambda, keresés/rendezés
     * Nap 5 - Kivételek és File I/O: try-catch, custom exceptions, fájl kezelés
     * Nap 6 - Tesztelés és Clean Code: JUnit, refaktor, debug
     * Nap 7 - Teljes szimuláció és áttekintés: végprojekt, időkorlátos gyakorlás
     */
    
    /**
     * FELADAT 1: Napi rutinok nyomon követése
     * Implementálj egy egyszerű naplót, amely nyomon követi a napi feladatokat
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
     * FELADAT 2: Tanulási témák kezelése
     * Hozz létre egy rendszert a tanulási témák kategorizálására
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
     * FELADAT 3: Tanulási statisztikák
     * Számítsd ki a haladást és statisztikákat
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
     * FELADAT 4: Interjú felkészülés nyomon követése
     * Készíts egy rendszert az interjú feladatok gyakorlásához
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
     * MAIN METÓDUS - Program belépési pont és példák
     */
    public static void main(String[] args) {
        System.out.println("=== Java Gyakorló Projekt ===");
        
        // Napi rutinok példa
        DailyRoutineTracker tracker = new DailyRoutineTracker();
        LocalDate today = LocalDate.now();
        tracker.addTask(today, "JavaBasics feladatok megoldása");
        tracker.addTask(today, "Tesztek írása");
        tracker.addTask(today, "Kód átnézés");
        
        System.out.println("Mai feladatok: " + tracker.getTasksForDate(today));
        System.out.println("Összes feladat: " + tracker.getTotalTaskCount());
        
        // Tanulási témák példa
        System.out.println("\n=== Tanulási Témák ===");
        for (StudyTopic topic : StudyTopic.values()) {
            System.out.println("Nap " + topic.getDay() + ": " + topic.getDescription());
        }
        
        // Haladás nyomon követése
        LearningStatistics stats = new LearningStatistics();
        stats.recordProgress(StudyTopic.CORE_JAVA, 85);
        stats.recordProgress(StudyTopic.COLLECTIONS, 70);
        stats.recordProgress(StudyTopic.OOP, 90);
        
        System.out.println("\n=== Tanulási Statisztikák ===");
        System.out.println("Teljes haladás: " + stats.getTotalProgress() + " pont");
        System.out.println("Legjobb téma: " + stats.getBestTopic());
        System.out.println("Átlagos haladás: " + String.format("%.1f", stats.getAverageProgress()));
        
        // Interjú felkészülés
        InterviewPreparation prep = new InterviewPreparation();
        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");
        
        System.out.println("\n=== Interjú Felkészülés ===");
        System.out.println("Befejezettség: " + String.format("%.1f%%", prep.getCompletionPercentage()));
        System.out.println("Hátralevő feladatok: " + prep.getRemainingProblems());
        
        System.out.println("\n=== Tippek ===");
        System.out.println("- Kis metódusok írása");
        System.out.println("- Edge case-ek kezelése (null, üres)");
        System.out.println("- Beszédes változó nevek");
        System.out.println("- Tesztek írása minden feladathoz");
        System.out.println("- 7. napon próbáld meg a végprojektet jegyzet nélkül!");
    }
}
