package az.katv1.controller;

import az.katv1.dto.EskizRequest;
import az.katv1.service.EskizService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/eskiz")
public class EskizController {
    private final EskizService eskizService;

    public EskizController(EskizService eskizService) {
        this.eskizService = eskizService;
    }

    @GetMapping("/add")
    public String showAddEskizForm(Model model) {
        model.addAttribute("eskizRequest", new EskizRequest());
        return "add-eskiz";
    }

    @PostMapping("/add")
    public String addEskiz(@ModelAttribute EskizRequest eskizRequest) {
        eskizService.addEskiz(eskizRequest);
        return "redirect:/eskiz/add?success=true";
    }
}
