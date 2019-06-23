<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<script type="text/javascript" src="scripts/Registration.js"></script>
<form>
    <table class="table" style="width: 500px;margin-left: 300px;margin-top: 30px;">
        <tr>
            <td>User ID</td>
            <td>
                <input type="text" name="txtUserID" class="form-control">
            </td>
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
         </tr>
        <tr>
            <td>Answer</td>
            <td>
                <input type="password" name="txtAnswer" class="form-control">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="btnForgetPassword" value="Confirm" class="btn btn-success">
            </td>
        </tr>
    </table>
</form>

<%@include file="Footer.html" %>