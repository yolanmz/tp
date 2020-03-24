package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;
import java.util.Date;

public class JobPrinter {
    /**
     * ADD JAVADOC.
     * @param taskCounter - ADD HERE.
     * @param job - ADD HERE.
     */
    public static void execute(int taskCounter, Job job) {
        String timestamp = job.getTimeStamp();
        String title = job.getTitle();
        String text = job.getText();
        String category = job.getCategory();
        String extract = job.getExtract();
        System.out.println(taskCounter + ". Title: " + title + "\n"
                            + "   Date: " + timestamp + "\n"
                            + "   Category: " + category + "\n"
                            + "   Text: " + text + "\n"
                            + "   Extract: " + extract);
    }

    /**
     * ADD JAVADOC.
     * @param job - ADD HERE.
     */
    public static void printIsolatedJob(Job job) {
        String timestamp = job.getTimeStamp();
        String title = job.getTitle();
        String text = job.getText();
        String category = job.getCategory();
        String extract = job.getExtract();
        System.out.println("   Title: " + title + "\n"
                + "   Date: " + timestamp + "\n"
                + "   Category: " + category + "\n"
                + "   Text: " + text + "\n"
                + "   Extract: " + extract);
    }
}
