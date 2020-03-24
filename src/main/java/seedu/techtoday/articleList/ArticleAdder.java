package seedu.techtoday.articleList;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

public class ArticleAdder extends ViewedArticleList {

    public ArticleAdder() {
        super();
    }

    public static void execute(ArrayList<Article> articleList, Article article) {
        articleList.add(article);
    }
}
