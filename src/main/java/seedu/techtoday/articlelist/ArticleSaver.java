package seedu.techtoday.articlelist;

import seedu.techtoday.objects.Article;
import java.util.ArrayList;

public class ArticleSaver extends SavedArticleList {

    public ArticleSaver() {
        super();
    }

    /**
     * ADD JAVADOC.
     * @param taskList - ADD HERE.
     * @param command - ADD HERE.
     */
    public static void execute(ArrayList<Article> taskList, String command) {
        String[] commandArray = command.split(" ");
        int commandNumber = Integer.parseInt(commandArray[2]) - 1;
        Article articleToSave = ViewedArticleList.viewedArticleList.get(commandNumber);
        //add the article
        System.out.println("Done, saved the article with the following details:");
        ArticlePrinter.printIsolatedArticle(articleToSave);
        ArticleAdder.execute(SavedArticleList.savedArticleList, articleToSave);
    }
}
