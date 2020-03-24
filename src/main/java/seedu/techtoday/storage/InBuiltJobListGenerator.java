package seedu.techtoday.storage;

import seedu.techtoday.joblist.JobAdder;
import seedu.techtoday.objects.Job;
import seedu.techtoday.joblist.SavedJobList;

public class InBuiltJobListGenerator {
    /**
     * ADD JAVADOC.
     */
    public static void execute() {

        String job1 = "Tech jobs after COVID-19";
        String job2 = "What are the best blogging platforms for developers in 2020?";
        String job3 = "What is the average Salary of a Silicon Valley Software Engineer?";
        String job4 = "How to Excel as a Software Engineer in developing countries?";
        String job5 = "Outreach for Covid-19 longitudinal study proposal?";
        String job6 = "What's your favorite technical book to read during this time of home quarantine?";


        String text1 = "With the COVID-19 outbreak, many companies were forced to rethink the way they operate "
                + "and how to use those technologies in order to establish a new way of working to reach their goals.";
        String text2 = "Medium, Towards Data Science, HackerNet, GeekForGeek.";
        String text3 = "$104,000";
        String text4 = "(FROM Quora): When I was working in China for awhile (a few years ago), I noticed that the "
                + "biggest mismatch wasn't so much in coding skills, but in what would be called project management skills "
                + "in the US.  Several groups I encountered didn't use source code control for code and didn't have a clue "
                + "about configuration and release management.  When things broke, they'd have a massive shouting match to f"
                + "igure out who to blame, followed by a  fire-drill to try to put things back together.\n";
        String text5 = "I&#x27;m failing at finding development help for a COVID-19 study initiative. I could"
                + " use your ideas and critiques.";
        String text6 = "Mine is Elements of Programming";

        String timeStampToday = "1584768812";
        String timeStampOfToday = "1584768812";

        Job jobOne = new Job(job1, text1, "default");
        jobOne.setTime(timeStampOfToday);
        Job jobTwo = new Job(job2, text2, "default");
        jobTwo.setTime(timeStampOfToday);
        Job jobThree = new Job(job3, text3, "default");
        jobThree.setTime(timeStampOfToday);
        Job jobFour = new Job(job4, text4, "default");
        jobFour.setTime(timeStampOfToday);
        Job jobFive = new Job(job5, text5, "default");
        jobFive.setTime(timeStampOfToday);
        Job jobSix = new Job(job6, text6, "default");
        jobSix.setTime(timeStampOfToday);
        

        JobAdder.execute(SavedJobList.savedJobList, jobOne);
        JobAdder.execute(SavedJobList.savedJobList, jobTwo);
        JobAdder.execute(SavedJobList.savedJobList, jobThree);
        JobAdder.execute(SavedJobList.savedJobList, jobFour);
        JobAdder.execute(SavedJobList.savedJobList, jobFive);
        JobAdder.execute(SavedJobList.savedJobList,jobSix);
    }
}
