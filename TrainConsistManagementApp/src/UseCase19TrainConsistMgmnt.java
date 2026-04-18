import java.util.Scanner;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("\nBogie ID " + key + " found in the train consist.");
        } else {
            System.out.println("\nBogie ID " + key + " not found in the train consist.");
        }

        System.out.println("\nUC19 search completed ...");
    }
}