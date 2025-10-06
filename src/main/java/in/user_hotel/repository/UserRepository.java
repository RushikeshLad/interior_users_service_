package in.user_hotel.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.user_hotel.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User>findByEmail(String email);
}
