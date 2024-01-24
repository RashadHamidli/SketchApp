package az.katv1.controller;

import az.katv1.model.dao.entity.Sketch;
import az.katv1.service.SketchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sketch")
public class ScetchViewController {
    private final SketchService sketchService;

    public ScetchViewController(SketchService sketchService) {
        this.sketchService = sketchService;
    }


    @GetMapping("/view")
    public String viewSketch(Model model) {
        List<Sketch> sketch = sketchService.getAllSketch();

        if (sketch == null) {
            // Handle the case where the sketch is not found
            return "redirect:/home";  // Örnek bir yönlendirme, kendi proje mantığınıza uygun olarak değiştirin
        }

        model.addAttribute("allSketches", sketch);
        return "view-all-sketch";
    }

    @GetMapping("/view/{id}")
    public String viewSketchById(@PathVariable Integer id, Model model) {
        Sketch sketch = sketchService.getSketchById(id);

        if (sketch == null) {
            // Handle the case where the sketch is not found
            return "redirect:/home";  // Örnek bir yönlendirme, kendi proje mantığınıza uygun olarak değiştirin
        }

        model.addAttribute("sketch", sketch);
        return "view-sketch";
    }
}
