import java.util.*;
import java.util.stream.*;

public class UseCase9TrainConsistMgmnt {

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
        Map<String, List<Bogie>> grouped = groupBogies(bogies);
        displayGrouped(grouped);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println();
    }

    static List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 60));
        return list;
    }

    static void displayAll(List<Bogie> bogies) {
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    static void displayGrouped(Map<String, List<Bogie>> grouped) {
        System.out.println("Grouped Bogies:");
        System.out.println();
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }
            System.out.println();
        }
    }

    static void completionMessage() {
        System.out.println("UC9 grouping completed ...");
    }
}