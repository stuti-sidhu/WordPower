package datalayer;

import beans.Usage;
import beans.Word;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DALWord extends DBOperations {

    public DALWord() {
        makeConnection();
    }

    public ArrayList<beans.Word> getWords(int pLevel,int pCategory) {
        ArrayList<beans.Word> AllWords = new ArrayList<>();

        int WordId = 0, temp;

        try {
            PreparedStatement ps = con.prepareStatement("select w.WordId,w.Word,w.Meaning,W.Level, u.UsageId,u.Usages from Words as w,Usages as u where w.WordId=u.WordId and W.Level=? and W.WordId IN(Select WordId From WordCategories Where CategoryId=?)");
            ps.setInt(1, pLevel);
            ps.setInt(2, pCategory);
            
            beans.Word Word = null;
            ResultSet rs = ps.executeQuery();

            
            while (rs.next()) {
                temp = rs.getInt("WordId");
                if (temp != WordId) {
                    Word = new Word();

                    Word.setWordId(temp);
                    Word.setWord(rs.getString("Word"));
                     
                    Word.setMeaning(rs.getString("Meaning"));
                    Word.setLevel(rs.getInt("Level"));
                   

                    WordId = temp;
                    AllWords.add(Word);
                }
                Usage us = new Usage();
                us.setUsageId(rs.getInt("UsageId"));
                us.setUsage(rs.getString("Usages"));
                Word.Usages.add(us);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return AllWords;
    }
}
