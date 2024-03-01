import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStorageComponent {

    public List<Integer> readIntegers(String inputLocation) {
        List<Integer> integers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(inputLocation))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                integers.add(number);
            }
        }

        return integers;
    }

    public void writeResults(String outputLocation, List<Long> results) {
            for (long result : results) {
                writer.write(Long.toString(result));
                writer.newLine();
            }
        
    }
}
