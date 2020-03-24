package seedu.techtoday.articlelist;

import seedu.techtoday.objects.Article;
import java.util.ArrayList;

public class articlelistprinter {
    /**
     * Prints all available tasks.
     *
     * @param articleList List that stores the tasks mentioned until now.
     */
    public static void execute(ArrayList<Article> articleList) {
        int taskCounter = 1;
        for (Article article : articleList) {
            articleprinter.execute(taskCounter, article);
            taskCounter += 1;
        }
    }
}
