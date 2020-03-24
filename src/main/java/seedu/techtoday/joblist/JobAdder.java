package seedu.techtoday.joblist;

import seedu.techtoday.objects.Job;

import java.util.ArrayList;

public class JobAdder extends ViewedJobList {

    public JobAdder() {
        super();
    }

    public static void execute(ArrayList<Job> jobList, Job job) {
        jobList.add(job);
    }
}
