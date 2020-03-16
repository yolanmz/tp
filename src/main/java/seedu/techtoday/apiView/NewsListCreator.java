package seedu.techtoday.apiView;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * Represents a creates a list of news that can be viewed by the user.
 */
public class NewsListCreator {

    /**
     * Takes a url and pick 5 top stories to print.
     *
     * @param url URL  with a list of user stories identified by their story number(check url)
     *            (example: "https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty").
     * @throws IOException
     * @throws JSONException
     */
    public static void execute(String url) throws IOException, JSONException {

        String indicesStr = JsonParser.readJsonArrayfromURL(url);
        int[] indicesArr = JsonParser.stringToArray(indicesStr);
        for (int i = 0; i < indicesArr.length; i++){
            String HEAD_OF_URL = "https://hacker-news.firebaseio.com/v0/item/";
            String midUrl = Integer.toString(indicesArr[i]);
            String TAIL_URL = ".json?print=pretty";
            String URL = HEAD_OF_URL + midUrl + TAIL_URL;

            // Creating a news each time
            JSONObject rawNews= JsonParser.readJsonFromUrl(URL);
            JSONObject processedNews = NewsCreator.rawToProcessedNews(rawNews);

            //Adding it to bigger newslist
            JsonReader.newsList.put(Integer.toString(JsonReader.index), processedNews);

            //Incrementing Index
            JsonReader.index += 1;
        }
        System.out.println(JsonReader.newsList.toString(10));
    }
}
