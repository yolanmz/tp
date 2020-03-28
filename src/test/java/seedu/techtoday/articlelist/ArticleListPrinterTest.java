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

        String expectedOutput = "1. Title: Test1"
                + System.lineSeparator()
                + "   Date: "
                + System.lineSeparator()
                + "   Category: article"
                + System.lineSeparator()
                + "   Url: www.test1.com"
                + System.lineSeparator()
                + "   Extract: ..."
                + System.lineSeparator()
                + System.lineSeparator()
                + System.lineSeparator()
                + "2. Title: Test2"
                + System.lineSeparator()
                + "   Date: "
                + System.lineSeparator()
                + "   Category: article"
                + System.lineSeparator()
                + "   Url: www.test2.com"
                + System.lineSeparator()
                + "   Extract: ..."
                + System.lineSeparator()
                + System.lineSeparator()
                + System.lineSeparator()
                + "3. Title: Test3"
                + System.lineSeparator()
                + "   Date: "
                + System.lineSeparator()
                + "   Category: article"
                + System.lineSeparator()
                + "   Url: www.test3.com"
                + System.lineSeparator()
                + "   Extract: ..."
                + System.lineSeparator()
                + System.lineSeparator()
                + System.lineSeparator() ;
        assertEquals(expectedOutput, outContent.toString());
    }
}