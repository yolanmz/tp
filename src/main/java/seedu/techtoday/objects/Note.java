package seedu.techtoday.objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note extends Information {

    /**
     * Constructor for note class.
     * @param title - The note title given by the user.
     */
    public Note (String title) {
        super(title, "", "");
    }

    public Note(String title, String extract, String epochSecond) {
        super(title, extract, epochSecond);
        String pattern = "yyyy-MMM-dd E hh:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format((new Date(Long.parseLong(epochSecond)*1000)));
        this.timeStamp = date;
    }
}
