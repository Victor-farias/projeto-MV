package mv.BreakFastMV.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import mv.BreakFastMV.enums.FoodEnums;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private FoodEnums name;
}
