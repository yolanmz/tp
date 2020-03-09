package seedu.duke;

import java.util.Scanner;
import java.util.ArrayList;

public class Features {

    public static ArrayList<Article> savedArticles;
    
    public void addArticle(){
        System.out.println("Enter the name of the article: ");
        Scanner in = new Scanner(System.in);
        String articleName = in.nextLine();
        System.out.println("Enter the url of the article: ");
        String articleUrl = in.nextLine();
        Article toAdd = new Article(articleName, articleUrl);
        savedArticles.add(toAdd);
        System.out.println("You saved a new article: " + toAdd);
    }
}
