package de.tgau.cando.edi.stores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

public class SimpleFileStore {

	private final String storeLocation;
	
	public SimpleFileStore(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	
	public URI store(File file) throws Exception {
		InputStream in = new FileInputStream(file);
		File outFile = new File(storeLocation+"/id/"+file.getName());
		outFile.createNewFile();
		OutputStream out = new FileOutputStream(outFile);
		byte[] buffer = new byte[1024];
		try{
			while(in.read(buffer) > 0) {
				out.write(buffer);
			}			
		} finally {
			in.close();
			out.close();
		}
		return outFile.toURI();
	}
}
