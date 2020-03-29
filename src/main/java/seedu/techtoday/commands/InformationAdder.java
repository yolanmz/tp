package seedu.techtoday.commands;

import seedu.techtoday.articlelist.ArticlePrinter;
import seedu.techtoday.articlelist.SavedArticleList;
import seedu.techtoday.common.CommonMethods;
import seedu.techtoday.common.Messages;
import seedu.techtoday.joblist.JobPrinter;
import seedu.techtoday.joblist.SavedJobList;
import seedu.techtoday.notelist.NotePrinter;
import seedu.techtoday.notelist.SavedNoteList;
import seedu.techtoday.objects.Article;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

/** Class that represents the addition of extracts to information objects. */
public class InformationAdder {

    private static final Logger LOGGER = Logger.getLogger(CommonMethods.class.getName());
    private static final String FILE_PATH =  "command.log";

    /**
     * This method is used to initialize and set up LOGGER.
     *
     * @throws IOException when logger set up fails.
     */
    public static void startLogger() throws IOException {
        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);
        FileHandler fileHandler = new FileHandler(FILE_PATH, true);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
    }

    /**
     * Executes the addinfo feature.
     * @param userResponse - Command that the user adds to the command line.
     */
    public static void execute(String userResponse) {
        LOGGER.log(Level.INFO, "\n going to start processing at Information Adder \n");
        try {
            String type = userResponse.split(" ")[1];
            int index = Integer.parseInt(userResponse.split(" ")[2]) - 1;
            String extract = userResponse.split(" ", 4)[3];
            switch (type) {
            case "article": {
                Article article = SavedArticleList.savedArticleList.get(index);
                article.setExtract(article, extract);
                System.out.println("Done, the article description now looks like the following \n");
                ArticlePrinter.printIsolatedArticle(article);
                Messages.printStraightLine();
                break;
            }
            case "job": {
                Job job = SavedJobList.savedJobList.get(index);
                System.out.println("Done, the job description now looks like the following \n");
                job.setExtract(job, extract);
                JobPrinter.printIsolatedJob(job);
                Messages.printStraightLine();
                break;
            }
            case "note": {
                Note note = SavedNoteList.savedNoteList.get(index);
                System.out.println("Done, the note description now looks like the following \n");
                note.setExtract(note, extract);
                NotePrinter.printIsolatedNote(note);
                Messages.printStraightLine();
                break;
            }
            default: {
                System.out.println("addinfo should be of the following form: \n");
                Messages.printInCenter("5. addinfo [article / job / note] [index number] [extract]");
                Messages.printStraightLine();
            }
            }
            LOGGER.log(Level.INFO, "\n Successful \n");
        } catch (IndexOutOfBoundsException e) {
            LOGGER.log(Level.INFO, "\n Index out of bounds for Information Adder. \n");
            System.out.println("Sorry! You can only add extract to article/job/note with valid index number! "
                    + "Your command format is incorrect. Try again ");
            Messages.printStraightLine();
        } catch (NumberFormatException e) {
            LOGGER.log(Level.INFO, "\n Incorrect format alltogether for Information Adder.. \n");
            System.out.println("Sorry! Incorrect command to add extract to "
                    + "article/job/note with valid index number!");
            Messages.printStraightLine();
        }
    }
}
