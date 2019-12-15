package pl.pawel.springgit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pawel.springgit.model.Person;


@Controller
public class PersonController {

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Paweł", "Gil", 13);
    }
}
