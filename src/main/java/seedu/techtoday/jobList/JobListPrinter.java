package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;
import java.util.ArrayList;

public class JobListPrinter {
    /**
     * Prints all available tasks.
     *
     * @param jobList List that stores the jobs mentioned until now.
     */
    public static void execute(ArrayList<Job> jobList) {
        int taskCounter = 1;
        for (Job job : jobList) {
            JobPrinter.execute(taskCounter, job);
            taskCounter += 1;
        }
    }


}