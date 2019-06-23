<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="Header.html" %>
<%
    int LRID = Integer.parseInt(session.getAttribute("LRID").toString());

    datalayer.DALUser objDAL = new datalayer.DALUser();
    beans.User us = objDAL.getUserData(LRID);
%>
<div class="row" style="padding-top: 40px;">
    <div class="col-md-2" style="padding-left: 100px;">
        <img src="../UploadedImages/<%=us.getProfilePic()%>" style="height: 200px;width: 180px;">
    </div>

    <div class="col-md-offset-4">

        <table class="table table-striped" style="width: 500px;">
            <tr>
                <th style="width:250px;">Name</th>
                <td>
                    <%=us.getName()%>
                </td>
            </tr>
            <tr>
                <th>Gender</th>
                <td>
                    <%=us.getGender()%>
                </td>
            </tr>
            <tr>
                <th>Father Name</th>
                <td>
                    <%=us.getFatherName()%>
                </td>
            </tr>
            <tr>
                <th>Address</th>
                <td>
                    <%=us.getAddress()%>
                </td>
            </tr>
            <tr>
                <th>City</th>
                <td>
                    <%=us.getCity()%>
                </td>
            </tr>
            <tr>
                <th>Contact No.</th>
                <td>
                    <%=us.getContactNo()%>
                </td>
            </tr>
            <tr>
                <th>Email ID</th>
                <td>
                    <%=us.getEmailID()%>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <a class="btn btn-info" href="EditProfile.jsp">Edit</a>
                </td>
            </tr>
        </table>
    </div>
</div>
<%@include file="Footer.html" %>