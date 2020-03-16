package seedu.techtoday;

import seedu.techtoday.apiview.JsonReader;

import java.io.IOException;
import java.util.Scanner;

public class TechToday {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        System.out.println("Hey");
        System.out.println("What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if (command.equals("view news")){
            try {
                JsonReader.viewNewNews();
            } catch (IOException e) {
                // Write a reason not print something here
            }
        } else {
            System.out.println("Command" + command +  "in progress or not valid");
        }
    }
}
