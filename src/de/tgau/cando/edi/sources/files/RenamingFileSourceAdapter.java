package de.tgau.cando.edi.sources.files;

import java.io.File;

public class RenamingFileSourceAdapter extends FileSourceAdapterWrapper implements IFileSourceAdapter {

	public RenamingFileSourceAdapter(IFileSourceAdapter origin, String pattern) {
		super(
				new IFileSourceAdapter() {
					
					@Override
					public File actBefore(File file) {
						// TODO Auto-generated method stub
						return new File(file.toURI());
					}
					
					@Override
					public File actAfter(File file) {
						// TODO Auto-generated method stub
						return new File(file.toURI());
					}
				});
	}
}
