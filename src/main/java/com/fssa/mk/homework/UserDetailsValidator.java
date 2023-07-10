package com.fssa.mk.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidator {
	public static boolean validate(UserDetails user) {
		if(user==null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}	
		ValidateName(user.username);
		validateEmail(user.email);
		validatePhoneNumber(user.ph_num);
		validatePinCode(user.pincode);
		validatePlace(user.place);
		validatePassword(user.password);	
		return true;
		
	}
	
	// name validate
		public static boolean ValidateName(String username)throws IllegalArgumentException {
			if (username == null || "".equals(username.trim())) {
				throw new IllegalArgumentException("UserName cannot be empty or null");
			}
			
			String nameregex= "^[A-Za-z]{2,30}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(username);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("UserName is Invalid: ");
				
			}
			return true;
			
		}
		// Email validate
		public static boolean validateEmail(String email) throws IllegalArgumentException {
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			Boolean isMatch = matcher.matches();
			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("The email address is: Invalid");
			}
		}
		// PhoneNumber validate
		public static boolean validatePhoneNumber(String ph_num) throws IllegalArgumentException {
			String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ph_num);
			Boolean isMatch = matcher.matches();
			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("Phone number is: Invalid");
			}
		}
		// Pincode validate
		public static boolean validatePinCode(String pincode) throws IllegalArgumentException {
			String regex = "^[1-9][0-9]{5}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(pincode);
			Boolean isMatch = matcher.matches();
			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("Pin code is: Invalid");
			}
		}
		// Place validate
		public static boolean validatePlace(String place)throws IllegalArgumentException {
			if (place == null || "".equals(place.trim())) {
				throw new IllegalArgumentException("Place cannot be empty or null");
			}
			
			String nameregex= "^[A-Za-z]{2,30}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(place);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("Place should be in minimum 2 letters  and maximum 30 letters");
				
			}
			return true;
			
		}
		// password  validate
		public static boolean validatePassword(String password)throws IllegalArgumentException {
			if (password == null || "".equals(password.trim())) {
				throw new IllegalArgumentException("Password cannot be empty or null");
			}
			String passwordregex= "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
			Pattern pattern = Pattern.compile(passwordregex);
			Matcher matcher = pattern.matcher(password);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("The password is invalid");
				
			}
			
			
			return true;
			
		}
}