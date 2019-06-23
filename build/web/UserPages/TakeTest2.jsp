<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>

<form method="post" action="../User">

<%
    String wordids = session.getAttribute("WIDS").toString();
    
    datalayer.DALQuestions objDAL = new datalayer.DALQuestions();
    java.util.ArrayList<beans.Question> AllQuestions = objDAL.getQuestions(wordids);
    int i = 1;
    
    for(beans.Question question : AllQuestions)
    {
    %>
    
    <p class="alert alert-success" >
        <b> <%=question.getWord()%> </b>
    <br><br>

        <b> <%=question.getDescription()%> </b> <br><br>
        
    <%=question.getQuestionText()%>
    <input type="hidden" name="question<%=i%>" value="<%=question.getQuestionId()%>">
    <br><br>
    <%
        for (beans.Option option : question.AllOptions ) {
    
        if(option.getPictorial().equals("N") )
        {
    %>
    
    
    
    <span style="padding:10px 10px 10px 40px;font-style:italic">
        - <input type="radio" name="option<%=i%>" value="<%=option.getOptionId()%>"> <%=option.getOptionText()%> <br><br>
    </span>
    <%}
    else
{%>
    - <input type="radio" name="option<%=i%>" value="<%=option.getOptionId()%>"> <img src="../QuestionImages/<%=option.getImageName()%>" style="height:100px;width:100px"> <br><br>
    <%} 
} %>
</p>

    
    <%i++;}%>
    <input type="hidden" name="NOW" value="<%=AllQuestions.size()%>">
    <input type="submit" name="btnSubmit" value="Submit" class="btn btn-success">
</form>
    

<%@include file="Footer.html" %>