package seedu.techtoday.articlelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class ViewedArticleList {

    /** Class variable that represents a the viewedArticle list. */
    public static ArrayList<Article> viewedArticleList;

    /** Initializes a new taskList.  */
    public ViewedArticleList() {
        viewedArticleList = new ArrayList<Article>();
    }

    /**
     * Function that sorts article objects by title.
     */
    public static void sort() {
        viewedArticleList.sort(new ArticleTitleSorter());
    }
}