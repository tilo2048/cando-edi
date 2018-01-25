package de.tgau.cando.edi;

import java.io.IOException;

public interface IAction {

	public IMessage perform(IMessage message) throws IOException;
}
