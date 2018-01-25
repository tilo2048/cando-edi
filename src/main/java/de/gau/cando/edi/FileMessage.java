package de.gau.cando.edi;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

public class FileMessage implements Message {

	public final File file;
	
	public FileMessage(File file) {
		this.file = file;
	}
	
	public Iterable<String> head(){
		return new ArrayList<String>();
	}

	public InputStream body() {
		// TODO Auto-generated method stub
		return null;
	}
}
