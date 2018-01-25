package de.tgau.cando.edi;

import java.io.IOException;

public interface ISource {

	public IMessage get() throws IOException;
}
