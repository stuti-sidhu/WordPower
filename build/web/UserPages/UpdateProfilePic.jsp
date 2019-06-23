<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<script type="text/javascript" src="JQuery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
    function f1()
    {
        $("#FL").click();
    }
    function readURL(input)
    {
        if (input.files)
        {
            var reader = new FileReader();
            reader.onload = function (e)
            {
                $("#myimage").attr("src", e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }
    }
</script>

<form action="../FileUpload" method="post" enctype="multipart/form-data">
    <%
        int x = Integer.parseInt(session.getAttribute("LRID").toString());
        datalayer.DALUser objDAL = new datalayer.DALUser();
        beans.User us = objDAL.getUserData(x);
    %>

    <img src="../UploadedImages/<%=us.getProfilePic()%>" width="150" height="150" id="myimage">
    
    <input type="file" id="FL" style="visibility:hidden" onchange="readURL(this)" accept="image/jpeg" name="FL">
    <a href="#" onclick="f1()">Change Picture</a>
    <br>
    <input type="submit" name="btnUpload" value="Upload" class="btn btn-success">
</form>
<%@include file="Footer.html" %>
