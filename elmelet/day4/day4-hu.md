# Day 4 – Streams, Lambda kifejezések és Modern Java API-k

## Fogalmak
- **Functionális interfészek** – `Supplier`, `Consumer`, `Function`, `Predicate`, `UnaryOperator`, `BiFunction`.
- **Lambda kifejezések** – Szintaxis, lezárások (closures), hatókör.
- **Method reference** – Statikus, példány, konstruktor referenciák.
- **Stream pipeline** – Közbenső és végső műveletek (map, filter, sorted, collect, reduce).
- **Collectors** – `toList`, `toSet`, `groupingBy`, `partitioningBy`, `mapping`, `collectingAndThen`.
- **Optional** – Null-kezelés, `orElse`, `orElseGet`, `orElseThrow`, `ifPresent`.
- **Date-Time API (java.time)** – `LocalDate`, `LocalDateTime`, `ZonedDateTime`, `Period`, `Duration`.
- **Recordok és sealed osztályok** – Röviden a modern Java típusok.

## Interjú kérdések
1. Mi a különbség a map és a flatMap stream műveletek között?

	**Jegyzet:**

2. Miért fontos a stream pipeline végén végső műveletet hívni?

	**Jegyzet:**

3. Hogyan biztosítanád a thread safety-t stream feldolgozás közben?

	**Jegyzet:**


4. Mikor használod a `Optional.orElseGet`-et `orElse` helyett?

	**Jegyzet:**

5. Mutasd be, hogyan működik a `Collectors.groupingBy` több szinttel!

	**Jegyzet:**

6. Mit jelent az, hogy a lambda “létezik” a lezárások (closure) miatt?

	**Jegyzet:**

7. Milyen előnyökkel jár a `java.time` API a korábbi `java.util.Date`-hez képest?

	**Jegyzet:**

## Extra jegyzet / gyakorló feladat
- Írj stream alapú megoldást, amely csoportosítja a felhasználókat város szerint, majd számolja a darabszámot.
- Implementálj egy `Optional` alapú metódust, amely biztonságosan olvas ki értékeket konfigurációból.
- Készíts példát, ahol a stream feldolgozás párhuzamos (`parallelStream`), és indokold, mikor érdemes használni.
