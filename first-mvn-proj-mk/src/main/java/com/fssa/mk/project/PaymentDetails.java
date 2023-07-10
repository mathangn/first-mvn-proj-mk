package com.fssa.mk.project;

import java.time.LocalDate;

public class PaymentDetails {
	
	String cardHolder;
	long cardNumber;
	String expiryDate;
	int cvv;
	String paymentOption;
	long paymentId;
	
	
	public String getCardHolder() {
		return cardHolder;
	}
	
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getPaymentOption() {
		return paymentOption;
	}
	
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	public long getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
}
