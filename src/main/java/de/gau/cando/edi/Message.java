package de.gau.cando.edi;

import java.io.InputStream;

public interface Message {
	
	public Iterable<String> head();
	
	public InputStream body();
}
