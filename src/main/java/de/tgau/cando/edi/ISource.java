package de.tgau.cando.edi;

import java.io.IOException;

public interface ISource {
	
	public IMessage retrieve() throws IOException;

}
