package repositories;


import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository<User,Long> {
}
