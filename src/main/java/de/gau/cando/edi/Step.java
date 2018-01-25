package de.gau.cando.edi;

public interface Step {
	
	public Iterable<String> head();
	
	public Message process (Message message);
}
