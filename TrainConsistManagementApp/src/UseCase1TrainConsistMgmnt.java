import java.util.*;

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {
        displayBanner();
        List<String> trainConsist = initializeTrain();
        displayInitialState(trainConsist);
        systemReady();
    }

    static void displayBanner() {
        System.out.println("=== Train Consist Management App ===");
        System.out.println();
    }

    static List<String> initializeTrain() {
        System.out.println("Train initialized successfully ...");
        return new ArrayList<>();
    }

    static void displayInitialState(List<String> trainConsist) {
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();
    }

    static void systemReady() {
        System.out.println("System ready for operations ...");
    }
}