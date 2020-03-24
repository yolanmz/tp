package seedu.techtoday.noteList;

import seedu.techtoday.objects.Note;
import java.util.ArrayList;

public class NoteListPrinter {
    /**
     * Prints all available tasks.
     * @param noteList List that stores the jobs mentioned until now.
     */
    public static void execute(ArrayList<Note> noteList) {
        int taskCounter = 1;
        for (Note job : noteList) {
            NotePrinter.execute(taskCounter, job);
            taskCounter += 1;
        }
    }
}
