package seedu.techtoday;

import seedu.techtoday.api.apiviewjobs.JsonJobsReader;
import seedu.techtoday.api.apiviewnews.JsonNewsReader;
import seedu.techtoday.articleList.SavedArticleList;
import seedu.techtoday.articleList.ViewedArticleList;
import seedu.techtoday.articleList.ArticleDeleter;
import seedu.techtoday.articleList.ArticleListPrinter;
import seedu.techtoday.articleList.ArticlePrinter;
import seedu.techtoday.creator.ManualArticleCreator;
import seedu.techtoday.creator.ManualJobCreator;
import seedu.techtoday.jobList.SavedJobList;
import seedu.techtoday.jobList.ViewedJobList;
import seedu.techtoday.jobList.JobDeleter;
import seedu.techtoday.jobList.JobListPrinter;
import seedu.techtoday.jobList.JobPrinter;
import seedu.techtoday.noteList.SavedNoteList;
import seedu.techtoday.noteList.NotePrinter;
import seedu.techtoday.noteList.NoteListPrinter;
import seedu.techtoday.noteList.NoteSaver;
import seedu.techtoday.noteList.NoteDeleter;
import seedu.techtoday.objects.Article;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;
import seedu.techtoday.storage.*;
import seedu.techtoday.ui.Ui;
import seedu.techtoday.creator.ManualNoteCreator;

import static seedu.techtoday.common.Messages.greet;
import java.io.File;

import java.io.IOException;

/**
 * <h1>TechToday News/Jobs/Notes for technology related information for the technologist.</h1>
 * Entry point of the "TechToday" application.
 * Initializes the application and starts the interaction with the user.
 * <b>Note:</b> This application is written for CS2113 for tp at the NUS School of computing.
 * @author  Alaukik, Kate, Melissa, Yolanda,
 * @since   2020-03-27
 */
public class TechToday {

    /** Version info of the program. */
    public static final String VERSION = "Hiroshi Nagai - Version 1.0";

    public static boolean isRunning = true;
    public ViewedArticleList viewedArticleList;
    public SavedArticleList savedArticleList;
    public ViewedJobList viewedJobList;
    public SavedJobList savedJobList;
    public SavedNoteList savedNoteList;

    /** Constructor that initializes the data structures that saves technology information. */
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

        File articleListFile = new File("articleList.json");
        File jobListFile = new File("articleList.json");
        File noteListFile = new File("noteList.json");

        boolean existsArticle = articleListFile.exists();
        boolean existsJob = jobListFile.exists();
        boolean existsNote = noteListFile.exists();

        if (existsArticle & existsJob & existsNote) {
            Loader.execute("articleList.json", "jobList.json",
                    "noteList.json");
        } else {
            System.out.println("No files detected, we will create out own");
        }



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
                        System.out.println("Your device is not connected to the internet, we will load pre-existing jobs");
                        InBuiltJobListGenerator.execute();
                        JobListPrinter.execute(SavedJobList.savedJobList);
                    }
                } else if (type.equals("article")) {
                    try {
                        JsonNewsReader.viewNewNews();
                    } catch (IOException e) {
                        System.out.println("Your device is not connected to the internet, we will load pre-existing articles");
                        InBuiltArticleListGenerator.execute();
                        ArticleListPrinter.execute(SavedArticleList.savedArticleList);
                    }
                }
                break;
            } case "exit": {
                ArticleToFileSaver.execute(SavedArticleList.savedArticleList, "articleList.json");
                JobToFileSaver.execute(SavedJobList.savedJobList, "jobList.json");
                NoteToFileSaver.execute(SavedNoteList.savedNoteList, "noteList.json");
                isRunning = false;
                break;
            } case "save": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article": {
                        seedu.techtoday.articleList.ArticleSaver.execute(SavedArticleList.savedArticleList, userResponse);
                        break;
                    }
                    case "job": {
                        seedu.techtoday.jobList.JobSaver.execute(SavedJobList.savedJobList, userResponse);
                        break;
                    }
                    case "note": {
                        NoteSaver.execute(SavedNoteList.savedNoteList, userResponse);
                        break;
                    }
                }
                break;
            } case "list": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article": {
                        ArticleListPrinter.execute(SavedArticleList.savedArticleList);
                        break;
                    }

                    case "job": {
                        JobListPrinter.execute(SavedJobList.savedJobList);
                        break;
                    }
                    case "note": {
                        NoteListPrinter.execute(SavedNoteList.savedNoteList);
                        break;
                    }
                }
                break;
            } case "create": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                case "article": {
                    ManualArticleCreator.execute();
                    break;
                }
                case "job": {
                    ManualJobCreator.execute();
                    break;
                }
                case "note": {
                    ManualNoteCreator.execute();
                    break;
                }
                }
                break;

            } case "delete": {
                String type = userResponse.split(" ")[1];
                switch (type) {
                    case "article": {
                        ArticleDeleter.execute(userResponse);
                        break;
                    }
                    case "job": {
                        JobDeleter.execute(SavedJobList.savedJobList, userResponse);
                        break;
                    }
                    case "note": {
                        NoteDeleter.execute(SavedNoteList.savedNoteList, userResponse);
                        break;
                    }
                }
                break;
            } case "addinfo": {
                String type = userResponse.split(" ")[1];
                int index = Integer.parseInt(userResponse.split(" ")[2]) - 1;
                String extract = userResponse.split(" ", 4)[3];
                switch (type) {
                    case "article": {
                        Article article = SavedArticleList.savedArticleList.get(index);
                        article.setExtract(article, extract);
                        ArticlePrinter.printIsolatedArticle(article);
                        break;
                    }
                    case "job": {
                        Job job = SavedJobList.savedJobList.get(index);
                        job.setExtract(job, extract);
                        JobPrinter.printIsolatedJob(job);
                        break;
                    }
                    case "note": {
                        Note note = SavedNoteList.savedNoteList.get(index);
                        note.setExtract(note, extract);
                        NotePrinter.printIsolatedNote(note);
                        break;
                    }
                }
                break;
            } default: {
                System.out.println("Command not found, try again");
                isRunning = false;
                break;
                }
            }
        }
    }
}

