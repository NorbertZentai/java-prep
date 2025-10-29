# Day 2 – Kollekciók, Generics és Hibakezelés

## Fogalmak
- **Gyűjtemény interfészek** – `List`, `Set`, `Map`, valamint ezek fő implementációi (`ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `LinkedHashMap`).
- **Iterátorok és for-each** – Belső vs külső iteráció, fail-fast viselkedés.
- **`equals` / `hashCode` szerződés** – Következmények, ha nem tartjuk be.
- **Generics** – Típushalványítás (type erasure), diamond operátor, bounded wildcardok (`extends` / `super`).
- **Immutable kollekciók** – `List.of()`, `Collections.unmodifiableList`.
- **Checked vs unchecked exception** – Mikor melyiket használjuk, saját kivételek létrehozása.
- **Try-with-resources** – Automatikus erőforráskezelés.

## Interjú kérdések
1. Hogyan működik a HashMap belsőleg? Mit jelent a hash ütközés és hogyan kezelik?

	**Jegyzet:**

2. Mi a különbség a `HashSet` és a `TreeSet` között? Mikor használnád az egyiket a másik helyett?

	**Jegyzet:**

3. Mi a különbség a `List` és a `Set` között? Adj konkrét példát!

	**Jegyzet:**

4. Miért fontos az `equals` és `hashCode` metódusokat együtt felülírni?

	**Jegyzet:**

5. Magyarázd el a generics type erasure koncepcióját, milyen hatása van runtime-ban?

	**Jegyzet:**

6. Mikor használnád a `<? super T>` és mikor a `<? extends T>` wildcardot?

	**Jegyzet:**

7. Mondj példát checked és unchecked exception-re, és indokold, mikor melyik célszerű.

	**Jegyzet:**

8. Hogyan működik a try-with-resources szerkezet? Mit kell implementálnia az erőforrásnak?

	**Jegyzet:**

## Extra jegyzet / gyakorló feladat
- Hozz létre egy olyan osztályt, amelyet `HashSet`-ben használnál kulcsként, és implementáld megfelelően az `equals` és `hashCode` metódusokat.
- Írj generikus metódust, amely bármely `Collection<? extends Number>` elemeinek átlagát számolja ki.
- Készíts példát egy saját checked kivétel osztályra, és kezeld azt try-with-resources blokkban.
