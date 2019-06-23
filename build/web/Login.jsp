<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<form method="post" action="User" style="padding:40px 0px 20px 350px;">
    <table class="table-condensed table-responsive" style="width: 500px">
        <tr>
            <td>User ID</td>
            <td>
                <input type="text" name="txtUserID" class="form-control">
            </td>
            <td></td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input type="password" name="txtPassword" class="form-control">
            </td>
            <td><a href="ForgetPassword.jsp">Forget Password?</a></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="btnLogin" value="Sign IN" class="btn btn-success">
            </td>
            <td></td>
        </tr>
        <%
            if (request.getParameter("flag")!= null) {
        %>
        <tr>
            <td></td>
            <td>User ID or Password incorrect!</td>
        </tr>

        <% }%>
    </table>
</form>
<%@include file="Footer.html" %>
