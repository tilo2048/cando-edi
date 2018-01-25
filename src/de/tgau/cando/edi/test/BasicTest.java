package de.tgau.cando.edi.test;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import de.tgau.cando.edi.sources.FileSource;
import de.tgau.cando.edi.sources.FileSource2;
import de.tgau.cando.edi.steps.SimplePrintingStep;
import de.tgau.cando.edi.stores.SimpleFileStore;

public class BasicTest {

	@Test
	public static void main (String[] args) throws Exception{
		//impl1 ();
		
		impl2 ();
	}

	private static void impl1 () throws Exception {
		System.out.println(new FileSource("test/file.txt", new SimpleFileStore("store")).read());
	}
	
	private static void impl2 () throws IOException {
		
		new SimplePrintingStep().process(new FileSource2("test/file.txt").get());
	}
}
