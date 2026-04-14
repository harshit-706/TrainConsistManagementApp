import java.util.*;
import java.util.regex.*;

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {
        displayHeader();
        Scanner scanner = new Scanner(System.in);

        String trainId = readTrainId(scanner);
        String cargoCode = readCargoCode(scanner);

        boolean isTrainValid = validateTrainId(trainId);
        boolean isCargoValid = validateCargoCode(cargoCode);

        displayResult(isTrainValid, isCargoValid);
        completionMessage();

        scanner.close();
    }

    static void displayHeader() {
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println();
    }

    static String readTrainId(Scanner scanner) {
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        return scanner.nextLine();
    }

    static String readCargoCode(Scanner scanner) {
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        return scanner.nextLine();
    }

    static boolean validateTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    static void displayResult(boolean trainValid, boolean cargoValid) {
        System.out.println();
        System.out.println("Validation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC11 validation completed ...");
    }
}