package com.boniromou.ssob.service;
import java.util.Date;

import com.boniromou.ssob.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserAccount("testadmin");
        user.setUsername("testadmin");
        user.setAvatarUrl("");
        user.setGender(0);
        user.setUserPassword("Cc123456");
        user.setPhone("12345678900");
        user.setEmail("testadmin@gamil.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }
}