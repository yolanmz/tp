package seedu.techtoday.apiView;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsCreatorTest {

    @Test
    void testNewsCreation(){
        String inputJsonText = "{ \"by\" : \"pjmlp\",\"descendants\" : 6, \"id\" : 22582276, \"kids\" : [ 22582600 ], " +
                "\"score\" : 76, \"time\" : 1584262684, \"title\" : \"WebAssembly brings " +
                "extensibility to network proxies\", \"type\" : \"story\", \"url\" :" +
                " \"https://opensource.googleblog.com/2020/03/webassembly-brings-extensibility-to.html\"}";

        JSONObject input = new JSONObject(inputJsonText);

        String outputJsonText = "{ \"timeStamp\": \"1584262684\", \"title\": \"WebAssembly " +
                "brings extensibility to network proxies\", \"url\": " +
                "\"https://opensource.googleblog.com/2020/03/webassembly-brings-extensibility-to.html\"}";

        JSONObject expectedOutput = new JSONObject(outputJsonText);
        JSONObject output = NewsCreator.rawToProcessedNews(input);
        assertEquals(expectedOutput.toString(), output.toString());
    }
}
