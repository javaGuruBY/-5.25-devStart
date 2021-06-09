package TextAnalyzer;

public class TextAnalyzerMain {

    public static void main(String[] args) {

        TextAnalyzerService textAnalyzerService = new TextAnalyzerService();

        System.out.println("Total sentences in text is " + textAnalyzerService.totalSentencesInText());
        System.out.println("Total words in text is " + textAnalyzerService.totalWordsInText());
        System.out.println("Total punctuation marks in text is " + textAnalyzerService.totalPunctuationMarks());
        textAnalyzerService.repeatMostTimePunctuationMark();

    }
}
