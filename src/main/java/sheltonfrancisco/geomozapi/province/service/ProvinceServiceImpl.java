package sheltonfrancisco.geomozapi.province.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import sheltonfrancisco.geomozapi.province.domain.Province;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;

@Service
public class ProvinceServiceImpl implements ProvinceService{
    @Override
    public Province create(CreateProvinceRequest request) {
        return null;
    }

    @Override
    public Province findById(Long id) {
        return null;
    }

    @Override
    public Page<Province> findAll() {
        return null;
    }

    @Override
    public Province update(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
