package seedu.techtoday.apiview;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


/**
 *
 *  Represents a class that parses JSON objects that are required for the project.
 */

public class JsonParser {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }


    public static int[] stringToArray(String array){
        String[] arrayStr = array.split(",");
        int[] arrOfIndices = new int[6];
        for (int i= 1; i < 7; i++){
            int a = Integer.parseInt(arrayStr[i].trim());
            arrOfIndices[i - 1] = a;
        }
        return arrOfIndices;
    }

    public static String readJsonArrayfromURL(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return jsonText;
        } finally {
            is.close();
        }
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
}
