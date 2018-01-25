package de.tgau.cando.edi.sources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import de.tgau.cando.edi.IMessage;
import de.tgau.cando.edi.ISource;
import de.tgau.cando.edi.messages.SimpleMessage;

public class FileSource2 implements ISource {

	final private String file;
	
	public FileSource2 (String file) {
		this.file = file;
	}
	
	@Override
	public IMessage get() throws IOException {
		File file = new File(this.file);
		Reader reader = new FileReader(file);
		StringBuilder builder = new StringBuilder();
		
		int c;
		while ((c = reader.read()) != -1) {
			builder.append((char)c);
		}
		reader.close();
		Map<String, String> header = new HashMap<String, String>();
		header.put("directory", file.getPath());
		header.put("file", file.getName());
		
		return new SimpleMessage(header, builder.toString());
	}

}
