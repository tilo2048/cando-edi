package de.gau.cando.edi.file;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import de.gau.cando.edi.IMessage;
import de.gau.cando.edi.ISource;

public class FileSourceTest {

	@Test
	public void testReadingOfFiles() throws IOException {
		ISource source = new FileSource("src/test/resources/files/in", "*.edi");
		IMessage[] messages = source.get();
		assertTrue(messages.length == 3);
	}

}	
