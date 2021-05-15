package mv.BreakFastMV.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodEnums {
    PAO("Pão"),
    BOLO("Bolo"),
    SUCO("Suco"),
    QUEIJO("Queijo"),
    LEITE("Leite"),
    BANANA("Banana");

    private final String description;
}
