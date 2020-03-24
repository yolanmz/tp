package seedu.techtoday.articlelist;

import java.util.ArrayList;
import java.util.Collections;

import seedu.techtoday.objects.Article;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class SavedArticleList {

    public static ArrayList<Article> savedArticleList;

    /** Initializes a new taskList.  */
    public SavedArticleList() {
        savedArticleList = new ArrayList<>();
    }

}
