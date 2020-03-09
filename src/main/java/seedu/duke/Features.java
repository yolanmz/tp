package seedu.duke;


import java.util.Scanner;
import java.util.ArrayList;

public class Features {

    public static ArrayList<Article> savedArticles;
    public static ArrayList<Article> viewArticles;
    
    /**
    * Add an article found outside the program.
    */
    public void addArticle() {
        System.out.println("Enter the name of the article: ");
        Scanner in = new Scanner(System.in);
        String articleName = in.nextLine();
        System.out.println("Enter the url of the article: ");
        String articleUrl = in.nextLine();
        Article toAdd = new Article(articleName, articleUrl);
        savedArticles.add(toAdd);
        System.out.println("You saved a new article: " + toAdd);
    }


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
