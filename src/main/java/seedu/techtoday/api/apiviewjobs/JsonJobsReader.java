package seedu.techtoday.api.apiviewjobs;

import java.io.IOException;
import org.json.JSONException;
import seedu.techtoday.api.apiviewnews.ViewedArticleListCreator;
import seedu.techtoday.articleList.ArticleListPrinter;
import seedu.techtoday.articleList.ViewedArticleList;


/** Represents a class that reads a URL as a JSON objecs. */
public class JsonJobsReader {

    /**
     * Takes a url with a list of user stories identified by their story number(check url) and picks 5
     * top stories for the user to view.
     *
     */

    public static void viewNewJobs() throws IOException, JSONException {
        ViewedArticleListCreator.execute("https://hacker-news.firebaseio.com/v0/askstories.json?print=pretty");
        ArticleListPrinter.execute(ViewedArticleList.viewedArticleList);
    }
}

