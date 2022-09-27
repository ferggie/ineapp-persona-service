package pe.ineapp.ineapppersonaservice.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    @RequestMapping("/getAll")

    public List<Person> getAll(){

        LocalDate date = LocalDate.of(1991, Month.NOVEMBER, 15 );

        Person person = Person.builder()
                .id(1L)
                .name("Eduardo")
                .lastName("Zuniga")
                .dni("12345678")
                .email("abc@isil.com.pe")
                .birthDate(date).build();

        return List.of(person);

    }
    @GetMapping
    @RequestMapping("/getbyid")
    public Person getById(){

        LocalDate date = LocalDate.of(1991, Month.NOVEMBER, 15 );

        Person person = Person.builder()
                .id(1L)
                .name("Eduardo")
                .lastName("Zuniga")
                .dni("12345678")
                .email("abc@isil.com.pe")
                .birthDate(date).build();

        return person;
    }

    //put
    //post
    //delete
}

