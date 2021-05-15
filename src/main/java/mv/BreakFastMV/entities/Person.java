package mv.BreakFastMV.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    //private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int cpf;

    @Column(nullable = false)
    private String foodToBring;


}
