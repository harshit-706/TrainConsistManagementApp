import java.util.*;

public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        Set<String> bogies = createSet();
        addBogieIds(bogies);
        displayBogies(bogies);
        displayNote();
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println();
    }

    static Set<String> createSet() {
        return new HashSet<>();
    }

    static void addBogieIds(Set<String> bogies) {
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");
    }

    static void displayBogies(Set<String> bogies) {
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);
        System.out.println();
    }

    static void displayNote() {
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC3 uniqueness validation completed ...");
    }
}