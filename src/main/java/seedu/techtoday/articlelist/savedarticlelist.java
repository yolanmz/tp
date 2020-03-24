package seedu.techtoday.articlelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class savedarticlelist {

    public static ArrayList<Article> savedArticleList;

    /** Initializes a new taskList.  */
    public savedarticlelist() {
        savedArticleList = new ArrayList<Article>();
    }
}
