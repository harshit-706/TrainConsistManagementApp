import java.util.*;
import java.util.stream.*;

public class UseCase13TrainConsistMgmnt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        displayHeader();
        List<Bogie> bogies = createDataset();

        long loopTime = measureLoop(bogies);
        long streamTime = measureStream(bogies);

        displayResult(loopTime, streamTime);
        completionMessage();
    }

    static void displayHeader() {
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println();
    }

    static List<Bogie> createDataset() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie("Passenger", (i % 100) + 1));
        }
        return list;
    }

    static long measureLoop(List<Bogie> bogies) {
        long start = System.nanoTime();
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    static long measureStream(List<Bogie> bogies) {
        long start = System.nanoTime();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long end = System.nanoTime();
        return end - start;
    }

    static void displayResult(long loopTime, long streamTime) {
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC13 performance benchmarking completed ...");
    }
}