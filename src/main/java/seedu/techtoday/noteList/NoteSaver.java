package seedu.techtoday.noteList;

import seedu.techtoday.objects.Note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class NoteSaver extends SavedNoteList {

    public NoteSaver() {
        super();
    }

    public static void execute(ArrayList<Note> taskList, String command){
        System.out.println("Enter the title of the note: ");
        Scanner titleInput = new Scanner(System.in);
        String title = titleInput.nextLine();
        System.out.println("Enter the note here: ");
        Scanner noteInput = new Scanner(System.in);
        String extract = noteInput.nextLine();
        Note noteToSave = new Note(title, extract, Instant.now().getEpochSecond() + "");
        //add the note
        System.out.println("Done, saved the note with the following details:");
        NotePrinter.printIsolatedNote(noteToSave);
        NoteAdder.execute(SavedNoteList.savedNoteList, noteToSave);
    }
}
