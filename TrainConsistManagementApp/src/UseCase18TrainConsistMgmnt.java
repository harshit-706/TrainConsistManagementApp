import java.util.Scanner;

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nBogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("\nBogie ID " + searchKey + " not found in the train consist.");
        }

        System.out.println("\nUC18 search completed ...");
    }
}