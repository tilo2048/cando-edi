package de.tgau.cando.edi.msg;

import de.tgau.cando.edi.IMessage;

public class Message implements IMessage {
	
	private final String id;
	private final String text;
	
	public Message(String id, String text) {
		this.id = id;
		this.text = text;
	}

	public String identify() {
		return id;
	}
	
	public String content() {
		return text;
	}
	
	public Message content(String text) {
		return new Message(this.id, text);
	}
}
