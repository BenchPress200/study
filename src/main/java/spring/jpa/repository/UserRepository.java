package spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
