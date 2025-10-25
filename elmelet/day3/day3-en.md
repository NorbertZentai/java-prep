# Day 3 – Concurrency and the Java Memory Model

## Key Terms
- **Thread lifecycle** – States: New, Runnable, Running, Blocked/Waiting, Terminated.
- **Creating threads** – Extending `Thread`, implementing `Runnable` or `Callable`, using `ExecutorService`.
- **Synchronization** – `synchronized` blocks/methods, monitors, reentrancy.
- **Lock API** – `ReentrantLock`, `ReadWriteLock`, `tryLock`, fairness policies.
- **`volatile` keyword** – Visibility guarantees without atomicity; when to use it.
- **Atomic classes** – `AtomicInteger`, `AtomicReference`, compare-and-set operations.
- **Java Memory Model (JMM)** – Happens-before relationships, instruction reordering, visibility vs atomicity.
- **Thread-safe collections** – `ConcurrentHashMap`, `CopyOnWriteArrayList`, concurrency levels.

## Interview Questions
1. How can you create a thread in Java? Contrast extending `Thread` with implementing `Runnable`.

	**Notes:**

2. What does the `synchronized` keyword guarantee? Why is it considered reentrant?

	**Notes:**

3. When would you pick a `ReentrantLock` over `synchronized`?

	**Notes:**

4. What does `volatile` guarantee and what does it not? Provide an example use case.

	**Notes:**

5. Explain the happens-before relationship in the Java Memory Model at a junior level.

	**Notes:**

6. How does `ConcurrentHashMap` differ from `Collections.synchronizedMap`?

	**Notes:**

7. When should you use an `ExecutorService`, and how do you shut it down gracefully?

	**Notes:**

## Extra Notes / Practice Ideas
- Write an example where two threads increment the same counter using `AtomicInteger`.
- Demonstrate a visibility bug caused by missing `volatile`, then fix it.
- Design a simple task distribution plan using a fixed thread pool (`Executors.newFixedThreadPool`).
