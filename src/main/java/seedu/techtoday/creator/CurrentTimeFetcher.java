package seedu.techtoday.creator;

import java.time.Instant;
import seedu.techtoday.objects.Information;

/**
 * ADD JAVADOC.
 */
public class CurrentTimeFetcher {
    public static String execute() {
        Instant instant = Instant.now();
        long timeStampSeconds = instant.getEpochSecond();
        String epochSecond = Long.toString(timeStampSeconds);
        return epochSecond;
    }
}
