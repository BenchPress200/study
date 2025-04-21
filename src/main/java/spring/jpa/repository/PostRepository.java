package spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.jpa.entity.Post;
import spring.jpa.entity.User;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByUser(User user);
    Post findByUserId(Long userId);
}
