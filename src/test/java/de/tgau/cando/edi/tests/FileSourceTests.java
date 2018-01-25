package de.tgau.cando.edi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import de.tgau.cando.edi.src.FileSource;
import de.tgau.cando.edi.src.RenamingFileSource;

public class FileSourceTests {

	@Test
	public void test() {
		new FileSource("./input/file").get();
	}
	
	@Test
	public void test2() {
		new RenamingFileSource(new FileSource("./input/file")).get();
	}

}
