<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<script type="text/javascript" src="scripts/Registration.js"></script>
<form method="post" action="User" style="padding-left: 250px;">
        <table class="table-condensed table-responsive">
            <tr>
                <td style="width: 150px;">Name</td>
                <td style="width: 250px;">
                    <input type="text" name="txtName" id="txtName"   class="form-control">
                </td>
                <td><span id="sp1" style="color: red"></span></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>
                    <input type="radio" value="Male" name="rbtGender" id="rbtMale">Male
                    <input type="radio" value="Female" name="rbtGender" id="rbtFemale">Female
                </td>
                <td><span id="sp2" style="color: red"></span></td>
            </tr>
            <tr>
                <td>User ID</td>
                <td>
                    <input type="text" name="txtUserID" id="txtUserID" onkeyup="return userconfirm()" class="form-control">
                </td>
                <td><span id="sp3" style="color: red"></span></td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type="password" name="txtPassword" class="form-control" id="txtPassword">
                </td>
                <td><span id="sp4" style="color: red"></span></td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td>
                    <input type="password" name="txtConfirmPassword" id="txtConfirmPassword" class="form-control">
                </td>
                <td><span id="sp5" style="color: red"></span></td>
            </tr>
            <tr>
                <td>Security Question</td>
                <td>
                    <select name="ddlSecurityQuestion" id="ddlSecurityQuestion" class="form-control">
                        <option>Select Question</option>
                        <option>Your favorite color</option>
                        <option>Your childhood School</option>
                        <option>Your pet name</option>
                        <option>Your favorite book</option>
                    </select>
                </td>
                <td><span id="sp6" style="color: red"></span></td>
            </tr>
            <tr>
                <td>Answer</td>
                <td>
                    <input type="password" name="txtAnswer" id="txtAnswer" class="form-control">
                </td>
                <td><span id="sp7" style="color: red"></span></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Register" name="btnRegister" class="btn btn-primary" onclick="return validateData()">
                </td>
            </tr>
            <%
                if (request.getParameter("flag") != null) {
            %>
            <tr>
                <td></td>
                <td>Some server Error!!!</td>
            </tr>
            <%}%>
        </table>
</form>
<%@include file="Footer.html" %>
