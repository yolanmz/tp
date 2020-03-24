package seedu.techtoday.notelist;

import seedu.techtoday.objects.Note;

import java.util.Comparator;

/**
 * Class to help sort jobs by title.
 */
public class NoteTitleSorter implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return n1.getTitle().compareToIgnoreCase(n2.getTitle());
    }
}
