package seedu.techtoday.joblist;

import java.util.ArrayList;
import seedu.techtoday.objects.Job;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class ViewedJobList {

    public static ArrayList<Job> viewedJobList;

    /** Initializes a new taskList.  */
    public ViewedJobList() {
        viewedJobList = new ArrayList<Job>();
    }
}