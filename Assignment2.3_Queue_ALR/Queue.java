/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class Queue<T> implements QueueInterface<T>{
	/**
	 * Variable Instantiation - LinkedList needed for item storage
	 */
	private GenLinkedList<T> line = new GenLinkedList<T>();
	
	/**
	 * Constructor
	 */
	public Queue() {
		
	}
	/**
	 * Mutator
	 * Enqueue - adds a node to the back of the queue
	 * @param newEntry
	 */
	public void enqueue(T newEntry) {
		
		GenNode<T> queued = new GenNode<T>();
		
		queued.setData(newEntry);
		
		line.addNode(queued);		
	}
	
	/**
	 * Mutator
	 * Dequeue - removes a node from the front of the queue
	 * @return T output
	 */
	public T dequeue() {
		GenNode<T> head = line.removeHead();
		T output = head.getData();
		
		return output;
	}
	
	/**
	 * Accessor
	 * getFront - returns the node at the front of the queue
	 * @return T output
	 */
	public T getFront() {
		GenNode<T> head = line.getList();
		T output = head.getData();
		
		return output;
	}
	
	/**
	 * Command
	 * isEmpty - returns a boolean variable depending on if the queue is empty
	 * @return True if the list is empty, otherwise returns false
	 */
	public boolean isEmpty() {
		return line.isEmpty();
	}
	
	/**
	 * Command
	 * clear - clears the queue
	 */
	public void clear() {
		while(line.getList() != null) {
			line.removeHead();
		}
	}
	/**
	 * Command
	 * toString - converts the LinkedList into a printable format
	 * @return String list
	 */
	public String toString() {
		String list = new String();
		GenNode<T> tempHead = new GenNode<T>();
		for(int count = 0; count <= line.length; count++) {	
			
			list += line.getList();
			
			if(count < line.length) {
				list += ", ";
			}	
			
			tempHead = line.removeHead();
			line.addNode(tempHead);
		}		
		return list;
	}
}
