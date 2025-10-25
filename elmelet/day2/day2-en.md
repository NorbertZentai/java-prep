# Day 2 – Collections, Generics, and Error Handling

## Key Terms
- **Collection interfaces** – `List`, `Set`, `Map`, and key implementations (`ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `LinkedHashMap`).
- **Iteration** – External vs internal iteration, iterator fail-fast behavior, enhanced for-loop.
- **`equals` / `hashCode` contract** – Why both must be overridden together and implications if not.
- **Generics** – Type erasure, diamond operator, bounded wildcards (`extends` / `super`).
- **Immutable collections** – `List.of()`, `Collections.unmodifiableList` and when to use them.
- **Checked vs unchecked exceptions** – Guidelines for choosing between them, custom exception design.
- **Try-with-resources** – Automatic resource management, `AutoCloseable`.

## Interview Questions
1. Describe the internal workings of a `HashMap`. How are hash collisions handled?

	**Notes:**

2. Compare `HashSet` and `TreeSet`. When would you prefer one over the other?

	**Notes:**

3. Why is overriding both `equals` and `hashCode` important? What happens if you don’t?

	**Notes:**

4. Explain type erasure in Java generics. How does it influence runtime behavior?

	**Notes:**

5. When would you use `<? super T>` vs `<? extends T>`?

	**Notes:**

6. Provide examples of checked and unchecked exceptions and explain when each is appropriate.

	**Notes:**

7. How does try-with-resources work, and what requirements must the resource type satisfy?

	**Notes:**

## Extra Notes / Practice Ideas
- Create a class intended to be used as a key in a `HashSet` and correctly implement `equals` and `hashCode`.
- Write a generic method that computes the average of any `Collection<? extends Number>`.
- Design a custom checked exception and demonstrate handling it inside a try-with-resources block.
