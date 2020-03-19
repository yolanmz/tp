package seedu.techtoday;

import seedu.techtoday.api.apiviewjobs.JsonJobsReader;
import seedu.techtoday.api.apiviewnews.JsonNewsReader;
import seedu.techtoday.articleList.SavedArticleList;
import seedu.techtoday.articleList.ViewedArticleList;
import seedu.techtoday.articleList.ArticleSaver;
import seedu.techtoday.jobList.SavedJobList;
import seedu.techtoday.jobList.ViewedJobList;
import seedu.techtoday.ui.Ui;
import seedu.techtoday.articleList.ArticleListPrinter;
import seedu.techtoday.articleList.ArticleDeleter;

import static seedu.techtoday.common.Messages.greet;

import java.io.IOException;

public class TechToday {
    public static boolean isRunning = true;
    public ViewedArticleList viewedArticleList;
    public SavedArticleList savedArticleList;
    public ViewedJobList viewedJobList;
    public SavedJobList savedJobList;

    public TechToday(){
        viewedArticleList = new ViewedArticleList();
        savedArticleList = new SavedArticleList();
        viewedJobList = new ViewedJobList();
        savedJobList= new SavedJobList();
    }

    /**
     * Main entry-point for the java.techtoday application.
     */
    public static void main(String[] args) {
        new TechToday();
        greet();

        while (isRunning) {
            String userResponse = Ui.getCommand();
            String command = userResponse.split(" ")[0];
            String restOfUserInput = userResponse.replace(command, "").trim();

            if (command.equals("jobs")) {
                try {
                    JsonJobsReader.viewNewJobs();
                } catch (IOException e){
                }
            } else if (command.equals("news")) {
                try {
                    JsonNewsReader.viewNewNews();
                } catch (IOException e){
                }
            } else if (command.equals("exit")){
                isRunning = false;
            } else if (command.equals("save")){
                ArticleSaver.execute(SavedArticleList.savedArticleList, userResponse);
            } else if (command.equals("list")){
                ArticleListPrinter.execute(SavedArticleList.savedArticleList);
            }
            else if (command.equals("delete")){
                ArticleDeleter.execute(SavedArticleList.savedArticleList, userResponse);
            }
            else {
                System.out.println("Command not found, try again");
                isRunning = false;
            }
        }
    }
}

