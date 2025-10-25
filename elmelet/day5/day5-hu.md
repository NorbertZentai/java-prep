# Day 5 – SQL alapok és relációs adatmodellezés

## Fogalmak
- **Relációs modell** – Táblák, sorok, oszlopok, elsődleges és idegen kulcsok.
- **Normalizálás** – 1NF, 2NF, 3NF, Boyce–Codd NF; denormalizáció indokolt esetei.
- **Alap SQL műveletek** – `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `WHERE`, `ORDER BY`, `GROUP BY`.
- **Join-ok** – `INNER`, `LEFT`, `RIGHT`, `FULL`, `CROSS` és természetes join.
- **Aggregáció** – `COUNT`, `SUM`, `AVG`, `MIN`, `MAX`, `HAVING` klauzula.
- **Tranzakciók** – ACID tulajdonságok, automatikus vs manuális tranzakciókezelés.
- **Indexek** – Miért hasznosak, B-Tree koncepció, composite index.
- **View-k és materialized view-k** – Mikor és miért használjuk őket.

## Interjú kérdések
1. Mi a különbség az INNER és a LEFT JOIN között? Mondj rá gyakorlati példát!

	**Jegyzet:**

2. Magyarázd el az ACID tulajdonságokat és a tranzakció fogalmát!

	**Jegyzet:**

3. Mit jelent a normalizálás? Mikor lépsz vissza denormalizáció irányába?

	**Jegyzet:**

4. Hogyan működik az `GROUP BY` és a `HAVING`? Mi a különbség közöttük?

	**Jegyzet:**

5. Mit csinál egy composite index és milyen hátrányai lehetnek?

	**Jegyzet:**

6. Mi a különbség a view és a materialized view között?

	**Jegyzet:**

7. Hogyan kezelnéd az X és Y tábla közötti many-to-many kapcsolatot?

	**Jegyzet:**

## Extra jegyzet / gyakorló feladat
- Írj SQL lekérdezést, amely visszaadja a top 3 legnagyobb rendelési értéket ügyfelenként.
- Gyakorold egy many-to-many kapcsolat (pl. `students` – `courses`) létrehozását és lekérdezését join-okkal.
- Gondold át, hogyan magyaráznád el junior szinten, miért fontosak az indexek egy gyakran olvasott táblán.
