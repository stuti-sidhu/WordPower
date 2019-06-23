<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<script type="text/javascript" src="../scripts/User.js"></script>
<%
    int LRID = Integer.parseInt(session.getAttribute("LRID").toString());
    datalayer.DALUser objDAL = new datalayer.DALUser();
    beans.User us = objDAL.getUserData(LRID);
    String pwd = us.getPassword();
%>

<form action="../User" method="post">
    <table class="table-condensed table-responsive">
        <tr>
            <th>Old Password <span style="color: red;">*</span></th>
            <td>
                <input type="password" name="txtOldPassword" id="txtOldPassword" class="form-control" onblur="return checkPassword()"> 
            </td>
            <td><span id="sp1" style="color: red;"></span></td>
        </tr>
        <tr>
            <th>New Password</th>
            <td>
                <input type="password" name="txtNewPassword" id="txtNewPassword" class="form-control"> 
            </td>
            <td><span id="sp2" style="color: red;"></span></td>
        </tr>
        <tr>
            <th>Confirm New Password</th>
            <td>
                <input type="password" name="txtConfirmNewPassword" id="txtConfirmNewPassword" class="form-control"> 
            </td>
            <td><span id="sp3" style="color: red;"></span></td>
        </tr>

        <tr>
            <td></td>
            <td>
                <input type="submit" value="save" name="btnChange" class="btn btn-success" onclick="return userPassword()">
            </td>
        </tr>
    </table>
</form>
<%@include file="Footer.html" %>
