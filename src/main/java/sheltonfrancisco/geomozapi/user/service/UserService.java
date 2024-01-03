package sheltonfrancisco.geomozapi.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sheltonfrancisco.geomozapi.user.domain.model.User;

public interface UserService {
    User findById(Long id);
    Page<User> findAll(Pageable pageable);
    void deleteById(Long id);
}
