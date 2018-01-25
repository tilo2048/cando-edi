package de.tgau.cando.edi.messages;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import de.tgau.cando.edi.IMessage;

public class SimpleMessage implements IMessage {

	final public Map<String, String> header;
	final public String content;
	
	public SimpleMessage (String content) {
		this(new HashMap<String, String>(), content);
	}
	
	public SimpleMessage (Map<String, String> header, String content) {
		this.header = header;
		this.content = content;
	}
	
	@Override
	public Map<String, String> header() {
		return this.header;
	}

	@Override
	public InputStream content() {		
		return new ByteArrayInputStream(content.getBytes());
	}

}
