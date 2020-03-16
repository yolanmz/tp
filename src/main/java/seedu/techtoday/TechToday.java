package seedu.techtoday;

import seedu.techtoday.apiview.JsonReader;
import static seedu.techtoday.common.Messages.greet;
import seedu.techtoday.Ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TechToday {
    public static boolean isRunning = true;
    public static ArrayList<Article> savedArticles = new ArrayList<>();
    public static ArrayList<Article> viewArticles;

    /**
     * Function that updates defaults for view articles
     */
    public static void getViewArticles() {
        viewArticles.add(new Article("Hackers Hit US health agency during coronavirus crisis","https://www.cnet.com/news/hackers-hit-us-health-agency-during-coronavirus-crisis/", "default" ));
        viewArticles.add(new Article("Microsoft Releases Xbox Series X specs, controller details","https://www.cnet.com/news/microsoft-releases-xbox-series-x-specs-controller-details/", "default" ));
        viewArticles.add(new Article("Apple find @1.2B by France's competition watchdog", "https://www.cnet.com/news/apple-fined-1-2b-by-frances-competition-watchdog/", "default"));
        viewArticles.add(new Article("Windows 10 is now on 1 billion devices", "https://www.cnet.com/news/windows-10-is-now-on-1-billion-devices/", "default"));
        viewArticles.add(new Article("Apple announces $149 Powerbeats with 15 hours of battery life", "https://www.theverge.com/2020/3/16/21181279/apple-beats-powerbeats-4-wireless-earbuds-announced-features", "default"));
    }

    /**
     * Main entry-point for the java.techtoday application.
     */
    public static void main(String[] args) {
        greet();
        Ui ui = new Ui(savedArticles);
        Features features = new Features(savedArticles, viewArticles);
        getViewArticles();
        while (isRunning) {
            String userResponse = ui.getCommand();
            String command = userResponse.split(" ")[0];
            String restOfUserInput = userResponse.replace(command, "").trim();

            if (command.equals("view")) {
                ui.printArticles(viewArticles);
            } else if (command.equals("save")) {
                features.saveView(restOfUserInput);
            } else if (command.equals("list")) {
                features.list();
            } else if (command.equals("add")) {
                features.addArticle();
            } else if (command.equals("delete")) {
                features.delete(restOfUserInput);
            } else if (command.equals("create")) {
                // do create command
            } else if (command.equals("exit")) {
                isRunning = false;
            } else {
                System.out.println("Invalid command! Please try again!");
            }
        }
    }
}

