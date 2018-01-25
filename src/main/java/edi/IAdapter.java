/**
 * License ...
 */
package edi;

/**
 * Specific functionality of message processing.
 * 
 * @author Tilo
 */
public interface IAdapter {

	/**
	 * Process a message.
	 */
	public IMessage process (IMessage msg);
}
