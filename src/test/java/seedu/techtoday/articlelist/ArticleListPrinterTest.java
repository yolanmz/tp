package seedu.techtoday.articlelist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.techtoday.objects.Article;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleListPrinterTest {

    @BeforeEach
    void setUp() {
        SavedArticleList.savedArticleList = new ArrayList<>();
        ArticleAdder.execute(SavedArticleList.savedArticleList, new Article("Test1", "www.test1.com", "article"));
        ArticleAdder.execute(SavedArticleList.savedArticleList, new Article("Test2", "www.test2.com", "article"));
        ArticleAdder.execute(SavedArticleList.savedArticleList, new Article("Test3", "www.test3.com", "article"));
    }

    @Test
    void execute() {
        // All system.out.println statements will be in outContent
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // execute command
        ArticleListPrinter.execute(SavedArticleList.savedArticleList);

        String expectedOutput = "1. Title: Test1\n"
                + "   Date: \n"
                + "   Category: article\n"
                + "   Url: www.test1.com\n"
                + "   Extract: ...\n"
                + "\n"
                + "\n"
                + "2. Title: Test2\n"
                + "   Date: \n"
                + "   Category: article\n"
                + "   Url: www.test2.com\n"
                + "   Extract: ...\n"
                + "\n"
                + "\n"
                + "3. Title: Test3\n"
                + "   Date: \n"
                + "   Category: article\n"
                + "   Url: www.test3.com\n"
                + "   Extract: ...\n"
                + "\n"
                + "\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}