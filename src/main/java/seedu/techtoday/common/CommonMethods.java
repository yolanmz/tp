package seedu.techtoday.common;

/** Class containing methods that can be used across classes in the application. */
public class CommonMethods {

    /**
     * Retutns a Boolean value to see if s is an integer or not.
     * @param longer - String that can possibly be turned into an long type.
     * @return - Boolean value isValidInteger.
     */
    public static boolean isLong(String longer) {
        boolean isValidInt = false;
        try {
            Long.parseLong(longer);
            isValidInt = true;
        } catch (NumberFormatException ex) {
            // s is not a long type
        }
        return isValidInt;
    }
}
