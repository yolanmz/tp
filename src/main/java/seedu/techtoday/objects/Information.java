package seedu.techtoday.objects;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Structure for an information.
 */
public class Information {
    protected String title;
    protected String extract;
    protected String timeStamp;
    protected String category;

    /**
     * Constructor for the Information class.
     * @param title - String representing the title
     * @param extract - String representing the extract
     * @param timeStamp - String representing the timestamp
     */
    public Information(String title, String extract, String timeStamp) {
        this.title = title;
        this.extract = extract;
        this.timeStamp = timeStamp;
    }

    /**
     * This methods sets an extract for a given article.
     * @param info Information object represting a news article.
     * @param extract An extract from the news info.
     */
    public void setExtract(Information info, String extract) {
        info.extract = extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }

    /**
     * This method sets a date for an article.
     * @param stamper An integer representing the timestamp of the article
     */
    public void setTimeStamp(int stamper) {
        String pattern = "yyyy-MMM-dd E hh:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format((new Date((long)stamper * 1000)));
        this.timeStamp = date;
    }

    public String getTitle() {
        return title;
    }

    public String getExtract() {
        return extract;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getCategory() {
        return category;
    }

    public void setTime(String timeStamp) {
        this.timeStamp = timeStamp;
    }

}
