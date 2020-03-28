package seedu.techtoday.articlelist;

import seedu.techtoday.objects.Article;
import java.util.Comparator;

/** Class to help sort articles by title. */
public class ArticleTitleSorter implements Comparator<Article> {
    @Override
    public int compare(Article art1, Article art2) {
        return art1.getTitle().compareToIgnoreCase(art2.getTitle());
    }
}
