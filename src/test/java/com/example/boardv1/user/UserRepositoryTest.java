package com.example.boardv1.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.Import;

import jakarta.persistence.EntityManager;

@Import(UserRepository.class)
@DataJpaTest // 엔티티매니저가 ioc에 등록됨
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityManager em;

    @Test
    public void save_fail_test() {
        // given
        User user = new User(); // 비영속 개체
        user.setUsername("ssar");
        user.setPassword("1234");
        user.setEmail("ssar@nate.com");

        // when
        User findUser = userRepository.save(user); // 영속화됨

        // eye
        System.out.println(findUser);
    }

    @Test
    public void save_test() {
        // given
        User user = new User(); // 비영속 개체
        user.setUsername("love");
        user.setPassword("1234");
        user.setEmail("love@nate.com");

        // when
        User findUser = userRepository.save(user); // 영속화됨

        // eye
        System.out.println(findUser);
    }

    @Test
    public void findByUsername_test() {
        // given
        String username = "cos";

        // when
        User findUser = userRepository.findByUsername(username);
        // eye
        System.out.println(findUser);
    }

    @Test
    public void findById_test() {
        // given
        // when
        // eye
    }

}
