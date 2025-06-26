package level1.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileAdministrator fileAdministrator = new FileAdministrator();

        HashMap<String, String> countries = fileAdministrator.readCountries(
                "C:\\Users\\usuario\\IdeaProjects\\TaskS103\\src\\countries.txt");

        ArrayList<String> countriesKeys = new ArrayList<>(countries.keySet());
        Random randomKey = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the capital of the following countries");
        System.out.println("Enter your name first");
        String name = sc.nextLine();
        int attempts = 10;
        int score = 0;

        for (int i = 1; i <= attempts; i++) {
            String randomCountry = countriesKeys.get(randomKey.nextInt(countries.size()));
            System.out.println("Attempt " + i + "/" + attempts);
            System.out.println("Guess the capital of: " + randomCountry);
            String userGuess = sc.nextLine();
            if (userGuess.equalsIgnoreCase(countries.get(randomCountry))) {
                System.out.println("Correct answer");
                score++;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("End game. Your scores is: " + score);

            fileAdministrator.saveScoreResult(name, score,
                    "C:\\Users\\usuario\\IdeaProjects\\TaskS103\\src\\level1\\exercise3\\classification.txt");

        }
    }
}
