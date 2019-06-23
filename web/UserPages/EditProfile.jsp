<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html"%>
<%int x = Integer.parseInt(session.getAttribute("LRID").toString());
    datalayer.DALUser objDAL = new datalayer.DALUser();
    beans.User us = objDAL.getUserData(x);
%>
<form method="post" action="../User" style="padding: 20px 0px 20px 350px;">
    <table class="table" style="width:400px">
        
        <tr>
            <td style="width:150px">
                Name
            </td>
            <td>
                <input type="text" name="txtName"class="form-control" value="<%=us.getName()%>">
            </td>
        </tr>
        <tr>
            <td >
                Gender
            </td>
            <td>
                <input type="radio"  value="Male" name="rbtGender" <%=(us.getGender().equals("Male") ? "Checked" : "")%>>Male
                <input type="radio"  value="Female" name="rbtGender" <%=( us.getGender().equals("FeMale") ? "Checked" : "")%>>Female
            </td>
        </tr>
        <tr>
            <td >
                Father Name
            </td>
            <td>
                <input type="text" name="txtFatherName"class="form-control" value="<%=us.getFatherName()%>"
            </td>
        </tr>
        <tr>
            <td >
                Address
            </td>
            <td>
                <input type="text" name="txtAddress"class="form-control" value="<%=us.getAddress()%>"
            </td>
        </tr>
        <tr>
            <td>
                City
            </td>
            <td>
                <input type="text" name="txtCity"class="form-control" value="<%=us.getCity()%>"
            </td>
        </tr>
        <tr>
            <td >
                ContactNo
            </td>
            <td>
                <input type="text" name="txtContactNo"class="form-control" value="<%=us.getContactNo()%>"
            </td>
        </tr>
        <tr>
            <td>
                EmailID
            </td>
            <td>
                <input type="text" name="txtEmailID"class="form-control" value="<%=us.getEmailID()%>">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Update" name="btnUpdate" class="btn btn-success">
            </td>
        </tr>
    </table>
</form>
<%@include file="Footer.html" %>