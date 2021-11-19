import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class that removes from the text all pairs of words, of which one is a conversion of the other
 * @author Roman Chistyakov
 * @version 1.3
 */
public class WordsDelete {
    /**
     * A function that first fills in an inverted reverseWord string,
     * then compares it with the original one and if the words match, then clears the positions of word pairs
     *
     * Attention! In a situation where there are 3 words in the text, each of which is a conversion of the other,
     * then only the first 2 words from the left will be deleted.
     * (Example: if the string "mir rim mir nord" is entered,
     * then the result will be "mir nord" with the remaining second word "mir")
     * @param argv - A string that takes a value from scanTest
     * @return - returns the resulting string
     */
    public static @NotNull String wordsDelete(String argv)  {
        String[] words = argv.split(" ");
        StringBuilder reverseWord;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                reverseWord = new StringBuilder(words[j]).reverse();
                if (words[i].equals(reverseWord.toString())){
                    words[i] = words[i].replace(words[i], "");
                    words[j] = words[j].replace(words[j], "");
                }

            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(words));
        list.removeAll(Arrays.asList("", null));
        words = list.toArray(new String[0]);
        return (Arrays.toString(words));}
    }

