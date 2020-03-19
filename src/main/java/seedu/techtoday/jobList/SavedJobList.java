package seedu.techtoday.jobList;

import java.util.ArrayList;
import seedu.techtoday.objects.Job;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class SavedJobList {

    public static ArrayList<Job> savedJobList;

    /** Initializes a new taskList.  */
    public SavedJobList(){
        savedJobList = new ArrayList<Job>();
    }
}