package de.gau.cando.edi;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileSource implements Source {
	private final List<String> filePatterns = new ArrayList<String>();
	
	public FileSource(String filePattern) {
		this.filePatterns.add(filePattern);
	}
	
	public FileSource(List<String> patterns) {
		this.filePatterns.addAll(patterns);
	}

	public Message receive() throws IOException {
		//Check for some trigger file (optional, to be extracted)
		//Check for some blocking file (optional, to be extracted)
		//Set some blocking file (optional, to be extracted)
		
		//Iterate over file pattern and check for matching files
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("");
		Files.walk(Paths.get(""), null);
		Files.walkFileTree(Paths.get(""),new FileVisitor<Path> () {

			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}

			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}

			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}

			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
		});
				
		//For each matching file
		
		//Rename file to a predefined pattern (to be extracted)
		
		//Create message from file or file content (to be extracted)
		
		//Remove blocking file (to be extracted)
		
		return new Message(){

			public Iterable<String> head() {
				// TODO Auto-generated method stub
				return null;
			}

			public InputStream body() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

	public Iterable<String> head() {
		// TODO Auto-generated method stub
		return null;
	}
}
