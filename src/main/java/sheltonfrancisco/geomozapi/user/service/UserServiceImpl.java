package sheltonfrancisco.geomozapi.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sheltonfrancisco.geomozapi.user.domain.model.User;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
