package sheltonfrancisco.geomozapi.province.domain;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;
import sheltonfrancisco.geomozapi.province.presentation.ProvinceJson;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class ProvinceMapper {
    public static final ProvinceMapper INSTANCE = Mappers.getMapper(ProvinceMapper.class);

    public abstract ProvinceJson mapToJson(Province province);

    public abstract Province mapToModel(CreateProvinceRequest request);

    public Page<ProvinceJson> mapToJson(Page<Province> page) {
        return page.map(this::mapToJson);
    }

    public List<ProvinceJson> mapToJson(List<Province> provinces) {
        return provinces.stream().map(this::mapToJson).collect(Collectors.toList());
    }
}
