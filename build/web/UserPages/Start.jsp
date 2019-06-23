<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>


<style type="text/css">
    .panel .panel-body a{
        width:150px;
        margin-bottom:20px;
    }
</style>

<script type="text/javascript">

    $(document).ready(
            function ()
            {
                $("#CategoryDiv a").click(
                        function ()
                        {
                            var v = $(this).text();
                            
                            $("#txtCategory").val(v);
                            
                            $("#CategoryDiv").slideUp("slow", down);
                        }
                );
        
                $("#LevelDiv a").click(
                        function ()
                        {
                            var v = $(this).text();
                            
                            $("#txtLevel").val(v);
                            
                            document.forms[0].submit();    
                        }
                );
        
        
        
            }

    )

    function down()
    {
        $("#LevelDiv").slideDown();
    }

</script>

<form method="post" action="TakeTest.jsp">
    
    <input type="hidden" id="txtCategory" name="txtCategory">
    <input type="hidden" id="txtLevel" name="txtLevel">
    
</form>

<center>

    <div style="width:400px">

        <div class="panel panel-info" id="CategoryDiv" style="margin-bottom:0px;" >

            <div class="panel-heading">
                Select Category
            </div>

            <div class="panel-body">

                <table>
                    <tr>
                        <td>
                            <a href="#" class="btn btn-warning" >GRE</a>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <a href="#" class="btn btn-warning">GMAT</a>

                        </td>
                    </tr>

                    <tr>
                        <td>
                            <a href="#" class="btn btn-warning">CAT</a>
                        </td>
                    </tr>
                </table>

            </div>
            
        </div> <!-- Category Div -->
        

        <div class="panel panel-danger" id="LevelDiv" style="display:none">

            <div class="panel-heading">
                Select Level
            </div>

            <div class="panel-body">

                <table>
                    <tr>
                        <td>
                            <a href="#" class="btn btn-danger" >Easy</a>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <a href="#" class="btn btn-danger">Moderate</a>

                        </td>
                    </tr>

                    <tr>
                        <td>
                            <a href="#" class="btn btn-danger">Difficult</a>
                        </td>
                    </tr>
                </table>

            </div>
        
        
    </div>
</center>



<%@include file="Footer.html" %>