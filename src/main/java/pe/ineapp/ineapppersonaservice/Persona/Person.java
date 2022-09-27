package pe.ineapp.ineapppersonaservice.Persona;


import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Builder
public class Person {

    @Id
    Long id;
    String name;
    String lastName;
    String dni;
    String email;
    LocalDate birthDate;

}
