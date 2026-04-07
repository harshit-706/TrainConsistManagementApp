import java.util.*;

public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        List<String> passengerBogies = createBogies();
        addBogies(passengerBogies);
        displayAfterAdd(passengerBogies);
        removeBogie(passengerBogies);
        displayAfterRemove(passengerBogies);
        checkBogie(passengerBogies);
        displayFinalState(passengerBogies);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println();
    }

    static List<String> createBogies() {
        return new ArrayList<>();
    }

    static void addBogies(List<String> bogies) {
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
    }

    static void displayAfterAdd(List<String> bogies) {
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + bogies);
        System.out.println();
    }

    static void removeBogie(List<String> bogies) {
        bogies.remove("AC Chair");
    }

    static void displayAfterRemove(List<String> bogies) {
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + bogies);
        System.out.println();
    }

    static void checkBogie(List<String> bogies) {
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + bogies.contains("Sleeper"));
        System.out.println();
    }

    static void displayFinalState(List<String> bogies) {
        System.out.println("Final Train Passenger Consist:");
        System.out.println(bogies);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC2 operations completed successfully ...");
    }
}