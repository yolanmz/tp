package seedu.techtoday.articlelist;

import seedu.techtoday.objects.Article;
import java.util.ArrayList;

public class articlesaver extends savedarticlelist {

    public articlesaver() {
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
        Article articleToSave = viewedarticlelist.viewedArticleList.get(commandNumber);
        //add the article
        System.out.println("Done, saved the article with the following details:");
        articleprinter.printIsolatedArticle(articleToSave);
        articleadder.execute(savedarticlelist.savedArticleList, articleToSave);
    }
}
