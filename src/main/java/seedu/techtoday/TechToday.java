package seedu.techtoday;

import seedu.techtoday.apiview.JsonReader;
import static seedu.techtoday.common.Messages.greet;

import java.io.IOException;
import java.util.Scanner;

public class TechToday {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        greet();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if (command.equals("view")) {
            try {
                JsonReader.viewNewNews();
            } catch (IOException e) {
                // Write a reason not print something here
            }
        } else if (command.equals("exit")) {
            System.exit(0);
        }


        {
            System.out.println("Command" + command +  "in progress or not valid");
        }
    }
}
