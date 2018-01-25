package de.tgau.cando.edi.sources.files;

import java.io.File;
import java.io.IOException;

public class FileSourceAdapterWrapper implements IFileSourceAdapter {
	
	private final IFileSourceAdapter origin;
	
	public FileSourceAdapterWrapper(IFileSourceAdapter adapter) {
		this.origin = adapter;
	}

	@Override
	public File actBefore(File file) throws IOException {
		return this.origin.actBefore(file);
	}

	@Override
	public File actAfter(File file) throws IOException {
		return this.origin.actAfter(file);
	}

}
