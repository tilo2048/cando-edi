/**
 * TODO License ...
 */
package edi;

/**
 * Simply mark a stage in processing
 * 
 * @author Tilo
 */
public class StageAdapter implements IAdapter {

	public StageAdapter(String name, IAdapter adapter) {
		
	}
	
	public StageAdapter(String name, IDestination dest) {
		
	}
	
	public IMessage process(IMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}
}