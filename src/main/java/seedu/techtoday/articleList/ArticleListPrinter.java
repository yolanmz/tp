package seedu.techtoday.articleList;

import seedu.techtoday.objects.Article;
import java.util.ArrayList;

public class ArticleListPrinter {
    /**
     * Prints all available tasks.
     *
     * @param articleList List that stores the tasks mentioned until now.
     */
    public static void execute(ArrayList<Article> articleList) {
        int taskCounter = 1;
        for (Article article : articleList) {
            ArticlePrinter.execute(taskCounter, article);
            taskCounter += 1;
        }
    }


}