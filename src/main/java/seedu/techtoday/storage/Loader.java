package seedu.techtoday.storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

import seedu.techtoday.noteList.SavedNoteList;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;



import seedu.techtoday.articlelist.savedarticlelist;
import seedu.techtoday.jobList.SavedJobList;
import seedu.techtoday.objects.Article;

/**
 * ADD JAVADOC HERE.
 */
public class Loader {
    @SuppressWarnings("unchecked")

    public static int idxArticle = 1;
    public static int idxJob = 1;
    public static int idxNotes = 1;

    /**
     * ADD JAVADOC HERE.
     * @param fileNameArticle - ADD HERE.
     * @param fileNameJobs - ADD HERE.
     * @param fileNameNotes - ADD HERE.
     */
    public static void execute(String fileNameArticle, String fileNameJobs, String fileNameNotes) {
        JsonArray articleList = jsonReader(fileNameArticle);
        JsonArray jobList = jsonReader(fileNameJobs);
        JsonArray noteList = jsonReader(fileNameNotes);

        //Iterate over articleList array
        articleList.forEach(obj -> parseArticleObject((JsonObject)obj));

        //Iterate over jobList array
        jobList.forEach(obj -> parseJobObject((JsonObject)obj));


        //Iterate over noteList array
        //noteList.forEach( obj -> parseNoteObject( (JsonObject) obj ) );
    }

    /**
     * ADD JAVADOC HERE.
     * @param fileName - ADD HERE.
     * @return - ADD HERE.
     */
    public static JsonArray jsonReader(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {
            //Read JSON file
            Object obj = JsonParser.parseReader(reader);

            JsonArray objectList = (JsonArray) obj;
            return objectList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        }

        return new JsonArray();

    }

    /**
     * ADD JAVADOC HERE.
     * @param article - ADD HERE.
     */
    private static void parseArticleObject(JsonObject article) {

        String index = Integer.toString(idxArticle);
        //Get employee object within list
        JsonObject articleObject = (JsonObject) article.get(index);
        idxArticle += 1;

        //Get article title
        String title = articleObject.get("title").toString().replaceAll("\"", "");;
        String url = articleObject.get("url").toString().replaceAll("\"", "");;
        String timeStamp = articleObject.get("timestamp").toString().replaceAll("\"", "");;
        String extract = articleObject.get("extract").toString().replaceAll("\"", "");;
        String category = articleObject.get("category").toString().replaceAll("\"", "");;

        if (category == null) {
            category = "default";
        }

        Article newArticle = new Article(title, url, category);
        newArticle.setTime(timeStamp);

        if (extract == null) {
            extract = "";
        }

        newArticle.setExtract(extract);

        savedarticlelist.savedArticleList.add(newArticle);

    }

    /**
     * ADD JAVADOC HERE.
     * @param job - ADD HERE.
     */
    private static void parseJobObject(JsonObject job) {

        String index = Integer.toString(idxJob);
        //Get employee object within list
        JsonObject jobObject = (JsonObject) job.get(index);
        idxJob += 1;

        //Get article title
        String title = jobObject.get("title").toString().replaceAll("\"", "");;
        String text = jobObject.get("text").toString().replaceAll("\"", "");;
        String timeStamp = jobObject.get("timestamp").toString().replaceAll("\"", "");;
        String extract = jobObject.get("extract").toString().replaceAll("\"", "");;
        String category = jobObject.get("category").toString().replaceAll("\"", "");;

        if (category == null) {
            category = "default";
        }

        if (extract == null) {
            extract = "";
        }

        //Creates a job and a
        Job newJob = new Job(title, text, category);
        newJob.setTime(timeStamp);
        newJob.setExtract(extract);

        SavedJobList.savedJobList.add(newJob);

    }

    /**
     * ADD JAVADOC HERE.
     * @param note - ADD HERE.
     */
    private static void parseNoteObject(JsonObject note) {

        String index = Integer.toString(idxNotes);
        //Get employee object within list
        JsonObject jobObject = (JsonObject) note.get(index);
        idxNotes += 1;

        // Get article title
        String title = jobObject.get("title").toString().replaceAll("\"", "");;
        String extract = jobObject.get("extract").toString().replaceAll("\"", "");;
        String timeStamp = jobObject.get("timestamp").toString().replaceAll("\"", "");;
        // String category = jobObject.get("category").toString().replaceAll("\"", "");;


        //Creates a note and a
        Note newNote = new Note(title, extract, timeStamp);



        // NotePrinter.printIsolatedNote(newNote);

        SavedNoteList.savedNoteList.add(newNote);

    }
}
