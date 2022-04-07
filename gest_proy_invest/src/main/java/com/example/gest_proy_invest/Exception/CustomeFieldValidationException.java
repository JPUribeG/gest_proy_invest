package com.example.gest_proy_invest.Exception;

public class CustomeFieldValidationException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8705422204040872890L;
	private String fieldName;
	
	public CustomeFieldValidationException(String message, String fieldName) {
		super(message);
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}
}