<%@ page import="com.company.entity.User" %>
<%@ page import="com.company.dao.inter.UserDAOinter" %>
<%@ page import="com.company.main.Context" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP page</title>
</head>
<body>
<%
  User user= (User) request.getAttribute("usr");
%>
<div>
  <form action="userdetail" method="post">
    <input type="hidden", name="action", value="update">
    <input type="hidden", name="id", value="<%=user.getId()%>">
    <label>Name:</label>
    <input type="text", name="name", value="<%=user.getName()%>">
    <br/>
    <label>Surname:</label>
    <input type="text", name="surname", value="<%=user.getSurname()%>">
    <br/>
    <label>Email:</label>
    <input type="text", name="email", value="<%=user.getEmail()%>">
    <br/>
    <label>Phone:</label>
    <input type="text", name="phone", value="<%=user.getPhone()%>">
    <br/>
    <label>Address:</label>
    <input type="text", name="address", value="<%=user.getAddress()%>">
    <br/>
    <label>Profile Description:</label>
    <input type="text", name="profile_description", value="<%=user.getProfileDescription()%>">
    <input type="submit", name="save", value="Save">
  </form>
</div>
</body>
</html>
