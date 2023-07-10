package com.fssa.mk.project;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentDetailsValidator {

	public static boolean validate(PaymentDetails payment) {
		
		// Checking the Object Null or not 
		if (payment == null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}

		return true;
	}

	
	// CardHolder Name Validater
	public static boolean validateCardHolder(String cardHolder) throws IllegalArgumentException {

		if (cardHolder == null || "".equals(cardHolder.trim())) {
			throw new IllegalArgumentException("Card Holder Name cannot be empty or null");
		}

		String nameregex = "^[A-Za-z]{2,29}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(cardHolder);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Card Holder Name is Invalid: ");
		}
		return true;

	}

	// Card Number Validater
	public static boolean validateCardNumber(String cardNumber) throws IllegalArgumentException {

		if ("".equals(cardNumber) || null == cardNumber) {
			throw new IllegalArgumentException("Card Number cannot be empty or null");
		}
		String cardNumberRegex = "^[0-9]{12,16}$";
		Pattern pattern = Pattern.compile(cardNumberRegex);
		Matcher matcher = pattern.matcher(cardNumberRegex);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Card Number is Invalid: ");
		}
		return true;

	}

	// Card CVV Number Validater
	public static boolean validateCvv(int cvv) throws IllegalArgumentException {

		if (000 == cvv || 99 >= cvv || 9999 < cvv) {
			throw new IllegalArgumentException("CVV Number cannot be empty or Invaile Cvv");
		}

		return true;

	}
	
	
	// Payment Option Validater
	public static boolean validatePaymentOption(String paymentOption) throws IllegalArgumentException {

		if (paymentOption == null || "".equals(paymentOption)) {
			throw new IllegalArgumentException("Payment Option cannot be empty or null");
		}

		return true;

	}
	
	
	// Payment Id Validater
	public static boolean validatePaymentId(long paymentId) throws IllegalArgumentException{
	
		if ("".equals(paymentId)) {
			throw new IllegalArgumentException("Payment Id Cannot be empty");
		}
	
		if(paymentId <= 9999 || paymentId >= 1000000000) {
			throw new IllegalArgumentException("Payment id is Invalid: ");
		}
		
		return true;
		
	}
	
	// Expire Date Validater
	public static boolean expiryDateValidator(String expiryDate) {
	
		if (expiryDate == null || "".equals(expiryDate)) {
			throw new IllegalArgumentException("Expiry Date cannot be empty or null");
		}

		String cardNumberRegex = "^(0[1-9]|1[0-2])\\/?(([0-9]{4}|[0-9]{2})$)";
		Pattern pattern = Pattern.compile(cardNumberRegex);
		Matcher matcher = pattern.matcher(cardNumberRegex);
		Boolean isMatch = matcher.matches();
		

		if (!isMatch) {
            throw new IllegalArgumentException("Input date must be today or a future date.");
        }
		
			return true;
		
	} 
	
	
}
