package seedu.duke;

public class Article {

    public static  String name;
    public static String url;


    public Article(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public String toString() {
        return (name + ": " + url);
    }
}