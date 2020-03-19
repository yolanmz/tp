package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;

public class JobPrinter {
    public static void execute(int taskCounter, Job job) {
        String timestamp = Integer.toString(job.getTimeStamp());
        String title = job.getTitle();
        String url = job.getUrl();
        System.out.println(taskCounter + ". " + timestamp + " [" + title + "] " + url);
    }

    public static void printIsolatedJob(Job job){
        String timestamp = Integer.toString(job.getTimeStamp());
        String title = job.getTitle();
        String url = job.getUrl();
        System.out.println(timestamp + " [" + title + "] " + url);
    }

}
