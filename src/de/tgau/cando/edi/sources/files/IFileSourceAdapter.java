package de.tgau.cando.edi.sources.files;

import java.io.File;
import java.io.IOException;

public interface IFileSourceAdapter {
	
	public File actBefore(File file) throws IOException;
	
	public File actAfter(File file) throws IOException;
}
