package sheltonfrancisco.geomozapi.province.domain.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import sheltonfrancisco.geomozapi.utils.EnumTypes;

public record CreateProvinceRequest(
        @NotNull(message = "O campo Name e' obrigatorio")
        @NotBlank(message = "O campo Name nao pode ser vazio")
        String name,
        @NotNull(message = "O campo abbreviation e' obrigatorio")
        @NotBlank(message = "O campo abbreviation nao pode ser vazio")
        String abbreviation,
        @NotNull(message = "O campo Region e' obrigatorio")
        EnumTypes.Region region
) {
}
