package seedu.techtoday.articlelist;

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
        System.out.println(taskCounter + ". Title: " + title + System.lineSeparator()
                                + "   Date: " + timestamp + System.lineSeparator()
                                + "   Category: " + category + System.lineSeparator()
                                + "   Url: " + url + System.lineSeparator()
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
        System.out.println("   Title: " + title + System.lineSeparator()
                                + "   Date: " + timestamp + System.lineSeparator()
                                + "   Category: " + category + System.lineSeparator()
                                + "   Url: " + url + System.lineSeparator()
                                + "   Extract: " + extract);
    }
}
