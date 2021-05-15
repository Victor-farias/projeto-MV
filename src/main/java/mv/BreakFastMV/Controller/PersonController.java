package mv.BreakFastMV.Controller;

import lombok.AllArgsConstructor;
import mv.BreakFastMV.Services.PersonService;
import mv.BreakFastMV.dto.request.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;

    public String create(PersonDTO personDTO) {


    }
}
