package com.company.controller;//package com.company.controller;

import com.company.dao.inter.UserRepository;
import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;


@Controller
public class LoginController extends HttpServlet {

    @Autowired
    private UserServiceinter userService;

    private static BCryptPasswordEncoder verifyer = new BCryptPasswordEncoder();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String email = request.getParameter("email");

            String password = request.getParameter("password");
            User user = userService.findByEmail(email);

            if (user == null) {
                throw new IllegalArgumentException("User doesn't existt!!!");
            }

            request.getSession().setAttribute("loggedInUser", user);
            response.sendRedirect("users");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Autowired
    private UserRepository userRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView index(
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "password", required = false) String password) throws ParseException {

        List<User> list = userRepo.findByEmailAndPassword(email, password);
        ModelAndView mv = new ModelAndView("users");
        mv.addObject("list", list);
        return mv;
    }


}

