package seedu.techtoday.articlelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Article;

public class articleadder extends viewedarticlelist {

    public articleadder() {
        super();
    }

    public static void execute(ArrayList<Article> articleList, Article article) {
        articleList.add(article);
    }
}
