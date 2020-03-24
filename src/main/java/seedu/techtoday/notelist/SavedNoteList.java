package seedu.techtoday.notelist;

import java.util.ArrayList;
import seedu.techtoday.objects.Note;

/** Represents the data structure, i.e a list of Tasks, that stores the tasks.*/
public class SavedNoteList {
    public static ArrayList<Note> savedNoteList;

    /** Initializes a new taskList.  */
    public SavedNoteList() {
        savedNoteList = new ArrayList<Note>();
    }

    /**
     * Function that sorts Notes objects by title.
     */
    public static void sort() {
        savedNoteList.sort(new NoteTitleSorter());
    }
}
