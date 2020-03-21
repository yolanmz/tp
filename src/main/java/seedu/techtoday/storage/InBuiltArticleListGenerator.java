package seedu.techtoday.storage;

import seedu.techtoday.articleList.SavedArticleList;
import seedu.techtoday.objects.Article;
import seedu.techtoday.articleList.ArticleAdder;

public class InBuiltArticleListGenerator {
    public static void execute(){
        String title1 = "How Tailscale Works";
        String title2 = "Tesla Model 3 Vulnerability – Disable Autopilot Notifications, Speedometer, etc.";
        String title3 = "It never makes sense to use foldl on lists";
        String title4 = "George Gershwin, Then and Now";
        String title5 = "AI for generative design: Plain text to 3D Designs";
        String title6 = "Furstenberg and Margulis awarded 2020 Abel Prize";

        String url1 = "https://tailscale.com/blog/how-tailscale-works/";
        String url2 = "https://safekeepsecurity.com/about/cve-2020-10558/";
        String url3 = "https://github.com/hasura/graphql-engine/pull/2933#discussion_r328821960";
        String url4 = "https://www.the-tls.co.uk/articles/summertime-crawford-cambridge-companion-to-gerschwin-calenza-review-russell-davies/";
        String url5 = "https://blog.insightdatascience.com/ai-for-3d-generative-design-17503d0b3943";
        String url6 = "https://www.nature.com/articles/d41586-020-00799-7";

        String timeStampToday = "1584768812";

        Article article1 = new Article(title1, url1, "default");
        Article article2 = new Article(title2, url2, "default");
        Article article3 = new Article(title3, url3, "default");
        Article article4 = new Article(title4, url4, "default");
        Article article5 = new Article(title5, url5, "default");
        Article article6 = new Article(title6, url6, "default");

        article1.setTime(timeStampToday);
        article2.setTime(timeStampToday);
        article3.setTime(timeStampToday);
        article4.setTime(timeStampToday);
        article5.setTime(timeStampToday);
        article6.setTime(timeStampToday);

        ArticleAdder.execute(SavedArticleList.savedArticleList, article1);
        ArticleAdder.execute(SavedArticleList.savedArticleList, article2);
        ArticleAdder.execute(SavedArticleList.savedArticleList, article3);
        ArticleAdder.execute(SavedArticleList.savedArticleList, article4);
        ArticleAdder.execute(SavedArticleList.savedArticleList, article5);
        ArticleAdder.execute(SavedArticleList.savedArticleList, article6);
    }
}
