package de.tgau.cando.edi.src;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

import de.tgau.cando.edi.IMessage;
import de.tgau.cando.edi.ISource;
import de.tgau.cando.edi.msg.Message;

public class FileSource implements ISource {

	private final File file;
	
	public FileSource(String file) {
		this(new File(file));
	}
	
	public FileSource(File file) {
		this.file = file;
	}
	
	public IMessage retrieve () throws IOException {
		char[] 
		return new Message(file.getCanonicalPath(), new FileReader(file).read);
	}
}
