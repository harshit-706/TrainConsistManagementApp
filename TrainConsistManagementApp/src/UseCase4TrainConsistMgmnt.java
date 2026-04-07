import java.util.*;

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        List<String> trainConsist = createConsist();
        addBogies(trainConsist);
        displayInitial(trainConsist);
        insertPantry(trainConsist);
        displayAfterInsert(trainConsist);
        removeEnds(trainConsist);
        displayFinal(trainConsist);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println();
    }

    static List<String> createConsist() {
        return new LinkedList<>();
    }

    static void addBogies(List<String> consist) {
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");
    }

    static void displayInitial(List<String> consist) {
        System.out.println("Initial Train Consist:");
        System.out.println(consist);
        System.out.println();
    }

    static void insertPantry(List<String> consist) {
        consist.add(2, "Pantry Car");
    }

    static void displayAfterInsert(List<String> consist) {
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(consist);
        System.out.println();
    }

    static void removeEnds(List<String> consist) {
        ((LinkedList<String>) consist).removeFirst();
        ((LinkedList<String>) consist).removeLast();
    }

    static void displayFinal(List<String> consist) {
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(consist);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC4 ordered consist operations completed ...");
    }
}