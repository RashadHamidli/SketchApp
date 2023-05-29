package com.company.controller;


import com.company.entity.User;
import com.company.form.UserForm;
import com.company.service.inter.UserServiceinter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/users")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public ModelAndView  index(
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

        List<User> list = userService.getAll(name, surname, email, phone, address, null);
        ModelAndView mv = new ModelAndView("users");
        mv.addObject("list", list);
        return mv;
    }

    @GetMapping("/usersm")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public ModelAndView indexM(
            @Valid
            @ModelAttribute("user") UserForm u,
            BindingResult bindingResult) {
        ModelAndView mv = new ModelAndView("users");
        if (bindingResult.hasErrors()) {
            return mv;
        }
        List<User> list = userService.getAll(u.getName(), u.getSurname(), u.getEmail(), u.getPhone(), u.getAddress(), u.getBirthdate());

        mv.addObject("list", list);
        return mv;
    }
    @GetMapping("/test")
    public String index(){
        return "her kese aciqdir";
    }

    @ModelAttribute("user")
    public UserForm getEmptyUserForm() {
        return new UserForm(null, null, null, null, null, null);
    }
}
