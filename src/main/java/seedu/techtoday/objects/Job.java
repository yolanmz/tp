package seedu.techtoday.objects;


/**
 * Main class for Job objects.
 */
public class Job {

    public String title;
    public String text;
    public String category;
    public String extract;
    public int timeStamp;

    /**
     * Constructor for Job class.
     * @param title - The article title given by the user.
     * @param text - The text given by the user.
     * @param category - The category set as default initially.
     */
    public Job(String title, String text, String category) {
        this.title = title;
        this.text = text;
        this.category = category;
    }

    /**
     * This methods sets an extract for a given article.
     *
     * @param article Article object represting a news article.
     * @param extract An extract from the news article.
     */
    public void setExtract(Article article, String extract){
        article.extract = extract;
    }

    /**
     * This method sets a date for an article.
     * @param stamper An integer representing the timestamp of the article
     */
    public void setTimeStamp(int stamper){
        this.timeStamp = stamper;
    }

    public String getUrl() {
        return text;
    }

    public String getTitle(){
        return title;
    }

    public int getTimeStamp(){
        return timeStamp;
    }

}

