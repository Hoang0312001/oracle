package com.message.NotificationService.Model;

public class Message {
	private String Message;
	private String id;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Message [Message=" + Message + ", id=" + id + "]";
	}
	
	
}
