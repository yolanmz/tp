package seedu.techtoday.apiview;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;


/** Represents a class that reads a URL as a JSON objecs. */
public class JsonReader {

    public static JSONObject newsList = new JSONObject();

    public static  int index = 1;

    /**
     * Takes a url with a list of user stories identified by their story number(check url) and picks 5
     * top stories for the user to view.
     *
     */

    public static void viewNewNews() throws IOException, JSONException {
        NewsListCreator.execute("https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty");
    }
}

