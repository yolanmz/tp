package seedu.techtoday.articlelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

public class Articleadder extends viewedarticlelist {

    public Articleadder() {
        super();
    }

    public static void execute(ArrayList<Article> articleList, Article article) {
        articleList.add(article);
    }
}
