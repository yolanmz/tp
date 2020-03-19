package seedu.techtoday.articleList;

import seedu.techtoday.objects.Article;

public class ArticlePrinter {
    public static void execute(int taskCounter, Article article) {
        String timestamp = Integer.toString(article.getTimeStamp());
        String title = article.getTitle();
        String url = article.getUrl();
        System.out.println(taskCounter + ". " + timestamp + " [" + title + "] " + url);
    }

    public static void printIsolatedArticle(Article article){
        String timestamp = Integer.toString(article.getTimeStamp());
        String title = article.getTitle();
        String url = article.getUrl();
        System.out.println(timestamp + " [" + title + "] " + url);
    }

}
