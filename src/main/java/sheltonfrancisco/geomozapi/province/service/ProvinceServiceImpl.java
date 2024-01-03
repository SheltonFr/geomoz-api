package sheltonfrancisco.geomozapi.province.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import sheltonfrancisco.geomozapi.exceptions.GeoMozException;
import sheltonfrancisco.geomozapi.province.domain.Province;
import sheltonfrancisco.geomozapi.province.domain.ProvinceMapper;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;
import sheltonfrancisco.geomozapi.province.persistence.ProvinceRepository;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository repository;

    @Override
    public Province create(CreateProvinceRequest request) {
        try {
            Province province = ProvinceMapper.INSTANCE.mapToModel(request);
            return repository.save(province);
        } catch (DataIntegrityViolationException exception) {
            if (exception.getCause() instanceof ConstraintViolationException)
                throw new GeoMozException(exception.getMessage(), HttpStatus.CONFLICT);
            else throw new GeoMozException(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public Province findById(Long id) {
        return null;
    }

    @Override
    public Page<Province> findAll(Pageable pageable) {
        throw new GeoMozException("Testando excecao personalizada!", HttpStatus.CONFLICT);
    }

    @Override
    public Province update(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
