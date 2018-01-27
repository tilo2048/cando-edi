package de.gau.cando.edi.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import de.gau.cando.edi.IMessage;

public class FileMessage implements IMessage {
	private final Map<String,String> header;
	private final File content;
	
	public FileMessage(Map<String,String> header, File content) {
		this.header = header;
		this.content = content;
	}
	
	public Map<String, String> header() {
		Map<String,String> copy = new HashMap<String,String>();
		copy.putAll(this.header);
		return copy;
	}

	public InputStream content() throws IOException {
		return new FileInputStream(this.content);
	}

}
