package com.yadneya.restful_web_services.helloworld;

public class NamasteBean {

	private String message;

	public NamasteBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NamasteBean [message=" + message + "]";
	}
	
	
}
