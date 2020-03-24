package seedu.techtoday.notelist;

import seedu.techtoday.objects.Note;
import java.util.ArrayList;

public class NoteAdder extends SavedNoteList {

    public NoteAdder() {
        super();
    }

    public static void execute(ArrayList<Note> noteList, Note note) {
        noteList.add(note);
    }
}
