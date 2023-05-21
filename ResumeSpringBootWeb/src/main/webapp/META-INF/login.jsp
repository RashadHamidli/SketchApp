<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" href="assets/css/AdminLogin.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="login_background">

<form action="/login" method="POST">
    <div class="col-4 container login_fix_">
        <div class="form-group">
            <label>Email address</label>
            <input type="email" class="form-control" placeholder="email@example.com" name="email">
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" placeholder="Password" name="password">
        </div>
        <button type="submit" class="btn btn-primary" name="login">Login</button>
    </div>
</form>

<%--</body>--%>
<%--</html>--%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Login</title>--%>
<%--    <!-- Bootstrap CSS dosyasını projenize dahil edin -->--%>
<%--    <link rel="stylesheet" href="path/to/bootstrap.css">--%>
<%--    <!-- Eğer Bootstrap'in jQuery'ye bağımlı olan bileşenlerini kullanacaksanız, jQuery dosyasını da dahil edin -->--%>
<%--    <script src="path/to/jquery.js"></script>--%>
<%--    <!-- Bootstrap JavaScript dosyasını projenize dahil edin -->--%>
<%--    <script src="path/to/bootstrap.js"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <h1>Login</h1>--%>
<%--    <form action="/login" method="post">--%>
<%--        <div class="form-group">--%>
<%--            <label for="username">Username:</label>--%>
<%--            <input type="text" class="form-control" id="username" name="username" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="password">Password:</label>--%>
<%--            <input type="password" class="form-control" id="password" name="password" required>--%>
<%--        </div>--%>
<%--        <button type="submit" class="btn btn-primary">Login</button>--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
