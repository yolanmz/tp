package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;
import java.util.Date;

public class JobPrinter {
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
