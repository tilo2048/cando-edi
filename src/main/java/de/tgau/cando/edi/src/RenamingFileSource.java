package de.tgau.cando.edi.src;

public class RenamingFileSource {
	
	final private FileSource fileSource;

	public RenamingFileSource(FileSource fileSource) {
		this.fileSource = fileSource;
	}
	
	public void get() {
		this.fileSource.get();
	}
}
