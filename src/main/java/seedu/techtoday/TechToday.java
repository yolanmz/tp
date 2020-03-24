package seedu.techtoday;

import seedu.techtoday.api.apiviewjobs.JsonJobsReader;
import seedu.techtoday.api.apiviewnews.JsonNewsReader;
import seedu.techtoday.articlelist.ArticleDeleter;
import seedu.techtoday.articlelist.ArticleListPrinter;
import seedu.techtoday.articlelist.ArticlePrinter;
import seedu.techtoday.articlelist.ArticleSaver;
import seedu.techtoday.articlelist.SavedArticleList;
import seedu.techtoday.articlelist.ViewedArticleList;
import seedu.techtoday.articlelist.TitleSorter;
import seedu.techtoday.creator.ManualArticleCreator;
import seedu.techtoday.creator.ManualJobCreator;
import seedu.techtoday.joblist.SavedJobList;
import seedu.techtoday.joblist.ViewedJobList;
import seedu.techtoday.joblist.JobDeleter;
import seedu.techtoday.joblist.JobListPrinter;
import seedu.techtoday.joblist.JobPrinter;
import seedu.techtoday.notelist.SavedNoteList;
import seedu.techtoday.notelist.NotePrinter;
import seedu.techtoday.notelist.NoteListPrinter;
import seedu.techtoday.notelist.NoteSaver;
import seedu.techtoday.notelist.NoteDeleter;
import seedu.techtoday.objects.Article;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;
import seedu.techtoday.storage.ArticleToFileSaver;
import seedu.techtoday.storage.InBuiltArticleListGenerator;
import seedu.techtoday.storage.InBuiltJobListGenerator;
import seedu.techtoday.storage.JobToFileSaver;
import seedu.techtoday.storage.Loader;
import seedu.techtoday.storage.NoteToFileSaver;
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


        // while loop that keeps running the techToday program.
        while (isRunning) {
            String userResponse = Ui.getCommand();
            String command = userResponse.split(" ")[0];
            String restOfUserInput = userResponse.replace(command, "").trim();

            ViewedArticleList.sort();
            SavedArticleList.sort();
            //ViewedJobList.sort();
            //SavedJobList.sort();
            //SavedNoteList.sort();

            switch (command) {
            case "view": {
                String type = userResponse.split(" ")[1];
                if (type.equals("job")) {
                    try {
                        JsonJobsReader.viewNewJobs();
                    } catch (IOException e) {
                        System.out.println("Your device is not connected to the internet, " 
                                           + "we will load pre-existing jobs");
                        InBuiltJobListGenerator.execute();
                        JobListPrinter.execute(SavedJobList.savedJobList);
                    }
                } else if (type.equals("article")) {
                    try {
                        JsonNewsReader.viewNewNews();
                    } catch (IOException e) {
                        System.out.println("Your device is not connected to the internet, " 
                                           + "we will load pre-existing articles");
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
                    ArticleSaver.execute(SavedArticleList.savedArticleList, userResponse);
                    break;
                }
                case "job": {
                    seedu.techtoday.joblist.JobSaver.execute(SavedJobList.savedJobList, userResponse);
                    break;
                }
                case "note": {
                    NoteSaver.execute(SavedNoteList.savedNoteList, userResponse);
                    break;
                }
                default: {
                    System.out.println("Invalid command for save!");
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
                } default: {
                    System.out.println("Invalid command for list!");
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
                } default: {
                    System.out.println("Invalid command for create!");
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
                } default: {
                    System.out.println("Invalid command for delete!");
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
                default: {
                    System.out.println("Invalid command for addinfo!");
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

