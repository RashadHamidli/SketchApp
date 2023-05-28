//package com.company.controller;

import com.company.dao.inter.UserDAOInter;
import com.company.dao.inter.UserRepository;
import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

//@Controller
//public class LoginController {
//@Controlle
//public class LoginController extends HttpServlet {
//
//    @Autowired
//    private UserServiceinter userService;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String index(HttpServletRequest request) throws ParseException {
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        boolean list = userDao.authenticate(email, password);
//        request.setAttribute("list", list);
//        return "login";
//    }
//}

//    private static BCrypt.Verifyer verifyer = BCrypt.verifyer();

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("login.jsp").forward(request, response);
//    }
//
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            String email = request.getParameter("email");
//
//            String password = request.getParameter("password");
//            User user = userDao.findByEmail(email);
//
//            if (user == null) {
//                throw new IllegalArgumentException("User doesn't existt!!!");
//            }
//
////            BCrypt.Result rs = verifyer.verify(password.toCharArray(), user.getPassword().toCharArray());
////
////            if (!rs.verified) {
////                throw new IllegalArgumentException("password is incorrect!!!");
////            }
//
//            request.getSession().setAttribute("loggedInUser", user);
//            response.sendRedirect("users");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}
//    @Autowired
//    private UserRepository userRepo;

//    @RequestMapping(method = RequestMethod.GET, value = "/login")
//    public ModelAndView index(
//            @RequestParam(value = "email", required = false) String email,
//            @RequestParam(value = "password", required = false) String password) throws ParseException {
//
//        List<User> list = userRepo.findByEmailAAndPassword(email, password);
//        ModelAndView mv = new ModelAndView("users");
//        mv.addObject("list", list);
//        return mv;
//    }

//    @GetMapping("/login")
//    public String showLoginPage() {
//        return "login";
//    }
//    @PostMapping("/login")
//    public String processLogin() {
//        }
//    }
//    @PostMapping("/login")
//    public String processLogin(@RequestParam("email") String username,
//                               @RequestParam("password") String password,
//                               RedirectAttributes redirectAttributes) {
//        // Perform authentication and login logic
//        if (userService.authenticate(username, password)) {
//            // Successful login
//            return "redirect:/resume/users";
//        } else {
//            // Failed login
//            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
//            return "redirect:/resume/login";
//        }
//    }

//}

