package seedu.techtoday;

import seedu.techtoday.api.apiviewjobs.JsonJobsReader;
import seedu.techtoday.api.apiviewnews.JsonNewsReader;
import seedu.techtoday.articleList.*;
import seedu.techtoday.jobList.*;
import seedu.techtoday.noteList.*;
import seedu.techtoday.objects.Article;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;
import seedu.techtoday.ui.Ui;

import static seedu.techtoday.common.Messages.greet;

import java.io.IOException;

public class TechToday {
    public static boolean isRunning = true;
    public ViewedArticleList viewedArticleList;
    public SavedArticleList savedArticleList;
    public ViewedJobList viewedJobList;
    public SavedJobList savedJobList;
    public SavedNoteList savedNoteList;

    public TechToday() {
        viewedArticleList = new ViewedArticleList();
        savedArticleList = new SavedArticleList();
        viewedJobList = new ViewedJobList();
        savedJobList = new SavedJobList();
        savedNoteList = new SavedNoteList();
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

            switch (command) {
            case "view": {
                String type = userResponse.split(" ")[1];
                if (type.equals("job")) {
                    try {
                        JsonJobsReader.viewNewJobs();
                    } catch (IOException e) {
                    }
                } else if (type.equals("article")) {
                    try {
                        JsonNewsReader.viewNewNews();
                    } catch (IOException e) {
                    }
                }
                break;
            }
            case "exit":
                isRunning = false;
                break;
            case "save": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article":
                        ArticleSaver.execute(SavedArticleList.savedArticleList, userResponse);
                        break;
                    case "job":
                        JobSaver.execute(SavedJobList.savedJobList, userResponse);
                        break;
                    case "note":
                        NoteSaver.execute(SavedNoteList.savedNoteList, userResponse);
                        break;
                }
                break;
            }
            case "list": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article":
                        ArticleListPrinter.execute(SavedArticleList.savedArticleList);
                        break;
                    case "job":
                        JobListPrinter.execute(SavedJobList.savedJobList);
                        break;
                    case "note":
                        NoteListPrinter.execute(SavedNoteList.savedNoteList);
                        break;
                }
                break;
            }
            case "delete": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article":
                        ArticleDeleter.execute(SavedArticleList.savedArticleList, userResponse);
                        break;
                    case "job":
                        JobDeleter.execute(SavedJobList.savedJobList, userResponse);
                        break;
                    case "note":
                        NoteDeleter.execute(SavedNoteList.savedNoteList, userResponse);
                        break;
                }
                break;
            }
            case "addinfo": {
                String type = userResponse.split(" ")[1];
                int index = Integer.parseInt(userResponse.split(" ")[2]) - 1;
                String extract = userResponse.split(" ", 4)[3];
                switch (type) {
                    case "article":
                        Article article = SavedArticleList.savedArticleList.get(index);
                        article.setExtract(article, extract);
                        ArticlePrinter.printIsolatedArticle(article);
                        break;
                    case "job":
                        Job job = SavedJobList.savedJobList.get(index);
                        job.setExtract(job, extract);
                        JobPrinter.printIsolatedJob(job);
                        break;
                    case "note":
                        Note note = SavedNoteList.savedNoteList.get(index);
                        note.setExtract(note, extract);
                        NotePrinter.printIsolatedArticle(note);
                        break;
                }
                break;
            }
            default:
                System.out.println("Command not found, try again");
                isRunning = false;
                break;
            }
        }
    }
}

