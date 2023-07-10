package com.fssa.mk.project;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPaymentDetailsValidate {
	
	// Card Holder Valid Input code
	@Test
	public void testValidCardHolder() {
		Assertions.assertTrue(PaymentDetailsValidator.validateCardHolder("Mathankumar"));
	}
	
	// Card Holder Invalid Input code
	@Test
	public void testInvaildCardHolder() {
		
		try {
			PaymentDetailsValidator.validateCardHolder(null);
			Assertions.fail("Validate Card Holder Name failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Card Holder Name cannot be empty or null", ex.getMessage());
		}
		
	}
	
	// Card Number Valid Input code
	@Test
	public void testValidCardNumber() {
		Assertions.assertTrue(PaymentDetailsValidator.validateCardNumber("1234567890123456"));
	}
	
	@Test
	public void testInvalidCardNumber() {
		
		try {
			PaymentDetailsValidator.validateCardNumber(null);
			Assertions.fail("Validate Card Number failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Card Number cannot be empty or null", ex.getMessage());
		}
		
	}
	
	// Card CVC Number Valid Card
	@Test
	public void testValidCvvNumber() {
		Assertions.assertTrue(PaymentDetailsValidator.validateCvv(325));
	}
	
	@Test
	public void testInvalidCvvNumber() {
		
		try {
			PaymentDetailsValidator.validateCvv(000);
			Assertions.fail("Validate Card CVV Number failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("CVV Number cannot be empty or Invaile Cvv", ex.getMessage());
		}
		
	}
	
	
	// Payment Option Valid code
	@Test
	public void testValidPaymentOption() {
		
		Assertions.assertTrue(PaymentDetailsValidator.validatePaymentOption("UPI"));
		
	}
	
	@Test
	public void testInvalidPaymentOption() {
		
		try {
			
			PaymentDetailsValidator.validatePaymentOption(null);
			Assertions.fail("Validate Payment Option failed");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Payment Option cannot be empty or null", ex.getMessage());
		}
		
	}
	
	// Payment id valid code
	@Test
	public void testValidPaymentId() {
		Assertions.assertTrue(PaymentDetailsValidator.validatePaymentId(121293));
	}	
	
	@Test
	public void testInvalidPaymentId() {
		
		try {
			PaymentDetailsValidator.validatePaymentId(9998);
			Assertions.fail("Validate Payment Id failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Payment id is Invalid: ", ex.getMessage());
		}
		
	}
	
	// Expiry Date Validate code
	@Test
	public void testValidateDueDate(){
		Assertions.assertTrue(PaymentDetailsValidator.expiryDateValidator("09/23"));
	}
	
	
	// Expire Date Invalidate code
	@Test
	void testInvalidDueDate() { 
		try {
			
			PaymentDetailsValidator.expiryDateValidator(null);
			Assertions.fail("Wrong Due Date Validation Failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Expiry Date cannot be empty or null", ex.getMessage());
		}
	}
	
	
	

}
