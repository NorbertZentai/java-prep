# Java Core Esszenciális Kérdések – Junior Java Interjú

## Miért ez a fájl?
Csak a **leggyakoribb 25 Java Core kérdés**, amit junior pozícióra **tényleg** kérdeznek. String, memória, static, final, autoboxing – a lényeg!

---

## 1. String & String Pool

**1. Miért immutable a `String`?**

**Jegyzet:**


**2. Mi a String Pool? Hogyan működik?**

**Jegyzet:**


**3. Mi a különbség a `String`, `StringBuilder` és `StringBuffer` között?**

**Jegyzet:**


**4. Mi történik itt?**
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");
System.out.println(s1 == s2);  // ?
System.out.println(s1 == s3);  // ?
System.out.println(s1.equals(s3));  // ?
```

**Jegyzet:**


---

## 2. Memóriakezelés

**5. Mi a különbség a Stack és Heap között?**

**Jegyzet:**


**6. Mi az a Garbage Collection?**

**Jegyzet:**


**7. Lehet-e manuálisan meghívni a GC-t?**

**Jegyzet:**


---

## 3. Static kulcsszó

**8. Mire való a `static` változó és metódus?**

**Jegyzet:**


**9. Lehet-e `static` metódusból hívni nem-static metódust?**

**Jegyzet:**


**10. Mi az a `static` block? Mikor fut le?**

**Jegyzet:**


**11. Lehet-e `static` metódust override-olni?**

**Jegyzet:**


---

## 4. Final kulcsszó

**12. Mit jelent a `final` változó, metódus és osztály?**

**Jegyzet:**


**13. Lehet-e `final` változót módosítani konstruktorban?**

**Jegyzet:**


**14. Mi a különbség a `final`, `finally` és `finalize()` között?**

**Jegyzet:**


---

## 5. Wrapper Classes & Autoboxing

**15. Mi az az autoboxing és unboxing?**

**Jegyzet:**


**16. Mi történik itt? (Integer cache csapda!)**
```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b);  // ?

Integer c = 128;
Integer d = 128;
System.out.println(c == d);  // ?
```

**Jegyzet:**


**17. Mi a különbség az `Integer.valueOf()` és `Integer.parseInt()` között?**

**Jegyzet:**


---

## 6. Access Modifiers

**18. Mi a láthatósági különbség a `private`, `protected`, `public` és default között?**

**Jegyzet:**


---

## 7. Exceptions

**19. Mi a különbség a checked és unchecked exception között?**

**Jegyzet:**


**20. Hogyan működik a try-with-resources?**

**Jegyzet:**


---

## 8. Java 8+ Features

**21. Mi az a lambda kifejezés? Adj példát!**

**Jegyzet:**


**22. Mi az az `Optional`? Mire jó?**

**Jegyzet:**


**23. Mondj 3 Stream API műveletet!**

**Jegyzet:**


---

## 9. Multithreading alapok

**24. Mi a különbség a `Thread` és `Runnable` között?**

**Jegyzet:**


**25. Mit csinál a `synchronized` kulcsszó?**

**Jegyzet:**


---

## Gyakorlati feladatok

### Feladat 1: String Pool
Mit ír ki ez a kód? Miért?
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2);        // ?
System.out.println(s1 == s3);        // ?
System.out.println(s1.equals(s3));   // ?
System.out.println(s1 == s3.intern()); // ?
```

**Válasz:**


---

### Feladat 2: Autoboxing csapda
Mit ír ki? Miért?
```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b);  // ?

Integer c = 200;
Integer d = 200;
System.out.println(c == d);  // ?
```

**Válasz:**


---

### Feladat 3: Thread-safe Singleton
Írj egy **thread-safe** Singleton osztályt!

**Kód:**


---

### Feladat 4: StringBuilder vs String
Miért rossz ez a kód? Hogyan javítanád?
```java
String result = "";
for (int i = 0; i < 10000; i++) {
    result += i;
}
```

**Probléma:**


**Javított verzió:**


---

## Interjú csapdakérdések

**1. Miért nem lehet override-olni egy `static` metódust?**

**Válasz:**


**2. Mi történik, ha egy `finally` blokkban `return` statement van?**

**Válasz:**


**3. Mi a különbség a `==` és `.equals()` között `String`-eknél?**

**Válasz:**


---

## Interjú checklist – Ezt tudd biztosan!

- [ ] String immutability + String Pool
- [ ] Stack vs Heap
- [ ] `static` vs instance
- [ ] `final` változó/metódus/osztály
- [ ] Autoboxing + Integer cache (-128..127)
- [ ] Access modifiers (private/protected/public/default)
- [ ] Checked vs Unchecked exception
- [ ] Lambda kifejezés szintaxis
- [ ] `Optional` használata
- [ ] Thread vs Runnable
- [ ] StringBuilder vs String konkatenáció

---

**Tipp:** Ezeket a kérdéseket **gyakorlati példákkal** készülj fel, mert kódolni fogsz az interjún! 💻

## 2. Memóriakezelés & Garbage Collection

### Kérdések

**2.1. Mi a különbség a **Stack** és **Heap** memóriaterület között?**

**Jegyzet:**


**2.2. Hol tárolódnak a **primitív típusok** és hol az **objektumok**?**

**Jegyzet:**


**2.3. Mi az a **Garbage Collection**? Hogyan működik?**

**Jegyzet:**


**2.4. Lehet-e manuálisan meghívni a GC-t? Ha igen, hogyan? Érdemes-e?**

**Jegyzet:**


**2.5. Mi történik, ha kifutsz a memóriából? Milyen kivételt kapsz?**

**Jegyzet:**


**2.6. Mi az a **memory leak** Java-ban? Hogyan előzheted meg?**

**Jegyzet:**


**2.7. Mi a különbség a **strong**, **soft**, **weak** és **phantom** reference között?**

**Jegyzet:**


---

## 3. Static kulcsszó

### Kérdések

**3.1. Mi az a `static` változó? Hol tárolódik?**

**Jegyzet:**


**3.2. Lehet-e egy `static` metódusból hívni `non-static` metódust?**

**Jegyzet:**


**3.3. Mi az a **static block**? Mikor fut le?**

**Jegyzet:**


**3.4. Lehet-e egy `static` metódust override-olni?**

**Jegyzet:**


**3.5. Mi az a **static nested class** és **inner class** közötti különbség?**

**Jegyzet:**


**3.6. Miért van a `main()` metódus `static`?**

**Jegyzet:**


---

## 4. Final kulcsszó

### Kérdések

**4.1. Mi történik, ha egy változót `final`-nak jelölsz?**

**Jegyzet:**


**4.2. Lehet-e egy `final` változót később inicializálni konstruktorban?**

**Jegyzet:**


**4.3. Mit jelent egy `final` metódus?**

**Jegyzet:**


**4.4. Mit jelent egy `final` osztály? Mondj példát!**

**Jegyzet:**


**4.5. Mi a különbség a `final`, `finally` és `finalize()` között?**

**Jegyzet:**


**4.6. Lehet-e egy `final` objektum mezőit módosítani?**

**Jegyzet:**


---

## 5. Wrapper Classes & Autoboxing

### Kérdések

**5.1. Mik a wrapper osztályok? Sorold fel őket!**

**Jegyzet:**


**5.2. Mi az **autoboxing** és **unboxing**?**

**Jegyzet:**


**5.3. Mi a különbség az `Integer.valueOf()` és az `Integer.parseInt()` között?**

**Jegyzet:**


**5.4. Mit csinál ez a kód? Miért?**
```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b); // ???

Integer c = 128;
Integer d = 128;
System.out.println(c == d); // ???
```

**Jegyzet:**


**5.5. Lehet-e `null` értéket adni egy primitív típusnak?**

**Jegyzet:**


---

## 6. Varargs & Method Overloading

### Kérdések

**6.1. Mi az a **varargs** (változó paraméter)?**

**Jegyzet:**


**6.2. Hány varargs paraméter lehet egy metódusban? Hol kell állnia?**

**Jegyzet:**


**6.3. Melyik metódust hívja meg ez a kód?**
```java
void print(int x) { }
void print(Integer x) { }
void print(int... x) { }

print(5); // ???
```

**Jegyzet:**


**6.4. Lehet-e overload-olni egy metódust csak a visszatérési típus alapján?**

**Jegyzet:**


---

## 7. Access Modifiers & Package

### Kérdések

**7.1. Milyen hozzáférési módosítók vannak Java-ban?**

**Jegyzet:**


**7.2. Mi az a **package-private** (default) láthatóság?**

**Jegyzet:**


**7.3. Láthatósági táblázat – töltsd ki!**

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| `public` |       |         |          |       |
| `protected` |    |         |          |       |
| default  |       |         |          |       |
| `private` |      |         |          |       |

**Jegyzet:**


**7.4. Lehet-e egy top-level osztály `private` vagy `protected`?**

**Jegyzet:**


---

## 8. Java Keywords & Reserved Words

### Kérdések

**8.1. Mi a `transient` kulcsszó szerepe?**

**Jegyzet:**


**8.2. Mi a `volatile` kulcsszó? Mikor használod?**

**Jegyzet:**


**8.3. Mi a `synchronized` kulcsszó? Miért fontos?**

**Jegyzet:**


**8.4. Mi az `instanceof` operátor? Mire használod?**

**Jegyzet:**


**8.5. Mi az a `strictfp` kulcsszó?**

**Jegyzet:**


**8.6. Van-e `goto` kulcsszó Java-ban?**

**Jegyzet:**


---

## 9. Enums

### Kérdések

**9.1. Mi az az `enum`? Mire használod?**

**Jegyzet:**


**9.2. Lehet-e egy enum konstruktora `public`?**

**Jegyzet:**


**9.3. Tartalmazhat-e egy enum metódusokat és mezőket?**

**Jegyzet:**


**9.4. Mi az a `values()` és `valueOf()` metódus enumoknál?**

**Jegyzet:**


**9.5. Hogyan használnál enumot `switch` kifejezésben?**

**Jegyzet:**


---

## 10. Inner Classes

### Kérdések

**10.1. Milyen típusú nested osztályok vannak Java-ban?**

**Jegyzet:**


**10.2. Mi a különbség a **static nested class** és **inner class** között?**

**Jegyzet:**


**10.3. Mi az az **anonymous class**? Mondj példát!**

**Jegyzet:**


**10.4. Mikor használnál **local class**-t (metóduson belüli osztály)?**

**Jegyzet:**


**10.5. Hozzáférhet-e egy inner class a külső osztály `private` mezőihez?**

**Jegyzet:**


---

## 11. Serialization

### Kérdések

**11.1. Mi az a **serialization**? Mire használod?**

**Jegyzet:**


**11.2. Hogyan tehetsz egy osztályt serializálhatóvá?**

**Jegyzet:**


**11.3. Mi az a `serialVersionUID`? Miért fontos?**

**Jegyzet:**


**11.4. Mit csinál a `transient` kulcsszó serialization során?**

**Jegyzet:**


**11.5. Lehet-e egy `static` mezőt serializálni?**

**Jegyzet:**


**11.6. Mi történik, ha egy szülő osztály nem `Serializable`, de a gyermek igen?**

**Jegyzet:**


---

## 12. Reflection API

### Kérdések

**12.1. Mi az a **Reflection**? Mire használod?**

**Jegyzet:**


**12.2. Hogyan kérheted le egy osztály összes metódusát?**

**Jegyzet:**


**12.3. Lehet-e Reflection-nel `private` metódust meghívni?**

**Jegyzet:**


**12.4. Milyen hátrányai vannak a Reflection használatának?**

**Jegyzet:**


---

## 13. Annotations

### Kérdések

**13.1. Mi az az **annotation**? Mondj 3 beépített példát!**

**Jegyzet:**


**13.2. Mi a különbség a `@Override` és `@Deprecated` között?**

**Jegyzet:**


**13.3. Hogyan készítesz saját annotation-t?**

**Jegyzet:**


**13.4. Mi az a **retention policy**? (`SOURCE`, `CLASS`, `RUNTIME`)**

**Jegyzet:**


---

## 14. Java 8+ Features

### Kérdések

**14.1. Mi az a **lambda kifejezés**? Adj példát!**

**Jegyzet:**


**14.2. Mi az a **method reference**? (`::` operátor)**

**Jegyzet:**


**14.3. Mi az a **Stream API**? Mire jó?**

**Jegyzet:**


**14.4. Mi a különbség a `map()` és `flatMap()` között?**

**Jegyzet:**


**14.5. Mi az az `Optional` osztály? Miért jobb, mint a `null`?**

**Jegyzet:**


**14.6. Mik az **default** és **static** metódusok interfészekben?**

**Jegyzet:**


**14.7. Mi az a **functional interface**? Adj 3 példát!**

**Jegyzet:**


---

## 15. Multithreading Alapok

### Kérdések

**15.1. Mi a különbség a **process** és **thread** között?**

**Jegyzet:**


**15.2. Hogyan hozhatsz létre thread-et Java-ban? (2 módszer)**

**Jegyzet:**


**15.3. Mi a különbség a `start()` és `run()` metódus között?**

**Jegyzet:**


**15.4. Mi az a **race condition**?**

**Jegyzet:**


**15.5. Mi a `synchronized` kulcsszó szerepe?**

**Jegyzet:**


**15.6. Mi a különbség a `wait()`, `notify()` és `sleep()` között?**

**Jegyzet:**


---

## 16. Gyakorlati feladatok

### Feladat 1: String Pool
Mit ír ki ez a kód? Miért?
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s1.equals(s3));
System.out.println(s1 == s3.intern());
```

**Válasz:**


---

### Feladat 2: Autoboxing csapda
Mit ír ki? Miért?
```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b);

Integer c = 200;
Integer d = 200;
System.out.println(c == d);
```

**Válasz:**


---

### Feladat 3: Singleton pattern
Írj egy **thread-safe** Singleton osztályt!

**Kód:**


---

### Feladat 4: Immutable class
Készíts egy immutable `BankAccount` osztályt:
- `accountNumber` (String)
- `balance` (BigDecimal)
- `transactions` (List<String>)

**Kód:**


---

### Feladat 5: Custom Annotation
Készíts egy `@Author` annotation-t:
- Tartalmazza a szerző nevét
- Tartalmazza a dátumot
- Retention policy: RUNTIME

**Kód:**


---

## 17. Interjú csapdakérdések

**17.1. Miért nem lehet override-olni egy `static` metódust?**

**Válasz:**


**17.2. Lehet-e egy konstruktor `final` vagy `static`?**

**Válasz:**


**17.3. Mi történik, ha egy `finally` blokkban `return` statement van?**

**Válasz:**


**17.4. Lehet-e egy osztálynak egyszerre `abstract` és `final` módosítója?**

**Válasz:**


**17.5. Mi a különbség a `==` és `.equals()` között `String`-eknél?**

**Válasz:**


---

## Összefoglaló checklist

Junior Java interjúhoz **kötelező** témák:

- [ ] String Pool és immutability
- [ ] Stack vs Heap memória
- [ ] Static vs non-static
- [ ] Final változó/metódus/osztály
- [ ] Autoboxing & Integer cache (-128 ~ 127)
- [ ] Access modifiers (public/protected/default/private)
- [ ] Serialization alapok
- [ ] Lambda és Stream API alapok
- [ ] Thread létrehozás (Thread vs Runnable)
- [ ] Singleton pattern

---

**Tipp:** Ezeket a kérdéseket **kódolással** gyakorold! Ne csak olvasd, hanem írd meg, futtasd le, és nézd meg a kimenetet! 🎯
