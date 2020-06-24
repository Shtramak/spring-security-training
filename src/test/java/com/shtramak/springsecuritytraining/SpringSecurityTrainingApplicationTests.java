package com.shtramak.springsecuritytraining;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityTrainingApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void encryptTest() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String secret = passwordEncoder.encode("secret");
        System.out.println(secret);
    }
}
