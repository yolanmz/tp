package seedu.techtoday.api.apiviewjobs;

import org.json.JSONObject;
import seedu.techtoday.objects.Job;

/** Create news creates a JSON object for 1 news article fetched through the API. */
public class JobsCreator {


    /**
     * Returns an article object from a JSONObject representing a news article from the internet
     * @param json JSON object representing a news article.
     * @return Article - article representing jsonObject from internet.
     */
    public static Job rawToProcessedJob(JSONObject json) {
        String title = json.get("title").toString();
        int timeStamp = Integer.parseInt(json.get("time").toString());
        String text;
        try {
            text = json.get("text").toString();
        } catch (Exception e) {
            text = "text Not provided";
        }
        Job job = new Job(title, text, "default");
        job.setTimeStamp(timeStamp);
        return job;
    }
}