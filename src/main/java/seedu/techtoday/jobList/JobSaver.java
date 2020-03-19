package seedu.techtoday.jobList;

import seedu.techtoday.objects.Job;
import java.util.ArrayList;

public class JobSaver extends SavedJobList {

    public JobSaver(){
        super();
    }

//    public static Boolean checkSaveorDeleteStatement(ArrayList<Job> jobArrayList, int index){
//        int listLength = jobArrayList.size();
//        if ()
//    }

    public static void execute(ArrayList<Job> taskList, String command){
        String[] commandArray = command.split(" ");
        int commandNumber = Integer.parseInt(commandArray[1]) - 1;
        Job jobToSave = ViewedJobList.viewedJobList.get(commandNumber);
        //add the job
        System.out.println("Done, saved the job with the following details:");
        JobPrinter.printIsolatedJob(jobToSave);
        JobAdder.execute(SavedJobList.savedJobList, jobToSave);
    }


}
