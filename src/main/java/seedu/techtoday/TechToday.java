package seedu.techtoday;

import java.util.Scanner;
import static seedu.techtoday.common.Messages.greet;

public class TechToday {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        greet();
        System.out.println("What is your name?");

        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine());
    }
}
