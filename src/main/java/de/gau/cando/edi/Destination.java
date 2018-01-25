package de.gau.cando.edi;

public interface Destination {

	public Iterable<String> head();
	
	public void send(Message message);
}
