package mv.BreakFastMV.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 5)
    private String name;

    @NotEmpty
    @CPF
    private Integer cpf;

    @Valid
    @NotEmpty
    private List<FoodDTO> foodToBring;


}
