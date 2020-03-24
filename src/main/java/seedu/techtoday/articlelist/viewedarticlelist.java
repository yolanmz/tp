package seedu.techtoday.articlelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class viewedarticlelist {

    public static ArrayList<Article> viewedArticleList;

    /** Initializes a new taskList.  */
    public viewedarticlelist() {
        viewedArticleList = new ArrayList<Article>();
    }
}