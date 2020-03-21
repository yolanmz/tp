package seedu.techtoday.creator;

import seedu.techtoday.jobList.JobPrinter;
import seedu.techtoday.jobList.SavedJobList;

import seedu.techtoday.objects.Job;
import seedu.techtoday.ui.Ui;

public class ManualJobCreator {
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
