package beans;

import java.util.ArrayList;

public class Word
{
     
    private int WordId;
    private String Meaning;
    private String Word;
    private int Level;
    
    public int getWordId() {
        return WordId;
    }

    public void setWordId(int WordId) {
        this.WordId = WordId;
    }

    public String getWord() {
        return Word;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getMeaning() {
        return Meaning;
    }

    public void setMeaning(String Meaning) {
        this.Meaning = Meaning;
    } 
    
    public ArrayList<beans.Usage> Usages = new ArrayList<beans.Usage>();

}
