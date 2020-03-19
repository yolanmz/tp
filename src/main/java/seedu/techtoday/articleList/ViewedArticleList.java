package seedu.techtoday.articleList;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class ViewedArticleList {

    public static ArrayList<Article> viewedArticleList;

    /** Initializes a new taskList.  */
    public ViewedArticleList(){
        viewedArticleList = new ArrayList<Article>();
    }
}