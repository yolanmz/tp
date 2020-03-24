package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;
import java.util.ArrayList;

public class JobSaver extends SavedJobList {

    public JobSaver() {
        super();
    }

    /**
     * ADD JAVADOC.
     * @param taskList - ADD HERE.
     * @param command - ADD HERE.
     */
    public static void execute(ArrayList<Job> taskList, String command) {
        String[] commandArray = command.split(" ");
        int commandNumber = Integer.parseInt(commandArray[2]) - 1;
        Job jobToSave = ViewedJobList.viewedJobList.get(commandNumber);
        //add the job
        System.out.println("Done, saved the job with the following details:");
        JobPrinter.printIsolatedJob(jobToSave);
        JobAdder.execute(SavedJobList.savedJobList, jobToSave);
    }
}
