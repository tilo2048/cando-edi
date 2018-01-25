package de.gau.cando.edi;

public interface Source {

	/**
	 * Returns some information about this source.
	 * 
	 * @return
	 */
	public Iterable<String> head();
		
	/**
	 * Receive one message from this source.
	 * 
	 * @return
	 */
	public Message receive();
}
