package seedu.duke;

import java.util.ArrayList;

/**
 * Main class for all the features of TechToday.
 */
public class Features {

    public static ArrayList<Article> savedArticles;
    public static ArrayList<Article> viewArticles;

    /**
     * Saves a chose article from view to the saved articles list.
     * @param command - The command given by the user. 
     */
    public void saveView(String command) {
        int articleNum = Integer.parseInt(command) - 1;
        Article toSave = viewArticles.get(articleNum);
        savedArticles.add(toSave);
        System.out.println("This article has been saved: " + toSave);

    }
}
