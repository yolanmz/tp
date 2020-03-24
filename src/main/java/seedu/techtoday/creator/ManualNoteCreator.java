package seedu.techtoday.creator;

import seedu.techtoday.noteList.NotePrinter;
import seedu.techtoday.objects.Note;

import seedu.techtoday.noteList.SavedNoteList;

import seedu.techtoday.ui.Ui;

/**
 * ADD JAVADOC.
 */
public class ManualNoteCreator {

    public static void execute() {
        System.out.println("Enter the title you would like to give this Note?");
        String title = Ui.getCommand();
        System.out.println("What would you like to add to the extract of this note?");
        String extract = Ui.getCommand();
        String epochSecond = CurrentTimeFetcher.execute();
        Note note = new Note(title, extract, epochSecond);
        SavedNoteList.savedNoteList.add(note);
        System.out.println("Done, we have added the following note to your list of saved notes");
        NotePrinter.printIsolatedNote(note);
    }
}
