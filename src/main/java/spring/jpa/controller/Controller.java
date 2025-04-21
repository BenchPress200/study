package spring.jpa.controller;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.jpa.entity.Post;
import spring.jpa.entity.User;
import spring.jpa.repository.PostRepository;
import spring.jpa.repository.UserRepository;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @GetMapping("/init")
    @Transactional
    public void init() {
        User user = userRepository.save(User.builder().
                name("temp").
                build());

        postRepository.save(Post.builder()
                .user(user)
                .title("temp title")
                .build()
        );
    }

    @GetMapping("/findById")
    @Transactional
    public void findById() {
        postRepository.findByUserId(1L);
    }

    @GetMapping("/findByEntity")
    @Transactional
    public void findByEntity() {
        User user = userRepository.findById(1L).get();
        postRepository.findByUser(user);
    }
}
