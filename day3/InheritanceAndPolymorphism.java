import java.util.*;

/**
 * Day 3 - Öröklés és polimorfizmus
 * 
 * Ez a fájl haladóbb OOP koncepteket gyakorol: öröklés, polimorfizmus, interfészek.
 * Minden feladatot meg kell oldani, majd a végén lévő tesztek segítségével ellenőrizheted.
 */

public class InheritanceAndPolymorphism {

    /**
     * 1) FELADAT: Alaposztály és öröklés - Vehicle hierarchia
     * 
     * Cél: Hozz létre egy Vehicle alaposztályt és leszármazottakat
     * 
     * Vehicle alaposztály:
     * - brand (String)
     * - model (String)
     * - year (int)
     * - start() metódus
     * - getInfo() metódus
     */
    public static abstract class Vehicle {
        // TODO: Implementáld a Vehicle alaposztályt
        protected String brand;
        protected String model;
        protected int year;
        
        public Vehicle(String brand, String model, int year) {
            // TODO: Konstruktor implementálása
        }
        
        public abstract void start(); // Absztrakt metódus
        
        public String getInfo() {
            // TODO: Alapvető info visszaadása
            return "";
        }
        
        // Getterek
        public String getBrand() { return brand; }
        public String getModel() { return model; }
        public int getYear() { return year; }
    }

    /**
     * Car osztály - Vehicle leszármazott
     * Új tulajdonság: numberOfDoors
     */
    public static class Car extends Vehicle {
        // TODO: Implementáld a Car osztályt
        private int numberOfDoors;
        
        public Car(String brand, String model, int year, int numberOfDoors) {
            // TODO: Konstruktor implementálása super() hívással
            super(brand, model, year);
        }
        
        @Override
        public void start() {
            // TODO: Car-specifikus start implementáció
        }
        
        public void openTrunk() {
            // TODO: Car-specifikus metódus
        }
        
        public int getNumberOfDoors() { return numberOfDoors; }
    }

    /**
     * Motorcycle osztály - Vehicle leszármazott  
     * Új tulajdonság: hasWindshield
     */
    public static class Motorcycle extends Vehicle {
        // TODO: Implementáld a Motorcycle osztályt
        private boolean hasWindshield;
        
        public Motorcycle(String brand, String model, int year, boolean hasWindshield) {
            // TODO: Konstruktor implementálása
            super(brand, model, year);
        }
        
        @Override
        public void start() {
            // TODO: Motorcycle-specifikus start implementáció
        }
        
        public void wheelie() {
            // TODO: Motorcycle-specifikus metódus
        }
        
        public boolean hasWindshield() { return hasWindshield; }
    }

    /**
     * 2) FELADAT: Interface implementáció
     * 
     * Cél: Hozz létre interfészeket és implementáld őket
     */
    
    /**
     * Flyable interfész - repülő objektumokhoz
     */
    public interface Flyable {
        void takeOff();
        void land();
        int getMaxAltitude();
    }
    
    /**
     * Swimmable interfész - úszó objektumokhoz  
     */
    public interface Swimmable {
        void dive();
        void surface();
        int getMaxDepth();
    }

    /**
     * Airplane osztály - Vehicle + Flyable
     */
    public static class Airplane extends Vehicle implements Flyable {
        // TODO: Implementáld az Airplane osztályt
        private int maxAltitude;
        
        public Airplane(String brand, String model, int year, int maxAltitude) {
            // TODO: Konstruktor implementálása
            super(brand, model, year);
        }
        
        @Override
        public void start() {
            // TODO: Airplane start implementáció
        }
        
        @Override
        public void takeOff() {
            // TODO: Takeoff implementáció
        }
        
        @Override
        public void land() {
            // TODO: Land implementáció
        }
        
        @Override
        public int getMaxAltitude() { 
            return maxAltitude; 
        }
    }

    /**
     * 3) FELADAT: Equals és HashCode implementáció
     * 
     * Cél: Hozz létre egy Person osztályt helyes equals és hashCode implementációval
     */
    public static class Person {
        // TODO: Implementáld a Person osztályt
        private String name;
        private int age;
        private String email;
        
        public Person(String name, int age, String email) {
            // TODO: Konstruktor implementálása
        }
        
        // Getterek
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }
        
        @Override
        public boolean equals(Object obj) {
            // TODO: Helyes equals implementáció
            return false;
        }
        
        @Override
        public int hashCode() {
            // TODO: Helyes hashCode implementáció
            return 0;
        }
        
        @Override
        public String toString() {
            // TODO: toString implementáció
            return "";
        }
    }

    /**
     * 4) FELADAT: Polimorfizmus gyakorlás
     * 
     * Cél: Használd a polimorfizmust Vehicle objektumokkal
     */
    
    /**
     * Garage osztály - különböző járműveket tárol
     */
    public static class Garage {
        // TODO: Implementáld a Garage osztályt
        private List<Vehicle> vehicles;
        
        public Garage() {
            // TODO: Konstruktor implementálása
        }
        
        public void addVehicle(Vehicle vehicle) {
            // TODO: Jármű hozzáadása
        }
        
        public void startAllVehicles() {
            // TODO: Minden jármű elindítása (polimorfizmus!)
        }
        
        public List<Vehicle> getVehiclesByBrand(String brand) {
            // TODO: Márka alapján szűrés
            return new ArrayList<>();
        }
        
        public int getTotalVehicles() {
            // TODO: Járművek számának visszaadása
            return 0;
        }
        
        public List<Flyable> getFlyableVehicles() {
            // TODO: Repülő járművek szűrése
            return new ArrayList<>();
        }
    }

    // ===============================
    // TESZTEK - Ne módosítsd ezeket!
    // ===============================

    public static void main(String[] args) {
        System.out.println("=== ÖRÖKLÉS ÉS POLIMORFIZMUS TESZTEK ===\n");
        
        runInheritanceTests();
        runInterfaceTests();
        runEqualsHashCodeTests();
        runPolymorphismTests();
        
        System.out.println("\n=== TESZTEK BEFEJEZVE ===");
    }

    private static void runInheritanceTests() {
        System.out.println("1. ÖRÖKLÉS TESZTEK:");
        
        // Test 1: Car létrehozása és metódusok
        Car car = new Car("Toyota", "Camry", 2022, 4);
        testVehicleInfo(car, "Toyota", "Camry", 2022, "Car létrehozása");
        
        // Test 2: Motorcycle létrehozása
        Motorcycle bike = new Motorcycle("Honda", "CBR", 2021, true);
        testVehicleInfo(bike, "Honda", "CBR", 2021, "Motorcycle létrehozása");
        
        // Test 3: Car specifikus tulajdonságok
        testCarProperties(car, 4, "Car specifikus tulajdonságok");
        
        // Test 4: Motorcycle specifikus tulajdonságok  
        testMotorcycleProperties(bike, true, "Motorcycle specifikus tulajdonságok");
        
        System.out.println();
    }

    private static void runInterfaceTests() {
        System.out.println("2. INTERFACE TESZTEK:");
        
        // Test 1: Airplane létrehozása és interface metódusok
        Airplane plane = new Airplane("Boeing", "747", 2020, 35000);
        testVehicleInfo(plane, "Boeing", "747", 2020, "Airplane létrehozása");
        testFlyableProperties(plane, 35000, "Flyable interface");
        
        System.out.println();
    }

    private static void runEqualsHashCodeTests() {
        System.out.println("3. EQUALS ÉS HASHCODE TESZTEK:");
        
        // Test 1: Ugyanolyan személyek
        Person person1 = new Person("John Doe", 30, "john@email.com");
        Person person2 = new Person("John Doe", 30, "john@email.com");
        testPersonEquals(person1, person2, true, "ugyanolyan személyek");
        
        // Test 2: Különböző személyek
        Person person3 = new Person("Jane Smith", 25, "jane@email.com");
        testPersonEquals(person1, person3, false, "különböző személyek");
        
        // Test 3: HashCode konzisztencia
        testPersonHashCode(person1, person2, true, "hashCode konzisztencia");
        
        System.out.println();
    }

    private static void runPolymorphismTests() {
        System.out.println("4. POLIMORFIZMUS TESZTEK:");
        
        Garage garage = new Garage();
        
        // Különböző típusú járművek hozzáadása
        Car car = new Car("BMW", "X5", 2022, 4);
        Motorcycle bike = new Motorcycle("Yamaha", "R1", 2021, false);
        Airplane plane = new Airplane("Cessna", "172", 2020, 15000);
        
        garage.addVehicle(car);
        garage.addVehicle(bike);  
        garage.addVehicle(plane);
        
        // Test 1: Járművek számolása
        testGarageVehicleCount(garage, 3, "járművek számolása");
        
        // Test 2: Márka alapján keresés
        testGarageByBrand(garage, "BMW", 1, "márka alapján keresés");
        
        // Test 3: Flyable járművek szűrése
        testGarageFlyableCount(garage, 1, "flyable járművek szűrése");
        
        // Test 4: Polimorf start metódus hívás
        System.out.println("   Polimorf start metódus hívások:");
        garage.startAllVehicles();
        
        System.out.println();
    }

    // Segéd metódusok a teszteléshez
    private static void testVehicleInfo(Vehicle vehicle, String expectedBrand, 
                                      String expectedModel, int expectedYear, String description) {
        boolean brandOk = expectedBrand.equals(vehicle.getBrand());
        boolean modelOk = expectedModel.equals(vehicle.getModel());
        boolean yearOk = vehicle.getYear() == expectedYear;
        
        boolean allOk = brandOk && modelOk && yearOk;
        String status = allOk ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: %s %s (%d)\n", 
                         status, description, vehicle.getBrand(), vehicle.getModel(), vehicle.getYear());
    }

    private static void testCarProperties(Car car, int expectedDoors, String description) {
        boolean doorsOk = car.getNumberOfDoors() == expectedDoors;
        String status = doorsOk ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: %d ajtó (várt: %d)\n", 
                         status, description, car.getNumberOfDoors(), expectedDoors);
    }

    private static void testMotorcycleProperties(Motorcycle bike, boolean expectedWindshield, String description) {
        boolean windshieldOk = bike.hasWindshield() == expectedWindshield;
        String status = windshieldOk ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: szélvédő %s (várt: %s)\n", 
                         status, description, bike.hasWindshield(), expectedWindshield);
    }

    private static void testFlyableProperties(Flyable flyable, int expectedAltitude, String description) {
        boolean altitudeOk = flyable.getMaxAltitude() == expectedAltitude;
        String status = altitudeOk ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: max magasság %d (várt: %d)\n", 
                         status, description, flyable.getMaxAltitude(), expectedAltitude);
    }

    private static void testPersonEquals(Person p1, Person p2, boolean expected, String description) {
        boolean result = p1.equals(p2);
        String status = result == expected ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: equals() -> %s (várt: %s)\n", 
                         status, description, result, expected);
    }

    private static void testPersonHashCode(Person p1, Person p2, boolean shouldBeEqual, String description) {
        boolean hashCodesEqual = p1.hashCode() == p2.hashCode();
        boolean isCorrect = shouldBeEqual ? hashCodesEqual : true; // Ha equals false, hashCode lehet bármi
        
        String status = isCorrect ? "✅ PASS" : "❌ FAIL";
        System.out.printf("   %s - %s: hashCode konzisztens az equals-szel\n", status, description);
    }

    private static void testGarageVehicleCount(Garage garage, int expected, String description) {
        int count = garage.getTotalVehicles();
        String status = count == expected ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: %d jármű (várt: %d)\n", 
                         status, description, count, expected);
    }

    private static void testGarageByBrand(Garage garage, String brand, int expected, String description) {
        List<Vehicle> vehicles = garage.getVehiclesByBrand(brand);
        int count = vehicles.size();
        String status = count == expected ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: %s márka %d db (várt: %d)\n", 
                         status, description, brand, count, expected);
    }

    private static void testGarageFlyableCount(Garage garage, int expected, String description) {
        List<Flyable> flyables = garage.getFlyableVehicles();
        int count = flyables.size();
        String status = count == expected ? "✅ PASS" : "❌ FAIL";
        
        System.out.printf("   %s - %s: %d repülő jármű (várt: %d)\n", 
                         status, description, count, expected);
    }
}