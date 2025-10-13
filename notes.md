# 📘 Java Quick Notes

## 🔹 Syntax
```java
public static void main(String[] args) {
    System.out.println("Hello Java!");
}
````

* Control flow: `if`, `for`, `while`, `switch`
* Loop control: `break`, `continue`

## 🔹 OOP Basics

* **Encapsulation**: private fields + getters/setters
* **Inheritance**: `extends` (reuse behavior)
* **Polymorphism**: same interface, different behavior
* **Abstraction**: interface / abstract class

## 🔹 Collections

* `List` (ordered, duplicates), `Set` (unique), `Map` (key–value)
* Iterate and prefer meaningful types (`List<Person>`)

## 🔹 Streams

```java
list.stream().filter(x -> x > 0).map(x -> x * 2).toList();
```

## 🔹 Exceptions

```java
try { int r = a / b; }
catch (ArithmeticException e) { System.out.println("Cannot divide by zero!"); }
```

## 🔹 File I/O

```java
try (BufferedReader r = new BufferedReader(new FileReader("in.txt"))) {
    String line; while ((line = r.readLine()) != null) System.out.println(line);
}
```

## 🔹 Testing

```java
@Test void testSum() { assertEquals(5, Calculator.add(2, 3)); }
```

## 💡 Tips

Small methods • Edge cases (`null`, empty) • Descriptive names • Tests with sample I/O

# The following markdown files are stubs with short, clear titles and TODOs.

# Each should contain: Title, Goal, Requirements, Example I/O (if relevant), and TODO checklist.

# Day 1

## java-prep/day1/max-number.md

# Max Number

**Goal:** return the maximum in an `int[]`.
**Requirements:** iterate, handle negatives, non-empty input.
**TODO:** implement + tests.

## java-prep/day1/reverse-string.md

# Reverse String

**Goal:** reverse a `String`.
**Requirements:** handle empty and single-char.
**TODO:** implement + tests.

## java-prep/day1/count-vowels.md

# Count Vowels

**Goal:** count vowels in a word.
**Requirements:** case-insensitive; only `a e i o u` (HU/EN note if extended).
**TODO:** implement + tests.

## java-prep/day1/swap-numbers.md

# Swap Numbers

**Goal:** swap two ints.
**Variants:** with temp var, without temp var (arith/bitwise).
**TODO:** implement + tests.

## java-prep/day1/is-palindrome.md

# Palindrome

**Goal:** check if a string is palindrome.
**Requirements:** ignore case; no spaces handling (variant optional).
**TODO:** implement + tests.

# Day 2

## java-prep/day2/array-operations.md

# Array Operations

**Goal:** basic ops: sum, avg, min/max.
**TODO:** implement + tests.

## java-prep/day2/list-map-basics.md

# List & Map Basics

**Goal:** add/find/remove in List/Map.
**TODO:** implement examples.

## java-prep/day2/search-sort.md

# Search & Sort

**Goal:** linear/binary search; sort ascending/descending.
**TODO:** implement + tests.

## java-prep/day2/remove-duplicates.md

# Remove Duplicates

**Goal:** unique elements from array/list (use `Set`).
**TODO:** implement + tests.

## java-prep/day2/second-largest.md

# Second Largest

**Goal:** second largest number in array.
**TODO:** implement + tests; handle duplicates.

# Day 3

## java-prep/day3/oop-basics.md

# OOP Basics (Class & Methods)

**Goal:** simple `Book` with `Library`.
**TODO:** addBook, findByAuthor, totalPrice.

## java-prep/day3/inheritance.md

# Inheritance

**Goal:** `EBook` and `PrintedBook` extend `Book`.
**TODO:** extra fields, overrides.

## java-prep/day3/polymorphism.md

# Polymorphism

**Goal:** interface `Discountable`, multiple impls.
**TODO:** apply different discounts.

## java-prep/day3/interface-vs-abstract.md

# Interface vs Abstract

**Goal:** model capabilities vs base behavior.
**TODO:** one interface + one abstract base.

## java-prep/day3/equals-hashcode.md

# equals & hashCode

**Goal:** proper equality for `Book`.
**TODO:** implement + tests (Set/Map behavior).

# Day 4

## java-prep/day4/streams-filtering.md

# Streams: Filtering

**Goal:** filter books by price/category with streams.
**TODO:** implement + examples.

## java-prep/day4/lambda-practice.md

# Lambda Practice

**Goal:** custom Comparator by title/price.
**TODO:** sort examples + tests.

## java-prep/day4/algorithms.md

# Algorithms Grab Bag

**Goal:** practice problems (sum pairs, frequency map).
**TODO:** implement + tests.

## java-prep/day4/merge-sort.md

# Merge Sort

**Goal:** implement merge sort.
**TODO:** implement + tests; compare with Arrays.sort.

## java-prep/day4/binary-search.md

# Binary Search

**Goal:** implement binary search (sorted array).
**TODO:** implement + tests; handle not-found.

# Day 5

## java-prep/day5/exceptions.md

# Exceptions

**Goal:** try-catch-finally; custom exception.
**TODO:** example methods + tests.

## java-prep/day5/file-io.md

# File I/O

**Goal:** read file lines and write output.
**TODO:** try-with-resources; handle missing file.

## java-prep/day5/data-parsing.md

# Data Parsing

**Goal:** parse CSV-like lines to objects.
**TODO:** validation and error reporting.

## java-prep/day5/custom-exception.md

# Custom Exception

**Goal:** `InvalidDataException` for parser.
**TODO:** throw on bad line; test with `assertThrows`.

## java-prep/day5/resource-management.md

# Resource Management

**Goal:** demonstrate try-with-resources & close order.
**TODO:** example with readers/writers.

# Day 6

## java-prep/day6/unit-testing.md

# Unit Testing (JUnit 5)

**Goal:** write tests for Day 1–2 functions.
**TODO:** `@Test`, assertions, edge cases.

## java-prep/day6/refactor-clean-code.md

# Refactor & Clean Code

**Goal:** extract methods, better naming, SRP.
**TODO:** refactor Library/Store code.

## java-prep/day6/debug-exercises.md

# Debug Exercises

**Goal:** fix NPE, OOB, logic bugs.
**TODO:** add failing examples then fix.

## java-prep/day6/edge-case-testing.md

# Edge Case Testing

**Goal:** test null/empty/invalid inputs.
**TODO:** add tests to earlier tasks.

## java-prep/day6/performance-considerations.md

# Performance Considerations

**Goal:** avoid repeated work; big-O notes.
**TODO:** optimize a slow method.

# Day 7

## java-prep/day7/final-project-store.md

# Final Project: Store

**Goal:** `Product` CRUD-like ops in memory.
**TODO:** add, findByName, byCategory, avgPrice, updateStock.

## java-prep/day7/recap-questions.md

# Recap Questions

**Goal:** short written answers for theory.
**TODO:** OOP pillars, exceptions, streams.

## java-prep/day7/speed-coding.md

# Speed Coding

**Goal:** 15–20 min timed tasks.
**TODO:** pick 2 from Day 1–4 and re-implement.

## java-prep/day7/rebuild-old-tasks.md

# Rebuild Old Tasks

**Goal:** redo 2 earlier tasks by memory.
**TODO:** no peeking, then compare.

## java-prep/day7/time-limited-challenge.md

# Time-Limited Challenge (60–90 min)

**Goal:** combine OOP + Streams + I/O.
**TODO:** build mini app with clean structure.

# Interview Problems

## java-prep/interview-problems/fizzbuzz.md

# FizzBuzz

**Goal:** print 1..n, Fizz/Buzz rules.
**TODO:** implement + tests.

## java-prep/interview-problems/missing-number.md

# Missing Number

**Goal:** find missing number in 1..n array.
**TODO:** math sum vs XOR variants.

## java-prep/interview-problems/detect-duplicate.md

# Detect Duplicate

**Goal:** check duplicates in array/list.
**TODO:** Set approach + test.

## java-prep/interview-problems/swap-without-temp.md

# Swap Without Temp

**Goal:** swap two ints without extra var.
**TODO:** arithmetic vs XOR; overflow note.

## java-prep/interview-problems/reverse-linkedlist.md

# Reverse LinkedList

**Goal:** reverse singly linked list.
**TODO:** iterative + recursive.

## java-prep/interview-problems/merge-intervals.md

# Merge Intervals

**Goal:** merge overlapping intervals.
**TODO:** sort + merge sweep.

## java-prep/interview-problems/balanced-parentheses.md

# Balanced Parentheses

**Goal:** valid brackets check with stack.
**TODO:** (), {}, [] support.
