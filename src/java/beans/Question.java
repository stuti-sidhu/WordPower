package beans;
import java.util.ArrayList;
public class Question {
    
    private int QuestionId;
    private String QuestionText;
    private String Description;
    private int WordId;
    private String Word;

    public String getWord() {
        return Word;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }
    
    
    
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getWordId() {
        return WordId;
    }

    public void setWordId(int WordId) {
        this.WordId = WordId;
    }

  
    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int QuestionId) {
        this.QuestionId = QuestionId;
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setQuestionText(String QuestionText) {
        this.QuestionText = QuestionText;
    }
    
    public ArrayList<beans.Option> AllOptions = new ArrayList<>();

}

  

