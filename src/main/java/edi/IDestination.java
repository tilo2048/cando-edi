/**
 * LICENSE ...
 */
package edi;

/**
 * Destination for data.
 * 
 * @author Tilo
 */
public interface IDestination {

	/**
	 * Send data.
	 */
	public void send(IMessage msg);
}
