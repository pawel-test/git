package pl.pawel.springgit.Controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/name")
    String myName(){
        return "Pawel";
    }
}
