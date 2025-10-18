package p1;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) {
        String filename = "document.txt";
        String content = "Hello from Rajeshwari Nalbalwar!";

        
        try (FileWriter writer = new FileWriter(filename)) {         // Writing into file
            writer.write(content);
            System.out.println("Write successful!");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        
        try (FileReader reader = new FileReader(filename)) {          // Reading from file
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\nRead successful!");
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}
