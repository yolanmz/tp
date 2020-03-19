package seedu.techtoday.api.apiviewnews;

import org.json.JSONObject;
import seedu.techtoday.objects.Article;

/** Create news creates a JSON object for 1 news article fetched through the API. */
public class NewsCreator {

//    /**
//     * Takes a JSON object representing one new news and filters any unnecessary titles from the news article.
//     * @param json takes a JSON object representing one rews article
//     * @return newsDetails a JSON object representing only the necessary parts of that particular JSON news object.
//     */
//    public static JSONObject rawToProcessedNews(JSONObject json) {
//        String title = json.get("title").toString();
//        String timeStamp = json.get("time").toString();
//        String url = json.get("url").toString();
//        JSONObject newsDetails = new JSONObject();
//        newsDetails.put("title", title);
//        newsDetails.put("timeStamp", timeStamp);
//        newsDetails.put("url", url);
//        return newsDetails;
//    }

    /**
     * Returns an article object from a JSONObject representing a news article from the internet
     * @param json JSON object representing a news article.
     * @return Article - article representing jsonObject from internet.
     */
    public static Article rawToProcessedNews(JSONObject json) {
        String title = json.get("title").toString();
        int timeStamp = Integer.parseInt(json.get("time").toString());
        String url;
        try {
            url = json.get("url").toString();
        } catch (Exception e) {
            url = "URL Not provided";
        }
        Article article = new Article(title, url, "default");
        article.setTimeStamp(timeStamp);
        return article;
    }
}
