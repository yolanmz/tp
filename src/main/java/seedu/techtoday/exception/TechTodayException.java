package seedu.techtoday.exception;

/**
 * Exceptions class for TechToday.
 */
public class TechTodayException extends Exception {
    // class extends Exception
    private String message;

    public TechTodayException() {
        super();
    }
    
    public TechTodayException(String message) {
        super(message);
        this.message = message;
    }
}
