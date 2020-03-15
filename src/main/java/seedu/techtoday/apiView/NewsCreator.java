package seedu.techtoday.apiView;

import org.json.JSONObject;

/** Create news creates a JSON object for 1 news article fetched through the API*/
public class NewsCreator {

    /**
     * Takes a JSON object representing one new news and filters any unnecessary titles from the news article.
     *
     * @param json takes a JSON object representing one rews article
     * @return newsDetails a JSON object representing only the necessary parts of that particular JSON news object.
     */
    public static JSONObject rawToProcessedNews(JSONObject json){
        String title = json.get("title").toString();
        String timeStamp = json.get("time").toString();
        String url = json.get("url").toString();
        JSONObject newsDetails = new JSONObject();
        newsDetails.put("title", title);
        newsDetails.put("timeStamp", timeStamp);
        newsDetails.put("url", url);
        return newsDetails;
    }
}
