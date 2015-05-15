package org.lab.chat.domain;

public class Message {

	private String email;

	private String text;

	private Long timeStamp = System.currentTimeMillis();

	public Message() {

	}

	public Message(String email, String text) {
		this.email = email;
		this.text = text;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
