import java.util.*;
import java.util.stream.*;

public class UseCase8TrainConsistMgmnt {

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
        displayAll(bogies);
        List<Bogie> filtered = filterBogies(bogies);
        displayFiltered(filtered);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println();
    }

    static List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("General", 90));
        return list;
    }

    static void displayAll(List<Bogie> bogies) {
        System.out.println("ALL Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    static void displayFiltered(List<Bogie> filtered) {
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC8 filtering completed ...");
    }
}