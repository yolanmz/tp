package seedu.techtoday.joblist;

import seedu.techtoday.objects.Job;

import java.util.Comparator;

/**
 * Class to help sort jobs by title.
 */
public class JobTitleSorter implements Comparator<Job> {
    @Override
    public int compare(Job j1, Job j2) {
        return j1.getTitle().compareToIgnoreCase(j2.getTitle());
    }
}
