<%@ page import="com.company.entity.User" %>
<%
    User user= (User) session.getAttribute("loggedInUser");
%>
<%="Wellcome, "+user.getName()+"!!!"%>
