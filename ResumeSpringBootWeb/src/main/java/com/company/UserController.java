package com.company;

import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceinter userService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request) throws ParseException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String birthdateStr = request.getParameter("birthdate");
        java.sql.Date birthdate = null;
        if (birthdateStr != null && !birthdateStr.trim().isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bd = sdf.parse(birthdateStr);
            birthdate = new java.sql.Date(bd.getTime());
        }


        List<User> list = userService.getAll(name, surname, email, phone, address, birthdate);
        request.setAttribute("list", list);
        return "users";
    }
}
