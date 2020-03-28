package seedu.techtoday.commands;

import seedu.techtoday.articlelist.ArticlePrinter;
import seedu.techtoday.articlelist.SavedArticleList;
import seedu.techtoday.common.Messages;
import seedu.techtoday.joblist.JobPrinter;
import seedu.techtoday.joblist.SavedJobList;
import seedu.techtoday.notelist.NotePrinter;
import seedu.techtoday.notelist.SavedNoteList;
import seedu.techtoday.objects.Article;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;

/** Class that represents the addition of extracts to information objects. */
public class InformationAdder {

    /**
     * Executes the addinfo feature.
     * @param userResponse - Command that the user adds to the command line.
     */
    public static void execute(String userResponse) {
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
                System.out.println("addinfo command or its index incorrect. It should be of the following form: \n");
                Messages.printInCenter("5. addinfo [article / job / note] [index number] [extract]");
                Messages.printStraightLine();
            }
            }
            return;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Sorry! You can only add extract to article/job/note with valid index number! " +
                    "Your command format is incorrect. Try again ");
            Messages.printStraightLine();
            return;
        }
    }
}
