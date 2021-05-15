package mv.BreakFastMV.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class FoodDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 15)
    private String name;
}
