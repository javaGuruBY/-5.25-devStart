package alexanderP.vocabulary;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    @Test
    public void getWordsCount() {
        int expected = 0;
        int actual = UniqueWordVocabulary.getWordsCount();
        assertEquals(expected, actual);
    }
}