# Day 3 – Párhuzamosság és Java Memory Model

## Fogalmak
- **Thread életciklus** – New, Runnable, Running, Blocked/Waiting, Terminated állapotok.
- **Szál létrehozása** – `Thread` öröklés, `Runnable`, `Callable`, `ExecutorService` használat.
- **Szinkronizáció** – `synchronized` blokk/metódus, reentrancia, monitorok.
- **Lock API** – `ReentrantLock`, `ReadWriteLock`, `tryLock` viselkedés.
- **`volatile` kulcsszó** – Láthatóság garantálása, de nem atomitás.
- **Atomic osztályok** – `AtomicInteger`, `AtomicReference`, CAS műveletek.
- **Java Memory Model (JMM)** – Happens-before relációk, reorderings, visibility vs atomicity.
- **Thread-safe gyűjtemények** – `ConcurrentHashMap`, `CopyOnWriteArrayList`.

## Interjú kérdések
1. Milyen módon hoznál létre szálat? Mi a különbség a `Thread` öröklés és a `Runnable` implementálás között?

	**Jegyzet:**

2. Mit jelent a `synchronized` kulcsszó? Miért mondjuk, hogy reentrant?

	**Jegyzet:**

3. Mikor választanád a `ReentrantLock`-ot a `synchronized` helyett?

	**Jegyzet:**

4. Mit garantál a `volatile` és mit nem? Mondj rá példát!

	**Jegyzet:**

5. Magyarázd el a Java Memory Model happens-before szabályát junior szinten!

	**Jegyzet:**

6. Hogyan működik a `ConcurrentHashMap` és miben különbözik a `Collections.synchronizedMap`-tól?

	**Jegyzet:**

7. Mikor használnál `ExecutorService`-t, és hogyan állítanád le kulturáltan?

	**Jegyzet:**

## Extra jegyzet / gyakorló feladat
- Írj példát, ahol két szál ugyanazt a számlálót növeli `AtomicInteger` használatával.
- Készíts mini példát, amely bemutatja a `volatile` hiányából adódó láthatósági problémát, majd javítsd.
- Tervezd meg, hogyan osztanád ki a feladatokat egy fix méretű szálmedencének (`Executors.newFixedThreadPool`).
