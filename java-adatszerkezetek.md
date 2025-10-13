# Java Adatszerkezetek Kulcsszavak

## Metódusnevek Összehasonlító Táblázat

| Adatszerkezet | Létrehozás | Hozzáadás | Lekérés | Törlés | Keresés | Méret | Üres-e | Tartalmaz |
|---------------|------------|-----------|---------|---------|---------|--------|--------|-----------|
| **Array** | `new int[5]`, `{1,2,3}` | `arr[i] = value` | `arr[i]` | - | `Arrays.binarySearch()` | `arr.length` | `length == 0` | `Arrays.asList().contains()` |
| **ArrayList** | `new ArrayList<>()` | `add()`, `add(index, element)` | `get(index)` | `remove(index)`, `remove(object)` | `indexOf()`, `contains()` | `size()` | `isEmpty()` | `contains()` |
| **LinkedList** | `new LinkedList<>()` | `add()`, `addFirst()`, `addLast()` | `get(index)`, `getFirst()`, `getLast()` | `remove()`, `removeFirst()`, `removeLast()` | `indexOf()`, `contains()` | `size()` | `isEmpty()` | `contains()` |
| **Vector** | `new Vector<>()` | `add()`, `addElement()` | `get(index)`, `elementAt()` | `remove(index)`, `removeElement()` | `indexOf()`, `contains()` | `size()` | `isEmpty()` | `contains()` |
| **HashSet** | `new HashSet<>()` | `add()` | - | `remove()` | `contains()` | `size()` | `isEmpty()` | `contains()` |
| **LinkedHashSet** | `new LinkedHashSet<>()` | `add()` | - | `remove()` | `contains()` | `size()` | `isEmpty()` | `contains()` |
| **TreeSet** | `new TreeSet<>()` | `add()` | `first()`, `last()` | `remove()` | `contains()` | `size()` | `isEmpty()` | `contains()` |
| **HashMap** | `new HashMap<>()` | `put(key, value)` | `get(key)` | `remove(key)` | `containsKey()`, `containsValue()` | `size()` | `isEmpty()` | `containsKey()` |
| **LinkedHashMap** | `new LinkedHashMap<>()` | `put(key, value)` | `get(key)` | `remove(key)` | `containsKey()`, `containsValue()` | `size()` | `isEmpty()` | `containsKey()` |
| **TreeMap** | `new TreeMap<>()` | `put(key, value)` | `get(key)`, `firstKey()`, `lastKey()` | `remove(key)` | `containsKey()`, `containsValue()` | `size()` | `isEmpty()` | `containsKey()` |
| **Stack** | `new Stack<>()` | `push()` | `peek()`, `pop()` | `pop()` | `search()` | `size()` | `isEmpty()` | `contains()` |
| **Queue** | `new LinkedList<>()` | `offer()`, `add()` | `peek()`, `element()` | `poll()`, `remove()` | - | `size()` | `isEmpty()` | `contains()` |
| **PriorityQueue** | `new PriorityQueue<>()` | `offer()`, `add()` | `peek()`, `element()` | `poll()`, `remove()` | `contains()` | `size()` | `isEmpty()` | `contains()` |
| **ArrayDeque** | `new ArrayDeque<>()` | `addFirst()`, `addLast()`, `offerFirst()`, `offerLast()` | `peekFirst()`, `peekLast()` | `pollFirst()`, `pollLast()` | `contains()` | `size()` | `isEmpty()` | `contains()` |

## Speciális Metódusok

### Iterálás
| Adatszerkezet | Iteráció Kulcsszavak |
|---------------|---------------------|
| **Array** | `for (int i = 0; i < arr.length; i++)`, `for (Type item : arr)` |
| **ArrayList/LinkedList** | `for (Type item : list)`, `iterator()`, `listIterator()` |
| **HashSet/TreeSet** | `for (Type item : set)`, `iterator()` |
| **HashMap/TreeMap** | `keySet()`, `values()`, `entrySet()`, `forEach()` |
| **Queue/Stack** | `iterator()`, while `!isEmpty()` + `poll()/pop()` |

### Rendezés és Keresés
| Adatszerkezet | Rendezés | Keresés |
|---------------|----------|---------|
| **Array** | `Arrays.sort()` | `Arrays.binarySearch()` |
| **ArrayList** | `Collections.sort()` | `Collections.binarySearch()` |
| **LinkedList** | `Collections.sort()` | `indexOf()` |
| **TreeSet** | Automatikus | `contains()`, `floor()`, `ceiling()` |
| **TreeMap** | Automatikus kulcs szerint | `containsKey()`, `floorKey()`, `ceilingKey()` |

### Konvertálás
| Forrás → Cél | Kulcsszó |
|--------------|----------|
| **Array → List** | `Arrays.asList()`, `List.of()` |
| **List → Array** | `toArray()` |
| **Set → List** | `new ArrayList<>(set)` |
| **List → Set** | `new HashSet<>(list)` |
| **Map → Set** | `keySet()`, `entrySet()` |

### Bulk Műveletek
| Művelet | Kulcsszavak |
|---------|-------------|
| **Másolás** | `addAll()`, `Collections.copy()` |
| **Tisztítás** | `clear()` |
| **Összehasonlítás** | `equals()`, `Collections.disjoint()` |
| **Minimum/Maximum** | `Collections.min()`, `Collections.max()` |