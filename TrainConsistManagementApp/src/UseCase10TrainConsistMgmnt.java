import java.util.*;

public class UseCase10TrainConsistMgmnt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        displayHeader();
        List<Bogie> bogies = createBogies();
        displayBogies(bogies);
        int total = calculateTotalCapacity(bogies);
        displayTotal(total);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println();
    }

    static List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Sleeper", 70));
        return list;
    }

    static void displayBogies(List<Bogie> bogies) {
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    static void displayTotal(int total) {
        System.out.println("Total Seating Capacity of Train: " + total);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC10 aggregation completed ...");
    }
}