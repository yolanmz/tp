package seedu.techtoday.articleList;

import seedu.techtoday.objects.Article;

public class ArticlePrinter {
    /**
     * ADD JAVADOC.
     * @param taskCounter - ADD HERE
     * @param article - ADD HERE
     */
    public static void execute(int taskCounter, Article article) {
        String timestamp = article.getTimeStamp();
        String title = article.getTitle();
        String url = article.getUrl();
        String category = article.getCategory();
        String extract = article.getExtract();
        System.out.println(taskCounter + ". Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Category: " + category + "\n"
                                + "   Url: " + url + "\n"
                                + "   Extract: " + extract);
    }

    /**
     * ADD JAVADOC.
     * @param article - ADD HERE
     */
    public static void printIsolatedArticle(Article article) {
        String timestamp = article.getTimeStamp();
        String title = article.getTitle();
        String url = article.getUrl();
        String category = article.getCategory();
        String extract = article.getExtract();
        System.out.println("   Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Category: " + category + "\n"
                                + "   Url: " + url + "\n"
                                + "   Extract: " + extract);
    }
}
