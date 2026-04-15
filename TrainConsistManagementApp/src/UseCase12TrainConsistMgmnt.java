import java.util.*;

public class UseCase12TrainConsistMgmnt {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        displayHeader();
        List<GoodsBogie> goodsBogies = createBogies();
        displayBogies(goodsBogies);
        boolean isSafe = validateSafety(goodsBogies);
        displayResult(isSafe);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println();
    }

    static List<GoodsBogie> createBogies() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));
        list.add(new GoodsBogie("Box", "Grain"));
        return list;
    }

    static void displayBogies(List<GoodsBogie> bogies) {
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }
        System.out.println();
    }

    static boolean validateSafety(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
    }

    static void displayResult(boolean isSafe) {
        System.out.println("Safety Compliance Status: " + isSafe);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC12 safety validation completed ...");
    }
}