package seedu.techtoday.noteList;

import seedu.techtoday.objects.Note;

public class NotePrinter {
    public static void execute(int taskCounter, Note note) {
        String timestamp = note.getTimeStamp();
        String title = note.getTitle();
        String extract = note.getExtract();
        System.out.println(taskCounter + ". Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Text: " + extract);
    }

    public static void printIsolatedArticle(Note note) {
        String timestamp = note.getTimeStamp();
        String title = note.getTitle();
        String extract = note.getExtract();
        System.out.println("   Title: " + title + "\n"
                                + "   Date: " + timestamp + "\n"
                                + "   Text: " + extract);
    }
}
