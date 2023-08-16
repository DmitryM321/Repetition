package Stepik.SpamAnalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }
   public final Label getKeywords(Label Label){
        return Label;
    }
   public final getLabel(){
        return null;
    }
}
  class SpamAnalyzer extends KeywordAnalyzer{

    @Override
    public Label processText(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processText'");
    }

  }

  class NegativeTextAnalyzer extends KeywordAnalyzer{

    @Override
    public Label processText(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processText'");
    }

  }
  class TooLongTextAnalyzer implements TextAnalyzer{

    @Override
    public Label processText(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processText'");
    }
  }

    interface TextAnalyzer{
Label processText(String text);
  }
  enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}