package az.katv1.controller;

import az.katv1.service.EskizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EskizRestController {
    private final EskizService eskizService;

    public EskizRestController(EskizService eskizService) {
        this.eskizService = eskizService;
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
