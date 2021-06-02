package TextAnalyzer;



import java.util.logging.Logger;

import static TextAnalyzer.Text.myThoughts;

public class TextAnalyzerService {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("TextAnalyzer");

        String[] sentencesArray = myThoughts.split("\\.");
        String[] wordsArray = myThoughts.split("\\s");

        char[] myText = myThoughts.toCharArray();
        char[] punct = {'.', ',', '-', ':', ';', '?', '!'};
        int[] punctuationCountMark = new int[7];

        final char dm = (char) 34;
        var sumPunct = 0;

        int maxpunctuationCountMark = 0;
        int maxpunctuationCountMark_index = 0;

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
            for (int j = 0; j < punct.length; j++)
                if (myText[i] == punct[j]) {
                    sumPunct++;
                }
        }
        for (int k = 0; k < punctuationCountMark.length; k++) {
            if (punctuationCountMark[k] > maxpunctuationCountMark) {
                maxpunctuationCountMark = punctuationCountMark[k];
                maxpunctuationCountMark_index = k;
            }
        }

        log.info("Repeats most times is " + dm + punct[maxpunctuationCountMark_index] + dm
                + " Number of repetitions " + maxpunctuationCountMark);
        log.info("Total sentences in text is " + sentencesArray.length);
        log.info("Total words in text is " + wordsArray.length);
        log.info("Total punctuation marks in text is " + sumPunct);
    }
}
