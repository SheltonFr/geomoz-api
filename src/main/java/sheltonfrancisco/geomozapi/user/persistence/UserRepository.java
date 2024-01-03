package sheltonfrancisco.geomozapi.user.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import sheltonfrancisco.geomozapi.user.domain.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> , JpaSpecificationExecutor<User> {
    Optional<User> findUserByUsernameIgnoreCase(String username);
}
