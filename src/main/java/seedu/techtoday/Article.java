package seedu.techtoday;


/**
 * Main class for Article objects.
 */
public class Article {

    public static String name;
    public static String url;
    public static String category;
    
    /**
     * Constructor for article class.
     * @param name - The article title given by the user.
     * @param url - The url given by the user.
     * @param category - The category set as default initially.
     */
    public Article(String name, String url, String category) {
        this.name = name;
        this.url = url;
        this.category = category;
    }

    public String toString() {
        return (name + " [" + category + "] : " + url);
    }

}

