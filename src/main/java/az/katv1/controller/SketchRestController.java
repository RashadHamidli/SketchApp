package az.katv1.controller;

import az.katv1.service.SketchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SketchRestController {
    private final SketchService sketchService;

    public SketchRestController(SketchService sketchService) {
        this.sketchService = sketchService;
    }

    @GetMapping("/get")
    public ResponseEntity<String> getEskiz() {
        return ResponseEntity.ok("successful");
    }

    @PostMapping("/add")
    public ResponseEntity<String> createEskiz() {
        return ResponseEntity.ok("successfully add eskiz");
    }
}
