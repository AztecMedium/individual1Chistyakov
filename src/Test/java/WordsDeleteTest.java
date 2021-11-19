import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for checking the correctness of the work of WordsDelete.java
 * @author Roman Chistyakov
 * @version 1.4
 */
public class WordsDeleteTest {
    /**
     * A test function that passes a test value through the wordsDelete method and compares the result
     * with the expected one, if they match, the test is passed
     *
     */
    @Test
    public void wordsDeleteTest() {
        assertEquals("[мама, папа, дима, котик]",
                WordsDelete.wordsDelete("мор мама папа дима трос ром котик сорт рот тор тор"));
    }
}