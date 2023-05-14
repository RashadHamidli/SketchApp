package com.company;

import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserServiceinter userService;

    //    @RequestMapping(method = RequestMethod.GET)
//    public String index(HttpServletRequest request) throws ParseException {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//        String email = request.getParameter("email");
//        String phone = request.getParameter("phone");
//        String address = request.getParameter("address");
//        String birthdateStr = request.getParameter("birthdate");
//        java.sql.Date birthdate = null;
//        if (birthdateStr != null && !birthdateStr.trim().isEmpty()) {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date bd = sdf.parse(birthdateStr);
//            birthdate = new java.sql.Date(bd.getTime());
//        }
//
//
//        List<User> list = userService.getAll(name, surname, email, phone, address, birthdate);
//        request.setAttribute("list", list);
//        return "users";
//    }
    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public ModelAndView index(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "address", required = false) String address,
            @RequestParam(value = "birthdate", required = false) String birthdateStr) throws ParseException {

        java.sql.Date birthdate = null;
        if (birthdateStr != null && !birthdateStr.trim().isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bd = sdf.parse(birthdateStr);
            birthdate = new java.sql.Date(bd.getTime());
        }

        List<User> list = userService.getAll(name, surname, email, phone, address, birthdate);
        ModelAndView mv = new ModelAndView("users");
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usersm")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("users");
        return mv;
    }
}
