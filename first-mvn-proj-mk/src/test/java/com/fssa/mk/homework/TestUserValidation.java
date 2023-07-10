package com.fssa.mk.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserValidation {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(UserDetailsValidator.ValidateName("Mathankumar"));
	}
	
	@Test
	public void testInvalidName() {
		try {
			UserDetailsValidator.ValidateName(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("UserName cannot be empty or null", ex.getMessage());
		}
	}
//  for valid Email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserDetailsValidator.validateEmail("mathankumar@gmail.com"));
	}
	@Test
	public void testInvalidEmail() {
		try {
			UserDetailsValidator.validateEmail("mathan");
			Assertions.fail("ValidateEmail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The email address is: Invalid", ex.getMessage());
		}
	}
	@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(UserDetailsValidator.validatePhoneNumber("8940169934"));
	}
	@Test
	public void testInvalidPhoneNumber() {
		try {
			UserDetailsValidator.validatePhoneNumber("12345");
			Assertions.fail("ValidatePhoneNumber failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Phone number is: Invalid", ex.getMessage());
		}
	}
	@Test
	public void testValidPinCode() {
		Assertions.assertTrue(UserDetailsValidator.validatePinCode("623707"));
	}
	@Test
	public void testInvalidPinCode() {
		try {
			UserDetailsValidator.validatePinCode("012345");
			Assertions.fail("ValidatePincode failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Pin code is: Invalid", ex.getMessage());
		}
	}
	@Test
	public void testValidPlace() {
		Assertions.assertTrue(UserDetailsValidator.validatePlace("Madurai"));
	}
	@Test
	public void testInvalidPlace() {
		try {
			UserDetailsValidator.validatePlace(null);
			Assertions.fail("ValidatePlace failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Place cannot be empty or null", ex.getMessage());
		}
	}
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserDetailsValidator.validatePassword("Mathan@123"));
	}
	@Test
	public void testInvalidPassword() {
		try {
			UserDetailsValidator.validatePassword(null);
			Assertions.fail("ValidatePassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Password cannot be empty or null", ex.getMessage());
		}
	}
}
