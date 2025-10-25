# Day 6 – Spring Framework and REST API Essentials

## Key Terms
- **Spring context** – `ApplicationContext`, bean lifecycle, component scanning.
- **Dependency Injection** – Constructor vs field vs setter injection, roles of `@Component`, `@Service`, `@Repository`.
- **Bean scopes** – `singleton`, `prototype`, web scopes (`request`, `session`).
- **REST principles** – Statelessness, HTTP verbs (GET, POST, PUT, DELETE, PATCH), resource modeling.
- **Controller layer** – `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestParam`, request/response bodies.
- **DTOs and validation** – `@Valid`, Bean Validation annotations, `@ControllerAdvice` for exception handling.
- **ResponseEntity** – Customizing status codes, headers, and response bodies.
- **Testing** – `@WebMvcTest`, MockMvc usage, integration testing strategies.

## Interview Questions
1. Describe what happens under the hood when a client invokes a method annotated with `@RestController`.

	**Notes:**

2. How do you inject dependencies in Spring? Which approach do you prefer and why?

	**Notes:**

3. Why introduce DTOs, and how do you validate them?

	**Notes:**

4. How would you implement global exception handling in a REST API?

	**Notes:**

5. Distinguish between the HTTP PUT and PATCH methods.

	**Notes:**

6. How can you return custom HTTP status codes from a Spring controller?

	**Notes:**

7. Outline the steps to create an integration test for a REST endpoint.

	**Notes:**

## Extra Notes / Practice Ideas
- Build a mini REST service (e.g., todo list) using `@RestController` and DTOs.
- Implement a `@ControllerAdvice` that returns JSON error payloads.
- Write a MockMvc test verifying response status and JSON content.
