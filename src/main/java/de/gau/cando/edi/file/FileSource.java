/*
 * MIT License
 * 
 * Copyright (c) 2018 Tilo Gau
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.gau.cando.edi.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.gau.cando.edi.IMessage;
import de.gau.cando.edi.ISource;

public class FileSource implements ISource {

	private final String baseDirectory;
	private final String filePattern;

	public FileSource(String baseDir, String filePattern) {
		this.baseDirectory = baseDir;
		this.filePattern = filePattern;
	}

	public IMessage[] get() throws IOException {
		List<IMessage> messages = new ArrayList<IMessage>();
		Path base = Paths.get(this.baseDirectory);
		DirectoryStream<Path> stream = Files.newDirectoryStream(base, this.filePattern);
		for(Path path:stream) {
			Map<String, String> header = new HashMap<String, String>();
			header.put("path", path.getParent().toString());
			header.put("file", path.getFileName().toString());
			
			messages.add(new FileMessage(header, path.toFile()));
		}
		return messages.toArray(new IMessage[0]);
	}
}
