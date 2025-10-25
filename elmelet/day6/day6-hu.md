# Day 6 – Spring keretrendszer és REST API alapok

## Fogalmak
- **Spring kontextus** – ApplicationContext, bean lifecycle, komponens scan.
- **Dependency Injection** – Konstruktor vs mező vs setter injektálás, `@Component`, `@Service`, `@Repository` szerepe.
- **Bean scope-ok** – `singleton`, `prototype`, web scope-ok.
- **REST alapelvek** – Stateless kommunikáció, HTTP metódusok (GET, POST, PUT, DELETE, PATCH).
- **Controller réteg** – `@RestController`, `@RequestMapping`, path és query paraméterek, `@PathVariable`, `@RequestParam`.
- **DTO és validáció** – `@Valid`, Bean Validation annotációk, `@ControllerAdvice` hibakezeléshez.
- **ResponseEntity** – Status kódok, header-ek, body építés.
- **Testelés** – `@WebMvcTest`, MockMvc, integrációs tesztek.

## Interjú kérdések
1. Mi történik, amikor egy `@RestController` metódusát meghívja a kliens?

	**Jegyzet:**

2. Hogyan injektálnál függőségeket a Springben? Melyik megközelítést preferálod és miért?

	**Jegyzet:**

3. Miért érdemes DTO-kat használni, és hogyan validálod őket?

	**Jegyzet:**

4. Hogyan kezelnéd a kivételeket globálisan egy REST API-ban?

	**Jegyzet:**

5. Miben különbözik a PUT és a PATCH HTTP metódus?

	**Jegyzet:**

6. Hogyan adsz vissza különböző HTTP státuszkódokat a Spring Controllerből?

	**Jegyzet:**

7. Milyen lépésekkel építenél fel egy integrációs tesztet egy REST végpontra?

	**Jegyzet:**

## Extra jegyzet / gyakorló feladat
- Készíts egy mini REST szolgáltatást (pl. todo lista) `@RestController` és DTO-k használatával.
- Hozz létre `@ControllerAdvice`-ot, amely JSON formátumban ad vissza hibaüzeneteket.
- Írj MockMvc tesztet, amely ellenőrzi a válasz státuszt és JSON tartalmat.
