import java.util.ArrayList;
import java.util.List;

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC20 - Prevent Search on Empty Train ");
        System.out.println("======================================\n");

        List<String> bogieIds = new ArrayList<>();

        try {
            searchBogie(bogieIds, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        bogieIds.add("BG101");
        bogieIds.add("BG205");
        bogieIds.add("BG309");

        try {
            boolean found = searchBogie(bogieIds, "BG205");
            if (found) {
                System.out.println("Bogie ID BG205 found in the train consist.");
            } else {
                System.out.println("Bogie ID BG205 not found in the train consist.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 validation completed ...");
    }

    private static boolean searchBogie(List<String> bogies, String key) {
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Train consist is empty. Cannot perform search.");
        }

        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}