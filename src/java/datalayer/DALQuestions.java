package datalayer;

import beans.Option;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DALQuestions extends DBOperations {

    public DALQuestions() {
        makeConnection();
    }

    public ArrayList<beans.Question> getQuestions(String WordIDS) {

        ArrayList<beans.Question> AllQues = new ArrayList<>();

        int QuestionId = 0, temp;

        try {
            String Query = "select Q.QuestionId,Q.QuestionText,Q.Description,W.Word, W.WordId, O.OptionID,"
                    + "O.OptionText,O.IsAnswer,O.Pictorial,O.ImageName from"
                    + " Words as W ,Options as O, Questions as Q where Q.QuestionId=O.QuestionId and"
                    + " Q.WordId=W.WordId and Q.WordId IN (" + WordIDS + ") order by WordId";

            Statement st = con.createStatement();
            beans.Question question = null;
            ResultSet rs = st.executeQuery(Query);

            boolean found;

            int WordId;

            while (rs.next()) {
                found = false;

                temp = rs.getInt("QuestionId");
                WordId = rs.getInt("WordId");

                for (beans.Question q : AllQues) {
                    if (q.getWordId() == WordId) {
                        found = true;
                        break;
                    }
                }

                if (found == false) {
                    question = new beans.Question();
                    question.setQuestionId(temp);
                    question.setQuestionText(rs.getString("QuestionText"));
                    question.setDescription(rs.getString("Description"));
                    question.setWord(rs.getString("Word"));
                    question.setWordId(rs.getInt("WordId"));
                    AllQues.add(question);

                }

                beans.Option option = new Option();
                option.setOptionId(rs.getInt("OptionId"));
                option.setOptionText(rs.getString("OptionText"));
                option.setIsAnswer(rs.getInt("IsAnswer"));
                option.setPictorial(rs.getString("Pictorial"));
                option.setImageName(rs.getString("ImageName"));

                for (beans.Question q : AllQues) {
                    if (q.getQuestionId() == temp) {
                        q.AllOptions.add(option);
                        break;
                    }
                }

            }//Loop

            rs.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return AllQues;
    }
}
