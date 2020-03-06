package seedu.TechToday;

import java.util.Scanner;
import static seedu.TechToday.common.Messages.*;

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
