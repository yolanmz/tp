package seedu.techtoday.objects;


/**
 * Main class for Article objects.
 */
public class Article {

    public String title;
    public String url;
    public String category;
    public String extract;
    public int timeStamp;
    
    /**
     * Constructor for article class.
     * @param title - The article title given by the user.
     * @param url - The url given by the user.
     * @param category - The category set as default initially.
     */
    public Article(String title, String url, String category) {
        this.title = title;
        this.url = url;
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
        return url;
    }

    public String getTitle(){
        return title;
    }

    public int getTimeStamp(){
        return timeStamp;
    }



}

