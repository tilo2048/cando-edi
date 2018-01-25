package de.tgau.cando.edi.steps;

import java.io.IOException;
import java.io.InputStream;

import de.tgau.cando.edi.IMessage;
import de.tgau.cando.edi.IStep;

public class SimplePrintingStep implements IStep {

	@Override
	public IMessage process(IMessage message) throws IOException {

		InputStream stream = message.content();
			
		int c;
		while ((c = stream.read()) != -1) {
			System.out.print((char)c);
		}
		
		stream.close();
		return message;
	}

}
