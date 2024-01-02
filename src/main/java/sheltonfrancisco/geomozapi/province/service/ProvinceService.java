package sheltonfrancisco.geomozapi.province.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sheltonfrancisco.geomozapi.province.domain.Province;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;

public interface ProvinceService {
    Province create(CreateProvinceRequest request);
    Province findById(Long id);
    Page<Province> findAll(Pageable pageable);
    Province update( Long id);
    void deleteById(Long id);
}
