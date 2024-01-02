package sheltonfrancisco.geomozapi.province.presentation;

import com.fasterxml.jackson.annotation.JsonInclude;
import sheltonfrancisco.geomozapi.district.domain.District;
import sheltonfrancisco.geomozapi.utils.EnumTypes;

import java.time.LocalDateTime;
import java.util.List;

public record ProvinceJson (
        Long id,
        String name,
        String abbreviation,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        EnumTypes.Region region,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        List<District> districts,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
