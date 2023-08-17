package Stepik.SpamAnalyzer;

// import Stepik.SpamAnalyzer.Main.SpamAnalyzer.NegativeTextAnalyzer;
// import Stepik.SpamAnalyzer.Main.SpamAnalyzer.TooLongTextAnalyzer;

public class Main  {
  public static void main(String[] args) {
   // String text = ":( + :| + smile";
     String text = "smile + \"1";
    TextAnalyzer[] analyzers = {
      new Main().new SpamAnalyzer(new String[] {"1", "2"}),
      new Main().new NegativeTextAnalyzer(),
      new Main().new TooLongTextAnalyzer(), 
};
  
Label label = checkLabels(analyzers, text);
System.out.println(label);

  }
  public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for(TextAnalyzer analyzer: analyzers) {
         if(analyzer.processText(text) != Label.OK) return analyzer.processText(text);
    }
     return Label.OK;
 }
  
     
abstract class KeywordAnalyzer implements TextAnalyzer {  
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
    public Label processText(String text) {
        String[] keywords = getKeywords();

        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
 
class SpamAnalyzer extends KeywordAnalyzer {
  private String[] keywords;

  public SpamAnalyzer(String[] keywords) {
      this.keywords = keywords;
  }

  @Override
  protected String[] getKeywords() {
      return keywords;
  }

  @Override
  protected Label getLabel() {
      return Label.SPAM;
  }

  @Override
  public Label processText(String text) {
      for (String keyword : keywords) {
          if (text.contains(keyword)) {
              return getLabel();
          }
      }
      return Label.OK;
  }
}
  class NegativeTextAnalyzer extends KeywordAnalyzer{
  
    public Label processText(String text) {
      if(text.contains(":(") || text.contains("=(") || text.contains(":|")){
        return Label.NEGATIVE_TEXT;
      }
        return Label.OK;
    }
    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
         }

  class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength = 50; 
    @Override
    public Label processText(String text) {
      
       
        if(text.length() >= 50) {
          return Label.TOO_LONG;
      }
    return Label.OK;
    }
  }
  } 