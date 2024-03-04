import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTestInputFile {

    public static void main(String[] args) {

        String filePath = "test" + File.separatorChar + "testInputFile.test";
        String numbers = "1,15,10,5,2,3,8";

        createTestInputFile(filePath, numbers);
    }

    private static void createTestInputFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Test input file created successfully at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
