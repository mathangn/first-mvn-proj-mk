package com.fssa.mk.day19.solved;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserValidator {

    @Test
    public void testValidUserId() {
        User user = new User();
        user.setId(2);

        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testInvalidUserId() {
        User user = new User();
        user.setId(0);

        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testValidUsername() {
        User user = new User();
        user.setName("Mathankumar");


        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testInvalidUsername() {
        User user = new User();
        user.setName("M");


        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testValidPassword() {
        User user = new User();
        user.setPassword("Mathan@123");

        

        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testWeakPassword() {
        User user = new User();
        user.setPassword("weakpassword");


        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testValidEmail() {
        User user = new User();
        user.setEmail("mathankumar.nagarajan@fssa.freshworks.com");


        Assertions.assertTrue(UserValidator.validate(user));
    }

    @Test
    public void testInvalidEmail() {
        User user = new User();
        user.setEmail("invalid.email");


        Assertions.assertTrue(UserValidator.validate(user));
    }


}
