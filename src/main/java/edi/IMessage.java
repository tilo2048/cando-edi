/**
 * @TODO
 * License 
 */
package edi;

/**
 * Represents some data.
 * 
 * @author Tilo
 *
 */
public interface IMessage {

	/**
	 * Reads some data from the message.
	 * 
	 * @return data
	 */
	public String read();
	
	/**
	 * Returns context of this message.
	 * 
	 * @return context
	 */
	public String[] context();
}
