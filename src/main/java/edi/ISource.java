/**
 * License ...
 */

package edi;

/**
 * Source of data.
 * 
 * @author Tilo Gau
 */
public interface ISource {

	/**
	 * Retrieve data.
	 */
	public IMessage retrieve();
}
