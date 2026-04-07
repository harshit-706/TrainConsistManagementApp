import java.util.*;

public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        Set<String> formation = createFormation();
        addBogies(formation);
        displayFormation(formation);
        displayNote();
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println();
    }

    static Set<String> createFormation() {
        return new LinkedHashSet<>();
    }

    static void addBogies(Set<String> formation) {
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
    }

    static void displayFormation(Set<String> formation) {
        System.out.println("Final Train Formation:");
        System.out.println(formation);
        System.out.println();
    }

    static void displayNote() {
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC5 formation setup completed ...");
    }
}