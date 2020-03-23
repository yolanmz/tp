package seedu.techtoday.storage;

import java.util.ArrayList;

import com.google.gson.JsonArray;
import seedu.techtoday.objects.Note;
import java.io.IOException;
import java.io.FileWriter;

import com.google.gson.JsonObject;

public class NoteToFileSaver {

    public static void execute(ArrayList<Note> noteArrayList, String filePath) {

        int index = 1;
        JsonArray noteList = new JsonArray();

        for (int i = 0; i < noteArrayList.size(); i++) {
            Note note = noteArrayList.get(i);
            String title = note.getTitle();
            String extract = note.getExtract();
            String timeStamp = note.getTimeStamp();

            //note Details
            JsonObject noteDetails = new JsonObject();
            noteDetails.addProperty("title", title);
            noteDetails.addProperty("extract", extract);
            noteDetails.addProperty("timestamp", timeStamp);

            //Index: note Details
            JsonObject noteObject = new JsonObject();
            noteObject.add(Integer.toString(index), noteDetails);
            index += 1;

            noteList.add(noteObject);
        }

        //Write JSON file
        try (FileWriter file = new FileWriter(filePath)) {
            String jsonString = noteList.toString();
            file.write(jsonString);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
