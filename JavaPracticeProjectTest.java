import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.*;

/**
 * JavaPracticeProjectTest - Tests for practice project classes
 * 
 * Tests the DailyRoutineTracker, StudyTopic, LearningStatistics 
 * and InterviewPreparation classes.
 */
public class JavaPracticeProjectTest {

    private JavaPracticeProject.DailyRoutineTracker tracker;
    private JavaPracticeProject.LearningStatistics stats;
    private JavaPracticeProject.InterviewPreparation prep;

    @BeforeEach
    void setUp() {
        tracker = new JavaPracticeProject.DailyRoutineTracker();
        stats = new JavaPracticeProject.LearningStatistics();
        prep = new JavaPracticeProject.InterviewPreparation();
    }

    // DailyRoutineTracker tests
    @Test
    @DisplayName("Add task and retrieve")
    void testAddAndGetTasks() {
        LocalDate today = LocalDate.now();
        tracker.addTask(today, "Java alapok tanulása");
        tracker.addTask(today, "Write tests");

        List<String> tasks = tracker.getTasksForDate(today);
        assertEquals(2, tasks.size());
        assertTrue(tasks.contains("Java alapok tanulása"));
        assertTrue(tasks.contains("Write tests"));
    }

    @Test
    @DisplayName("Tasks for non-existing day")
    void testGetTasksForNonExistentDate() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        List<String> tasks = tracker.getTasksForDate(yesterday);
        assertTrue(tasks.isEmpty());
    }

    @Test
    @DisplayName("Count all tasks")
    void testTotalTaskCount() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        
        tracker.addTask(today, "Task 1");
        tracker.addTask(today, "Task 2");
        tracker.addTask(tomorrow, "Task 3");

        assertEquals(3, tracker.getTotalTaskCount());
    }

    // StudyTopic tests
    @Test
    @DisplayName("Tanulási témák napok szerint")
    void testGetTopicsForDay() {
        List<JavaPracticeProject.StudyTopic> day1Topics = 
            JavaPracticeProject.StudyTopic.getTopicsForDay(1);
        assertEquals(1, day1Topics.size());
        assertEquals(JavaPracticeProject.StudyTopic.CORE_JAVA, day1Topics.get(0));

        List<JavaPracticeProject.StudyTopic> interviewTopics = 
            JavaPracticeProject.StudyTopic.getTopicsForDay(0);
        assertEquals(1, interviewTopics.size());
        assertEquals(JavaPracticeProject.StudyTopic.INTERVIEW, interviewTopics.get(0));
    }

    @Test
    @DisplayName("StudyTopic leírás és nap")
    void testStudyTopicProperties() {
        JavaPracticeProject.StudyTopic coreJava = JavaPracticeProject.StudyTopic.CORE_JAVA;
        assertEquals("Core Java", coreJava.getDescription());
        assertEquals(1, coreJava.getDay());

        JavaPracticeProject.StudyTopic interview = JavaPracticeProject.StudyTopic.INTERVIEW;
        assertEquals("Interview Problems", interview.getDescription());
        assertEquals(0, interview.getDay());
    }

    // LearningStatistics tests
    @Test
    @DisplayName("Record progress and all progress")
    void testRecordProgressAndTotal() {
        stats.recordProgress(JavaPracticeProject.StudyTopic.CORE_JAVA, 80);
        stats.recordProgress(JavaPracticeProject.StudyTopic.OOP, 90);
        stats.recordProgress(JavaPracticeProject.StudyTopic.CORE_JAVA, 10); // Hozzáadás

        assertEquals(180, stats.getTotalProgress());
    }

    @Test
    @DisplayName("Legjobb téma meghatározása")
    void testGetBestTopic() {
        stats.recordProgress(JavaPracticeProject.StudyTopic.CORE_JAVA, 70);
        stats.recordProgress(JavaPracticeProject.StudyTopic.OOP, 95);
        stats.recordProgress(JavaPracticeProject.StudyTopic.COLLECTIONS, 80);

        assertEquals(JavaPracticeProject.StudyTopic.OOP, stats.getBestTopic());
    }

    @Test
    @DisplayName("Átlagos haladás számítása")
    void testGetAverageProgress() {
        stats.recordProgress(JavaPracticeProject.StudyTopic.CORE_JAVA, 80);
        stats.recordProgress(JavaPracticeProject.StudyTopic.OOP, 90);
        stats.recordProgress(JavaPracticeProject.StudyTopic.COLLECTIONS, 70);

        assertEquals(80.0, stats.getAverageProgress(), 0.01);
    }

    @Test
    @DisplayName("Üres statisztikák kezelése")
    void testEmptyStatistics() {
        assertEquals(0, stats.getTotalProgress());
        assertNull(stats.getBestTopic());
        assertEquals(0.0, stats.getAverageProgress(), 0.01);
    }

    // InterviewPreparation tests
    @Test
    @DisplayName("Mark task as completed")
    void testMarkAsSolved() {
        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");

        List<String> remaining = prep.getRemainingProblems();
        assertFalse(remaining.contains("FizzBuzz"));
        assertFalse(remaining.contains("Missing Number"));
        assertTrue(remaining.contains("Detect Duplicate"));
    }

    @Test
    @DisplayName("Mark non-existing task")
    void testMarkNonExistentProblemAsSolved() {
        int initialSize = prep.getRemainingProblems().size();
        prep.markAsSolved("Non-existent Problem");
        
        assertEquals(initialSize, prep.getRemainingProblems().size());
    }

    @Test
    @DisplayName("Befejezettségi százalék számítása")
    void testCompletionPercentage() {
        assertEquals(0.0, prep.getCompletionPercentage(), 0.01);

        prep.markAsSolved("FizzBuzz");
        prep.markAsSolved("Missing Number");
        
        // 2/7 = ~28.57%
        assertEquals(28.57, prep.getCompletionPercentage(), 0.1);
    }

    @Test
    @DisplayName("Complete all tasks")
    void testAllProblemsSolved() {
        List<String> allProblems = Arrays.asList(
            "FizzBuzz", "Missing Number", "Detect Duplicate", 
            "Swap Without Temp", "Reverse LinkedList", 
            "Merge Intervals", "Balanced Parentheses"
        );

        for (String problem : allProblems) {
            prep.markAsSolved(problem);
        }

        assertEquals(100.0, prep.getCompletionPercentage(), 0.01);
        assertTrue(prep.getRemainingProblems().isEmpty());
    }

    @Test
    @DisplayName("Remaining tasks list")
    void testRemainingProblems() {
        List<String> initial = prep.getRemainingProblems();
        assertEquals(7, initial.size());

        prep.markAsSolved("FizzBuzz");
        List<String> afterOne = prep.getRemainingProblems();
        assertEquals(6, afterOne.size());
        assertFalse(afterOne.contains("FizzBuzz"));
    }
}