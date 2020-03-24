package seedu.techtoday.creator;

import seedu.techtoday.joblist.JobPrinter;
import seedu.techtoday.joblist.SavedJobList;

import seedu.techtoday.objects.Job;
import seedu.techtoday.ui.Ui;

/**
 * ADD JAVADOC.
 */
public class ManualJobCreator {
    /**
     * ADD JAVADOC.
     */
    public static void execute() {
        System.out.println("Enter the title of the job?");
        String title = Ui.getCommand();
        System.out.println("What is the job description?");
        String text = Ui.getCommand();
        System.out.println("What is the category (type \"default\" if you done know it)");
        String category = Ui.getCommand();
        String epochSecond = CurrentTimeFetcher.execute();
        Job job = new Job(title, text, category);
        job.setTime(epochSecond);
        SavedJobList.savedJobList.add(job);
        System.out.println("Done, we have added the job to your list of saved jobs");
        JobPrinter.printIsolatedJob(job);
    }
}
