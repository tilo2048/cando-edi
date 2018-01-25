package de.tgau.cando.edi.sources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

import de.tgau.cando.edi.stores.SimpleFileStore;

public class FileSource {

	private final String file;
	private final SimpleFileStore store;
	
	public FileSource(String file, SimpleFileStore store) {
		this.file = file;
		this.store = store;
	}
	
	public String read() throws Exception {
		StringBuilder builder = new StringBuilder();
		File file = new File(this.file);
		
		Reader reader = new FileReader(file);
		
		store.store(file);
		
		char[] buffer = new char[128];
		try {
			while(reader.read(buffer) != -1) {
				builder.append(buffer);
			}
		} finally {
			reader.close();
		}
		return builder.toString();
	}
}
