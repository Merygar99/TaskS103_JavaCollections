package level1.exercise3;

import java.io.*;
import java.util.HashMap;

public class FileAdministrator {

    public HashMap<String, String> readCountries(String filePath) {
        HashMap<String, String> countries = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split(" ", 2);
                if (words.length == 2) {
                    countries.put(words[0], words[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return countries;
    }

    public void saveScoreResult(String name, int score, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("User: " + name + "; Score: " + score + "\n");
            System.out.println("Results saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
