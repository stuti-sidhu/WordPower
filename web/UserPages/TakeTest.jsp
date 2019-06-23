<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.html" %>
<%
    String x = request.getParameter("txtCategory");
    String y = request.getParameter("txtLevel");

    int Category, Level;

    if (x.equals("GRE")) {
        Category = 1;
    } else if (x.equals("GMAT")) {
        Category = 2;
    } else {
        Category = 3;
    }
    if (y.equals("Easy")) {
        Level = 1;
    } else if (y.equals("Moderate")) {
        Level = 2;
    } else {
        Level = 3;
    }
    datalayer.DALWord objDAL = new datalayer.DALWord();
    java.util.ArrayList<beans.Word> AllWords = objDAL.getWords(Level, Category);

    String wordids = "";

    for (beans.Word word : AllWords) {

        wordids = wordids + String.valueOf(word.getWordId())+",";

%>

<p class="alert alert-success" >
    <b> <%=word.getWord()%> &nbsp; &nbsp; (<%=word.getMeaning()%>) </b>
    <br><br>
    <%
        for (beans.Usage usage : word.Usages) {
    %>
    <span style="padding:10px 10px 10px 40px;font-style:italic">
        -<%=usage.getUsage()%><br><br>
    </span>
    <% } %>
</p>
<% }
wordids = wordids.substring(0, wordids.length()-1);
session.setAttribute("WIDS", wordids);
%>

<a href="TakeTest2.jsp?cat=<%=Category%>&lvl=<%=Level%>" class="btn btn-success">Proceed to Quiz</a>

<%@include file="Footer.html" %>