<%@ page import="com.company.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/3077c7ca85.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
            integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
            integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script src="users.js"></script>
</head>
<body>

<%
    List<User> list = (List<User>) request.getAttribute("list");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
%>

<ul class="nav nav-pills nav-fill">
    <li class="nav-item">
        <a class="nav-link active" href="#">Əsas səhifə</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">Haqqımızda</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">Məhsullar</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">Xidmətlər</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">Bloq</a>
    </li>
    <li class="nav-item">
        <a class="nav-link disabled" href="#">Əlaqə</a>
    </li>
</ul>
<div style="text-align: right">
    <form action="logout" method="get">
        <input type="submit" class="btn btn-primary" name="action" value="Logout"/>
    </form>
</div>
<div>
    <form action="users" , method="get" style="margin: 1% 10% 1% 10%;" row>
        <div class="row">
            <div class="form-group">
                <div class="col-sm-4">
                    <label for="name">name</label>
                    <input class="form-control" type="text" , id="name" , name="name" , value="">
                    <label for="surname">surname</label>
                    <input class="form-control" type="text" , id="surname" , name="surname" , value="">
                </div>
                <div class="col-sm-4">
                    <label for="email">email</label>
                    <input class="form-control" type="text" , id="email" , name="email" , value="">
                    <label for="phone">phone</label>
                    <input class="form-control" type="text" , id="phone" , name="phone" , value="">
                    <label for="address">address</label>
                    <input class="form-control" type="text" , id="address" , name="address" , value="">
                    <label for="birthdate">birthdate</label>
                    <input class="form-control" type="date" , id="birthdate" , name="birthdate" , value="">
                    <input class="btn btn-primary" type="submit" , name="search" , value="Search"
                           style="margin: 2% 0% 2% 0%">

                </div>
            </div>
        </div>
    </form>
</div>

<div class="even-row-color">
    <table class="table">
        <thead>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Description</th>
            <th>Birthdate</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (User u : list) {
        %>
        <tr style="margin: 0%">
            <td><%=u.getName()%>
            </td>
            <td><%=u.getSurname()%>
            </td>
            <td><%=u.getEmail()%>
            </td>
            <td><%=u.getPhone()%>
            </td>
            <td><%=u.getAddress()%>
            </td>
            <td><%=u.getProfileDescription()%>
            </td>
            <td><%=sdf.format(u.getBirthdate())%>
            </td>
            <td>
                <input type="hidden" , name="id" , value="<%=u.getId()%>">
                <input type="hidden" , name="action" , value="delete">
                <button class="btn btn-danger" type="submit" , value="delete" data-toggle="modal"
                        data-target="#exampleModal" onclick="setIdForDelete(<%=u.getId()%>)">
                    <i class="fa-sharp fa-solid fa-trash"></i>
                </button>
            </td>
            <td>
                <form action="userdetail" method="get">
                    <input type="hidden" , name="id" , value="<%=u.getId()%>">
                    <input type="hidden" , name="action" , value="update">
                    <button class="btn btn-secondary" type="submit" , value="update">
                        <i class="fa-regular fa-pen-to-square"></i>
                    </button>
                </form>
            </td>
        </tr>
        <%}%>
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Are you sure?
                    </div>
                    <div class="modal-footer">
                        <form action="userdetail" method="POST">
                            <input type="hidden" name="id" value="" id="idForDelete"/>
                            <input type="hidden" name="action" value="delete"/>
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" class="btn btn-danger" value="Delete"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        </tbody>
    </table>
</div>
</body>
</html>
