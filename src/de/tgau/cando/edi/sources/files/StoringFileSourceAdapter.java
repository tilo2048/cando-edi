package de.tgau.cando.edi.sources.files;

import java.io.File;
import java.io.IOException;

import de.tgau.cando.edi.stores.SimpleFileStore;

public class StoringFileSourceAdapter extends FileSourceAdapterWrapper implements IFileSourceAdapter {

	public StoringFileSourceAdapter(IFileSourceAdapter origin, SimpleFileStore store) {
		
		super(
				new IFileSourceAdapter() {
					
					@Override
					public File actBefore(File file) throws IOException {
						try {
							store.store(file);
						} catch (Exception e) {
							throw new IOException(e);
						}
						return null;
					}
					
					@Override
					public File actAfter(File file) {
						return file;
					}
				});
	}
}
