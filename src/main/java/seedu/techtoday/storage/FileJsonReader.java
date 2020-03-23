package seedu.techtoday.storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

import seedu.techtoday.noteList.SavedNoteList;
import seedu.techtoday.objects.Job;
import seedu.techtoday.objects.Note;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;



import seedu.techtoday.articleList.SavedArticleList;
import seedu.techtoday.jobList.SavedJobList;
import seedu.techtoday.objects.Article;


public class FileJsonReader {
    @SuppressWarnings("unchecked")

    public static int idxArticle = 1;
    public static int idxJob = 1;
    public static int idxNotes = 1;

    public static void execute(String fileNameArticle, String fileNameJobs, String fileNameNotes){
        JsonArray articleList = jsonReader(fileNameArticle);
        JsonArray jobList = jsonReader(fileNameJobs);
        JsonArray noteList = jsonReader(fileNameNotes);

        //Iterate over articleList array
        articleList.forEach( obj -> parseArticleObject( (JsonObject) obj ) );

        //Iterate over jobList array
        jobList.forEach( obj -> parseJobObject( (JsonObject) obj ) );

        //Iterate over noteList array
        jobList.forEach( obj -> parseNoteObject( (JsonObject) obj ) );
    }


    public static JsonArray jsonReader(String fileName) {

        try (FileReader reader = new FileReader(fileName))
        {
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

    private static void parseArticleObject(JsonObject article) {

        String index = Integer.toString(idxArticle);
        //Get employee object within list
        JsonObject articleObject = (JsonObject) article.get(index);
        idxArticle += 1;

        //Get article title
        String title = articleObject.get("title").toString();
        String url = articleObject.get("url").toString();
        String timeStamp = articleObject.get("timestamp").toString();
        String extract = articleObject.get("extract").toString();
        String category = articleObject.get("category").toString();


        Article newArticle = new Article(title, url, category);
        newArticle.setTime(timeStamp);
        newArticle.setExtract(extract);

        SavedArticleList.savedArticleList.add(newArticle);

    }


    private static void parseJobObject(JsonObject job) {

        String index = Integer.toString(idxJob);
        //Get employee object within list
        JsonObject jobObject = (JsonObject) job.get(index);
        idxJob += 1;

        //Get article title
        String title = jobObject.get("title").toString();
        String text = jobObject.get("text").toString();
        String timeStamp = jobObject.get("timestamp").toString();
        String extract = jobObject.get("extract").toString();
        String category = jobObject.get("category").toString();

        //Creates a job and a
        Job newJob = new Job(title, text, category);
        newJob.setTime(timeStamp);
        newJob.setExtract(extract);
        SavedJobList.savedJobList.add(newJob);

    }


    private static void parseNoteObject(JsonObject note) {

        String index = Integer.toString(idxNotes);
        //Get employee object within list
        JsonObject jobObject = (JsonObject) note.get(index);
        idxNotes += 1;

        //Get article title
        String title = jobObject.get("title").toString();
        String extract = jobObject.get("extract").toString();
        String timeStamp = jobObject.get("timestamp").toString();
//        String category = jobObject.get("category").toString();

        //Creates a job and a
        Note newNote = new Note(title, extract, timeStamp);

        SavedNoteList.savedNoteList.add(newNote);

    }
}
