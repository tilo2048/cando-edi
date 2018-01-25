package de.tgau.cando.edi;

import java.io.IOException;

public interface IStep {

	public IMessage process(IMessage message) throws IOException;
}
