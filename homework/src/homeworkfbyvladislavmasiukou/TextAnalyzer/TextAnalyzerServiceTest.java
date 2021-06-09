package TextAnalyzer;

import org.junit.Test;

import static TextAnalyzer.Text.myThoughts;
import static org.junit.Assert.*;

public class TextAnalyzerServiceTest {

    TextAnalyzerService textAnalyzerService = new TextAnalyzerService();

    @Test
    public void totalSentencesInText() {
        int expected = 17;
        int actual = textAnalyzerService.totalSentencesInText();
        assertEquals(expected, actual);
    }

    @Test
    public void totalWordsInText() {
        int expected = 219;
        int actual = textAnalyzerService.totalWordsInText();
        assertEquals(expected, actual);
    }

    @Test
    public void totalPunctuationMarks() {
        int expected = 46;
        int actual = textAnalyzerService.totalPunctuationMarks();
        assertEquals(expected, actual);
    }

    @Test
    public void repeatMostTimePunctuationMark() {
        int expected = 25;
        int actual = textAnalyzerService.repeatMostTimePunctuationMark();
        assertEquals(expected, actual);
    }
}