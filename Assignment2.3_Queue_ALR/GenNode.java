/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class GenNode<T>{
	
	/**
	 * Variable Instantiation
	 */
	T data;
	GenNode<T> nextNode;
	
	/**
	 * Constructor Instantiation
	 */
	public GenNode(){
		nextNode = null;
		data = null;
	}
	
	/**
	 * Mutator 
	 * modifies the data tied to the node
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Accessor
	 * returns the data within the node 
	 * @return T data
	 */
	public T getData() {
		return data;
	}	
	
	/**
	 * Accessor
	 * returns the node itself as a value
	 * @return GenNode this
	 */
	public GenNode<T> getNode() {
		return this;
	}
	
	/**
	 * Accessor
	 * returns the node linked to nextNode 
	 * @return GenNode nextNode
	 */
	public GenNode<T> getNextNode() {
		return nextNode;
	}	
	
	/**
	 * Mutator
	 * sets the target of the current node's pointer
	 * @param nextNode
	 */
	public void setNextNode(GenNode<T >nextNode)
	{
		this.nextNode=nextNode;
	}

	/**
	 * Command
	 * creates a string version of the GenNode
	 * @return String node
	 */
	public String toString(){
		String node = "";
		node += data;
		return node;
	}
	
}
