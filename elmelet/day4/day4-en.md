# Day 4 – Streams, Lambdas, and Modern Java APIs

## Key Terms
- **Functional interfaces** – `Supplier`, `Consumer`, `Function`, `Predicate`, `UnaryOperator`, `BiFunction`.
- **Lambda expressions** – Syntax, closures, effectively final variables.
- **Method references** – Static, instance, and constructor references.
- **Stream pipeline** – Intermediate vs terminal operations (map, filter, sorted, collect, reduce).
- **Collectors** – `toList`, `toSet`, `groupingBy`, `partitioningBy`, `mapping`, `collectingAndThen`.
- **Optional** – Null-safety utilities: `orElse`, `orElseGet`, `orElseThrow`, `ifPresent`.
- **Date-Time API (`java.time`)** – `LocalDate`, `LocalDateTime`, `ZonedDateTime`, `Period`, `Duration`.
- **Records and sealed classes** – Brief look at newer type system features.

## Interview Questions
1. What is the difference between `map` and `flatMap` in the Stream API?

	**Notes:**

2. Why must a stream pipeline end with a terminal operation?

	**Notes:**

3. How would you ensure thread safety when processing a stream?

	**Notes:**

4. When would you choose `Optional.orElseGet` instead of `orElse`?

	**Notes:**

5. Demonstrate how `Collectors.groupingBy` can be nested for multi-level grouping.

	**Notes:**

6. What does it mean that lambdas capture variables via closures? What are the constraints?

	**Notes:**

7. What advantages does the `java.time` API offer over the legacy `java.util.Date`/`Calendar` classes?

	**Notes:**

## Extra Notes / Practice Ideas
- Build a stream solution that groups users by city and counts members per city.
- Implement a method that uses `Optional` to safely read configuration values.
- Create an example of a parallel stream (`parallelStream`) and justify when it is appropriate.
