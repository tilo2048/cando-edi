package de.tgau.cando.edi;

import java.io.InputStream;
import java.util.Map;

public interface IMessage {

	public Map<String, String> header();	
	
	public InputStream content();
}
