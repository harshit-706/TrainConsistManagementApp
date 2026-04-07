import java.util.*;

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        Map<String, Integer> capacityMap = createMap();
        addCapacities(capacityMap);
        displayCapacities(capacityMap);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println();
    }

    static Map<String, Integer> createMap() {
        return new HashMap<>();
    }

    static void addCapacities(Map<String, Integer> map) {
        map.put("Sleeper", 72);
        map.put("AC Chair", 56);
        map.put("First Class", 24);
        map.put("Cargo", 120);
    }

    static void displayCapacities(Map<String, Integer> map) {
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC6 bogie-capacity mapping completed ...");
    }
}