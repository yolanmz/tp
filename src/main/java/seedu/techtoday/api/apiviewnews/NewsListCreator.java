//package seedu.techtoday.api.apiviewnews;
//
//import java.io.IOException;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//
///** Represents a creates a list of news that can be viewed by the user. */
//public class NewsListCreator {
//
//    /**
//     * Takes a url and pick 5 top stories to print.
//     *
//     * @param url URL  with a list of user stories identified by their story number(check url)
//     *            (example: "https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty").
//     * @throws IOException IO exception.
//     * @throws JSONException JSON exception.
//     */
//    public static void execute(String url) throws IOException, JSONException {
//
//        String indicesStr = JsonParser.readJsonArrayfromUrl(url);
//        int[] indicesArr = JsonParser.stringToArray(indicesStr);
//        for (int i = 0; i < indicesArr.length; i++) {
//            String headOfUrl = "https://hacker-news.firebaseio.com/v0/item/";
//            String midUrl = Integer.toString(indicesArr[i]);
//            String tailUrl = ".json?print=pretty";
//            String finalUrl = headOfUrl + midUrl + tailUrl;
//
//            // Creating a news each time
//            JSONObject rawNews = JsonParser.readJsonFromUrl(finalUrl);
//            JSONObject processedNews = NewsCreator.rawToProcessedNews(rawNews);
//
//            System.out.println(processedNews.toString());
//
//
//            //Adding it to bigger newslist
//            JsonJobsReader.newsList.put(Integer.toString(JsonJobsReader.index), processedNews);
//
//            //Incrementing Index
//            JsonJobsReader.index += 1;
//        }
//        System.out.println(JsonJobsReader.newsList.toString(10));
//        //return (JsonJobsReader.newsList.toString(10));
//    }
//}
