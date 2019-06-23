package beans;

public class Option {
    private int OptionId;
    private String OptionText;
     private int IsAnswer;
     private String Pictorial;
     private int QuestionId;

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int QuestionId) {
        this.QuestionId = QuestionId;
    }
     private String ImageName;
     
    public int getOptionId() {
        return OptionId;
    }

    public void setOptionId(int OptionId) {
        this.OptionId = OptionId;
    }

    public String getOptionText() {
        return OptionText;
    }

    public void setOptionText(String OptionText) {
        this.OptionText = OptionText;
    }

    public int getIsAnswer() {
        return IsAnswer;
    }

    public void setIsAnswer(int IsAnswer) {
        this.IsAnswer = IsAnswer;
    }

    public String getPictorial() {
        return Pictorial;
    }

    public void setPictorial(String Pictorial) {
        this.Pictorial = Pictorial;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }
}


