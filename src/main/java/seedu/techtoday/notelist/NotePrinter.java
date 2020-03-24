package seedu.techtoday.noteList;

import seedu.techtoday.objects.Note;

public class NotePrinter {
    /**
     * ADD JAVA DOC.
     * @param taskCounter - ADD HERE.
     * @param note - ADD HERE.
     */
    public static void execute(int taskCounter, Note note) {
        String timestamp = note.getTimeStamp();
        String title = note.getTitle();
        String extract = note.getExtract();
        System.out.println(taskCounter + ". Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Text: " + extract);
    }

    /**
     * ADD JAVADOC.
     * @param note - ADD HERE.
     */
    public static void printIsolatedNote(Note note) {
        String timestamp = note.getTimeStamp();
        String title = note.getTitle();
        String extract = note.getExtract();
        System.out.println("   Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Text: " + extract);
    }
}
