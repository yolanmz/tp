package seedu.techtoday.creator;

import seedu.techtoday.articleList.SavedArticleList;
import seedu.techtoday.articleList.ArticlePrinter;
import seedu.techtoday.objects.Article;
import seedu.techtoday.ui.Ui;

public class ManualArticleCreator {
    public static void execute() {
        System.out.println("Enter the title of the article?");
        String title = Ui.getCommand();
        System.out.println("What is the URl of the article (type \"No URL\")?");
        String url = Ui.getCommand();
        System.out.println("What is the category (type \"default\" if you done know it)");
        String category = Ui.getCommand();
        String epochSecond = CurrentTimeFetcher.execute();
        Article article = new Article(title, url, category);
        article.setTime(epochSecond);
        SavedArticleList.savedArticleList.add(article);
        System.out.println("Done, we have added the following job to your list of saved jobs");
        ArticlePrinter.printIsolatedArticle(article);
    }
}

