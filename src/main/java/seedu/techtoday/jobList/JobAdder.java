package seedu.techtoday.jobList;

import java.util.ArrayList;

import seedu.techtoday.objects.Job;

public class JobAdder extends ViewedJobList {

    public JobAdder(){
        super();
    }

    public static void execute(ArrayList<Job> jobList, Job job) {
        jobList.add(job);
    }
}
