import java.util.*;

public class UseCase7TrainConsistMgmnt {

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
        displayBeforeSort(bogies);
        sortBogies(bogies);
        displayAfterSort(bogies);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
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

    static void displayBeforeSort(List<Bogie> bogies) {
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static void sortBogies(List<Bogie> bogies) {
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
    }

    static void displayAfterSort(List<Bogie> bogies) {
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC7 sorting completed ...");
    }
}