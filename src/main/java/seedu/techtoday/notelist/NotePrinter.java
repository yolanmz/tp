package seedu.techtoday.notelist;

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
        System.out.println(taskCounter + ". Title: " + title + System.lineSeparator()
                                + "   Date: " + timestamp + System.lineSeparator()
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
        System.out.println("   Title: " + title + System.lineSeparator()
                                + "   Date: " + timestamp + System.lineSeparator()
                                + "   Text: " + extract);
    }
}
