package datalayer;

import java.sql.*;

public class DALUser extends DBOperations {

    public DALUser() {
        makeConnection();
    }//constructor

    public void register(beans.User user) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into Registrations(Name,Gender,FatherName,Address,City,ContactNo,EmailId,\n" +
"UserId,Password,SecurityQuestion,Answer,ProfilePic) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getFatherName());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getContactNo());
            ps.setString(7, user.getEmailID());
            ps.setString(8, user.getUserID());
            ps.setString(9, user.getPassword());
            ps.setString(10, user.getSecurityQuestion());
            ps.setString(11, user.getAnswer());
            ps.setString(12, user.getProfilePic());

            ps.executeUpdate();
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
    }//function register

    public beans.User authenticateUser(String uid, String pwd) {
        beans.User user = null;
        try {
            PreparedStatement ps = con.prepareStatement("select *from Registrations where UserId=? and Password=?");
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                user = new beans.User();

                user.setRegistrationID(rs.getInt("RegistrationID"));
                user.setName(rs.getString("Name"));
                user.setGender(rs.getString("Gender"));
                user.setFatherName(rs.getString("FatherName"));
                user.setAddress(rs.getString("Address"));
                user.setCity(rs.getString("City"));
                user.setContactNo(rs.getString("ContactNo"));
                user.setEmailID(rs.getString("EmailID"));
                user.setUserID(rs.getString("UserID"));
                user.setPassword(rs.getString("Password"));
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));
                user.setProfilePic(rs.getString("ProfilePic"));
            }//RS next
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return user;
    }//function authenticateUser

    public beans.User getUserData(int pRegistrationID) {
        beans.User user = null;
        try {
            PreparedStatement ps = con.prepareStatement("select *from Registrations where RegistrationID=?");
            ps.setInt(1, pRegistrationID);

            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                user = new beans.User();

                user.setRegistrationID(rs.getInt("RegistrationID"));
                user.setName(rs.getString("Name"));
                user.setGender(rs.getString("Gender"));
                user.setFatherName(rs.getString("FatherName"));
                user.setAddress(rs.getString("Address"));
                user.setCity(rs.getString("City"));
                user.setContactNo(rs.getString("ContactNo"));
                user.setEmailID(rs.getString("EmailID"));
                user.setUserID(rs.getString("UserID"));
                user.setPassword(rs.getString("Password"));
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));
                user.setProfilePic(rs.getString("ProfilePic"));
            }//RS next
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return user;
    }//function getUserData

    public int updateProfile(beans.User user) {
        try {
            PreparedStatement ps = con.prepareStatement("update Registrations set Name=?, Gender=?,"
                    + "FatherName=?,Address=?,City=?,ContactNo=?,EmailID=? where RegistrationID=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getFatherName());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getContactNo());
            ps.setString(7, user.getEmailID());
            ps.setInt(8, user.getRegistrationID());

            ps.executeUpdate();
        }//try
        catch (Exception ex) {
            System.out.println(ex);
            return -1;
        }//catch
        return 1;
    }//function updateProfile

    public boolean checkAvailability(String pUserID) {
        boolean flag = false;
        try {
            PreparedStatement ps = con.prepareStatement("select *from registrations where UserID=?");
            ps.setString(1, pUserID);
            ResultSet rs = ps.executeQuery();
            flag = !rs.next();
            rs.close();
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//Exception
        return flag;
    }//checkavailability

    public void changeProfilePicture(int pRegistrationID) {
        try {
            PreparedStatement ps = con.prepareStatement("update Registrations set ProfilePic=? where RegistrationID=?");
            ps.setString(1, "img" + pRegistrationID + ".jpg");
            ps.setInt(2, pRegistrationID);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }// changeProfilePicture

    public void changePassword(int pRegistrationID, String newPassword) {
        try {
            PreparedStatement ps = con.prepareStatement("update Registrations set Password=? where RegistrationID=?");
            ps.setString(1, newPassword);
            ps.setInt(2, pRegistrationID);
            ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//changePassword
} //class DALUser
