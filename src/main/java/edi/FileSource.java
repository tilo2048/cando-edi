/**
 * TODO: License ...
 */
package edi;

/**
 * Reads data from files.
 * 
 * @author Tilo
 */
public class FileSource implements ISource {

	public FileSource(String path, IDestination dest) {
		
	}
	
	//TODO two _different_ constructors!?
	public FileSource(String path, IAdapter adapter) {
		
	}
	
	public IMessage retrieve() {
		//TODO
		return new Message();
	}
}
