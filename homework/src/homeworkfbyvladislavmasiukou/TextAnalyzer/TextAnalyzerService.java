package TextAnalyzer;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static TextAnalyzer.Text.myThoughts;

public class TextAnalyzerService {

    private static Logger log = Logger.getLogger("TextAnalyzer");

    public int totalSentencesInText() {
        String[] sentencesArray = myThoughts.split("\\.");
        return sentencesArray.length;
    }

    public int totalWordsInText() {
        String[] wordsArray = myThoughts.split("\\s");
        int totalWords = 0;

        for (int i = 0; i < wordsArray.length; i++)
        if(wordsArray[i].equalsIgnoreCase("-")){
        }else totalWords++;
        return totalWords;
    }

    public int totalPunctuationMarks() {
        List<String> sentences = Arrays.asList(myThoughts.split("(\\p{Punct})"));
            return sentences.size();
        }

    public int repeatMostTimePunctuationMark() {

        char[] myText = myThoughts.toCharArray();
        char[] punct = {'.', ',', '-', ':', ';', '?', '!'};
        int[] punctuationCountMark = new int[7];
        int maxpunctuationCountMark = 0;
        int maxpunctuationCountMark_index = 0;
        final char dm = (char) 34;

        for (int i = 0; i < myText.length; i++) {
            switch (myText[i]) {
                case '.' -> punctuationCountMark[0]++;
                case ',' -> punctuationCountMark[1]++;
                case '-' -> punctuationCountMark[2]++;
                case ':' -> punctuationCountMark[3]++;
                case ';' -> punctuationCountMark[4]++;
                case '?' -> punctuationCountMark[5]++;
                case '!' -> punctuationCountMark[6]++;
            }
        }
            for (int k = 0; k < punctuationCountMark.length; k++) {
                if (punctuationCountMark[k] > maxpunctuationCountMark) {
                    maxpunctuationCountMark = punctuationCountMark[k];
                    maxpunctuationCountMark_index = k;
                }
            }
        log.info("Repeat most times is " + dm + punct[maxpunctuationCountMark_index] + dm
                + " Number of repetitions " + maxpunctuationCountMark);
            return maxpunctuationCountMark;
    }
}
